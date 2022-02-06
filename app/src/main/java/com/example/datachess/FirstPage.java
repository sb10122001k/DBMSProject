package com.example.datachess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class FirstPage extends AppCompatActivity {

    private String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Making notification bar transparent

        setContentView(R.layout.activity_first_page);

        databseCreation();


    }



    public void matchRecordOnClick(View view) {
        Intent intent =new Intent(this,matchRecord.class);
        startActivity(intent);

    }

    public void playerRecordOnClick(View view) {
        Intent intent =new Intent(this,playerList.class);
        startActivity(intent);
    }

    public void newPlayerAdd(View view) {
        Intent intent =new Intent(this,addPlayer.class);
        startActivity(intent);
    }
    public void startGame(View view) {
        Intent intent =new Intent(this,MainActivity.class);
        startActivity(intent);

    }

    private void databseCreation() {

        SQLiteDatabase chessData = this.openOrCreateDatabase("ChessData",MODE_PRIVATE,null);
        chessData.execSQL("CREATE TABLE IF NOT EXISTS PLAYERLIST(PLAYER_NAME VARCHAR(20),PLAYER_MAIL VARCHAR(50) primary Key,AGE INT(3))");
        chessData.execSQL("CREATE TABLE IF NOT EXISTS MATCHRECORD(Match_id int primary Key,white varchar(50) REFERENCES PLAYERLIST(PLAYER_MAIL) ,black varchar(50) REFERENCES PLAYERLIST(PLAYER_MAIL),result VARCHAR(10))");
        chessData.execSQL("CREATE TABLE IF NOT EXISTS PLAYERRECORD(PLAYER_MAIL VARCHAR(50) REFERENCES PLAYERLIST(PLAYER_MAIL)  primary Key," +
                "Match_Played INT(5) ,Match_Won INT(5),Match_Draw INT(5),Tot_Points INT(5))");

        try {
            chessData.execSQL("INSERT INTO PLAYERLIST(PLAYER_NAME,PLAYER_MAIL,AGE) VALUES ('Shubham','shubhamdj@hotmail.com',20)");
        chessData.execSQL("INSERT INTO PLAYERLIST(PLAYER_NAME,PLAYER_MAIL,AGE) VALUES ('Vipul','vipulrockstar@hotmail.com',21)");
        chessData.execSQL("INSERT INTO PLAYERLIST(PLAYER_NAME,PLAYER_MAIL,AGE) VALUES ('vishwesh','vishulnd@gmail.com',20)");
        chessData.execSQL("INSERT INTO PLAYERLIST(PLAYER_NAME,PLAYER_MAIL,AGE) VALUES ('jeevitesh','jimbitensh@gmail.com',19)");
        chessData.execSQL("INSERT INTO PLAYERLIST(PLAYER_NAME,PLAYER_MAIL,AGE) VALUES ('himanshu','himuaaa@gmail.com',25)");
        chessData.execSQL("INSERT INTO PLAYERLIST(PLAYER_NAME,PLAYER_MAIL,AGE) VALUES ('lalli','pyarilimli@gmail.com',24)");
        chessData.execSQL("INSERT INTO PLAYERLIST(PLAYER_NAME,PLAYER_MAIL,AGE) VALUES ('ragini','ramgini@yahoo.com',22)");
        chessData.execSQL("INSERT INTO PLAYERLIST(PLAYER_NAME,PLAYER_MAIL,AGE) VALUES ('rosali','romshamli@yahoo.com',21)");
        chessData.execSQL("INSERT INTO PLAYERLIST(PLAYER_NAME,PLAYER_MAIL,AGE) VALUES ('sneh','snehpadak@yahoo.com',30)");
        chessData.execSQL("INSERT INTO PLAYERLIST(PLAYER_NAME,PLAYER_MAIL,AGE) VALUES ('ananya','amnanya@yahoo.com',18)");
        chessData.execSQL("INSERT INTO PLAYERLIST(PLAYER_NAME,PLAYER_MAIL,AGE) VALUES ('ruchi','rumchi@yahoo.com',08)");
        chessData.execSQL("INSERT INTO PLAYERLIST(PLAYER_NAME,PLAYER_MAIL,AGE) VALUES ('devasish','debumachhiwala@gmail.com',40)");
        chessData.execSQL("INSERT INTO PLAYERLIST(PLAYER_NAME,PLAYER_MAIL,AGE) VALUES ('gaurav','gjava@gmail.com',35)");
        chessData.execSQL("INSERT INTO PLAYERLIST(PLAYER_NAME,PLAYER_MAIL,AGE) VALUES ('aditi','aditi@yahoo.com',12)");
        chessData.execSQL("INSERT INTO PLAYERLIST(PLAYER_NAME,PLAYER_MAIL,AGE) VALUES ('divya prakash raju','dpr@gmail.com',24)");
        chessData.execSQL("INSERT INTO PLAYERLIST(PLAYER_NAME,PLAYER_MAIL,AGE) VALUES ('mayank','lambu@gmail.com',25)");
        chessData.execSQL("INSERT INTO PLAYERLIST(PLAYER_NAME,PLAYER_MAIL,AGE) VALUES ('akanksha','mongu@yahoo.com',22)");
        chessData.execSQL("INSERT INTO PLAYERLIST(PLAYER_NAME,PLAYER_MAIL,AGE) VALUES ('alisha','bail@yahoo.com',20)");
        chessData.execSQL("INSERT INTO PLAYERLIST(PLAYER_NAME,PLAYER_MAIL,AGE) VALUES ('rohit','bhatija@gmail.com',19)");
        chessData.execSQL("INSERT INTO PLAYERLIST(PLAYER_NAME,PLAYER_MAIL,AGE) VALUES ('seema','chotisenior@yahoo.com',11)");

        chessData.execSQL("INSERT INTO MATCHRECORD(Match_id,white,black,result) VALUES (1,'shubhamdj@hotmail.com','vipulrockstar@hotmail.com','Black')");
        chessData.execSQL("INSERT INTO MATCHRECORD(Match_id,white,black,result) VALUES (2,'shubhamdj@hotmail.com','vipulrockstar@hotmail.com','Draw')");
        chessData.execSQL("INSERT INTO MATCHRECORD(Match_id,white,black,result) VALUES (3,'shubhamdj@hotmail.com','vipulrockstar@hotmail.com','Draw')");
        chessData.execSQL("INSERT INTO MATCHRECORD(Match_id,white,black,result) VALUES (4,'jimbitensh@gmail','ramgini@yahoo.com','Black')");
        chessData.execSQL("INSERT INTO MATCHRECORD(Match_id,white,black,result) VALUES (5,'vishulnd@gmail.com','romshamli@yahoo.com','White')");
        chessData.execSQL("INSERT INTO MATCHRECORD(Match_id,white,black,result) VALUES (6,'ramgini@yahoo.com.com','vipulrockstar@hotmail.com','Draw')");
        chessData.execSQL("INSERT INTO MATCHRECORD(Match_id,white,black,result) VALUES (7,'pyarilimli@gmail.com','vishulnd@gmail.com','Black')");
        chessData.execSQL("INSERT INTO MATCHRECORD(Match_id,white,black,result) VALUES (8,'jimbitensh@gmail.com','mongu@yahoo.com','White')");
        chessData.execSQL("INSERT INTO MATCHRECORD(Match_id,white,black,result) VALUES (9,'romshamli@yahoo.com','mongu@yahoo.com','White')");
        chessData.execSQL("INSERT INTO MATCHRECORD(Match_id,white,black,result) VALUES (10,'bail@yahoo.com','pyarilimli@gmail.com','Draw')");
        chessData.execSQL("INSERT INTO MATCHRECORD(Match_id,white,black,result) VALUES (11,'amnanya@yahoo.com','romshamli@yahoo.com.com','White')");
        chessData.execSQL("INSERT INTO MATCHRECORD(Match_id,white,black,result) VALUES (12,'mongu@yahoo.com','jimbitensh@gmail.com','Draw')");
        chessData.execSQL("INSERT INTO MATCHRECORD(Match_id,white,black,result) VALUES (13,'pyarilimli@gmail.com','amnanya@yahoo.com','White')");
        chessData.execSQL("INSERT INTO MATCHRECORD(Match_id,white,black,result) VALUES (14,'vishulnd@gmail.com','mongu@yahoo.com','White')");
        chessData.execSQL("INSERT INTO MATCHRECORD(Match_id,white,black,result) VALUES (15,'bail@yahoo.com','vipulrockstar@hotmail.com','Draw')");
        chessData.execSQL("INSERT INTO MATCHRECORD(Match_id,white,black,result) VALUES (16,'shubhamdj@hotmail.com','pyarilimli@gmail.com.com','Black')");
        chessData.execSQL("INSERT INTO MATCHRECORD(Match_id,white,black,result) VALUES (17,'ramgini@yahoo.com','mongu@yahoo.com','White')");
        chessData.execSQL("INSERT INTO MATCHRECORD(Match_id,white,black,result) VALUES (18,'amnanya@yahoo.com','romshamli@yahoo.com','White')");
        chessData.execSQL("INSERT INTO MATCHRECORD(Match_id,white,black,result) VALUES (19,'mongu@yahoo.com','vipulrockstar@hotmail.com','White')");
        chessData.execSQL("INSERT INTO MATCHRECORD(Match_id,white,black,result) VALUES (20,'jimbitensh@gmail','pyarilimli@gmail.com','White')");
        chessData.execSQL("INSERT INTO MATCHRECORD(Match_id,white,black,result) VALUES (21,'shubhamdj@hotmail.com','amnanya@yahoo.com.com','Draw')");
        chessData.execSQL("INSERT INTO MATCHRECORD(Match_id,white,black,result) VALUES (22,'ramgini@yahoo.com','amnanya@yahoo.com.com','White')");
        chessData.execSQL("INSERT INTO MATCHRECORD(Match_id,white,black,result) VALUES (23,'vishulnd@gmail.com','jimbitensh@gmail','Draw')");


        } catch (Exception exception){
            Log.d(TAG="ABCD","exception:"+exception);
        }

        //chessData.execSQL("INSERT INTO PLAYERRECORD(PLAYER_MAIL,Match_Played,Match_Won,Match_Draw ) VALUES ('vipulrockstar@hotmail.com',20,12,3)");


    }


}
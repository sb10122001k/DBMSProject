package com.example.datachess;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class addPlayer extends AppCompatActivity {

    String fullName,mailId;
    int ageNP;
    EditText nameEditText,ageWeightEditText,mailEditText;
    int a;
    public static final String TAG = "ABCD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_player);


    }

    public void submitbuttonHandler(View view) {
        //a=Integer.parseInt(ageNP);
        SQLiteDatabase chessData = this.openOrCreateDatabase("ChessData",MODE_PRIVATE,null);
        try {
            nameEditText = findViewById(R.id.namesNP);
            fullName = nameEditText.getText().toString();

            ageWeightEditText = findViewById(R.id.ageNP);
            ageNP = Integer.parseInt(ageWeightEditText.getText().toString());
            Log.d(TAG, "onBindViewHolder: "+ageNP+fullName);


            mailEditText = findViewById(R.id.emailNP);
            mailId = mailEditText.getText().toString();

            Log.d(TAG, fullName + "onBindViewHolder:\n "+fullName);
            chessData.execSQL("INSERT INTO PLAYERLIST(PLAYER_NAME,PLAYER_MAIL,AGE) VALUES ('" + fullName + "','" + mailId+ "','"+ageNP+"')");

            Toast.makeText(getApplicationContext(),"Player Added Succesfully",Toast.LENGTH_SHORT).show();
        }catch (Exception exception){
            Log.d(TAG, fullName + "onBindViewHolder:\n "+fullName);
            Toast.makeText(getApplicationContext(),"Email Already Exists",Toast.LENGTH_SHORT).show();

        }

    }
}
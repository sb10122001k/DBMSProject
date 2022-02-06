package com.example.datachess;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class playeInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playe_info);
        String imageUrl = getIntent().getStringExtra("mail_url");
        String nameUrl = getIntent().getStringExtra("name_url");
        SQLiteDatabase chessData = this.openOrCreateDatabase("ChessData",MODE_PRIVATE,null);
        String q= "Select * from Palyerrecord where Player_mail='"+imageUrl+"'";
        int winl,drwl;

        try {
            Cursor c = chessData.rawQuery("SELECT * FROM PLAYERRECORD  where PLAYER_MAIL='"+imageUrl+"'",null);
            c.moveToFirst();
//        //int name=c.getColumnIndex("PLAYER_NAME ");
            int mail=c.getColumnIndex("PLAYER_MAIL");
            int win=c.getColumnIndex("Match_Won");
            int draw=c.getColumnIndex("Match_Draw");
            String mai=c.getString(mail);
             winl=c.getInt(win);
             drwl= c.getInt(draw);
        } catch (Exception exception) {
            winl=0;
            drwl=0;
        }


        TextView pname = (TextView)findViewById(R.id.nameView);
        TextView pmail = (TextView)findViewById(R.id.emailView2);
        Button mw = (Button) findViewById(R.id.matchwon);
        Button md = (Button) findViewById(R.id.matchDrw);
        mw.setText("Match won\n"+winl);
        md.setText("Match Drawn\n"+drwl);
       pmail.setText(imageUrl);
       pname.setText(nameUrl);

    }
}
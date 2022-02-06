package com.example.datachess;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.example.datachess.PlayerList.playerListHelperClass;
import com.example.datachess.PlayerList.playerListRecyclerView;

import java.util.ArrayList;

public class playerList extends AppCompatActivity {

    RecyclerView featurdRecycler;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_list);

        featurdRecycler=findViewById(R.id.playrsListRecyclerView);
        featurdRecycler();
    }

    private void featurdRecycler() {

        featurdRecycler.setHasFixedSize(true);
        ArrayList<playerListHelperClass> playerListHelperClasses =new ArrayList<>();

        SQLiteDatabase chessData = this.openOrCreateDatabase("ChessData",MODE_PRIVATE,null);

        Cursor c = chessData.rawQuery("SELECT * FROM PLAYERLIST",null);
        c.moveToFirst();
        int name=c.getColumnIndex("PLAYER_NAME");
        int mail=c.getColumnIndex("PLAYER_MAIL");
        int age=c.getColumnIndex("AGE");



        while (!c.isAfterLast()){
            playerListHelperClasses.add(new playerListHelperClass(c.getString(name),c.getString(mail),c.getString(age)));
            c.moveToNext();
        }


        adapter= new playerListRecyclerView(playerListHelperClasses,this);
        featurdRecycler.setAdapter(adapter);

    }
}
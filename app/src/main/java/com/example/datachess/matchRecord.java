package com.example.datachess;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

import com.example.datachess.MatchRecord.matchRecordCLass;
import com.example.datachess.MatchRecord.matchrecordRVA;

import java.util.ArrayList;

public class matchRecord extends AppCompatActivity {
    RecyclerView featurdRecycler;
    RecyclerView.Adapter adapter;
    public static final String TAG = "ABCD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_record);

        featurdRecycler=findViewById(R.id.matchRecordRecyclerView);
        featurdRecycler();


    }

    private void featurdRecycler() {

        featurdRecycler.setHasFixedSize(true);


        ArrayList<matchRecordCLass> matchRecordCLasses = new ArrayList<>();

        SQLiteDatabase chessData = this.openOrCreateDatabase("ChessData",MODE_PRIVATE,null);

        Cursor c = chessData.rawQuery("SELECT * FROM MATCHRECORD",null);
        c.moveToFirst();

        int slnoNum=c.getColumnIndex("Match_id");
        int player1mail=c.getColumnIndex("white");
        int player2mail=c.getColumnIndex("black");
        int matchRes=c.getColumnIndex("result");

        while (!c.isAfterLast()){
            matchRecordCLasses.add(new matchRecordCLass(c.getInt(slnoNum),c.getString(player1mail),c.getString(player2mail),c.getString(matchRes)));
            c.moveToNext();
        }




        adapter=new matchrecordRVA(matchRecordCLasses);
        featurdRecycler.setAdapter(adapter);
    }


}
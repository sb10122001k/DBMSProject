package com.example.datachess;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TableLayout;

import java.util.ArrayList;

public class matchRecord extends AppCompatActivity {
    RecyclerView featurdRecycler;
    RecyclerView.Adapter adapter;
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
        matchRecordCLasses.add(new matchRecordCLass(1,"Shubham","Vipul","Shubham"));
        matchRecordCLasses.add(new matchRecordCLass(1,"Shubham","Vipul","Shubham"));
        matchRecordCLasses.add(new matchRecordCLass(1,"Shubham","Vipul","Shubham"));
        matchRecordCLasses.add(new matchRecordCLass(1,"Shubham","Vipul","Shubham"));

        adapter=new matchrecordRVA(matchRecordCLasses);
        featurdRecycler.setAdapter(adapter);
    }


}
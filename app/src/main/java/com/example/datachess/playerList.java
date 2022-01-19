package com.example.datachess;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

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
        playerListHelperClasses.add(new playerListHelperClass("Shubham","Shubham@gmail.com","21Yrs"));
        playerListHelperClasses.add(new playerListHelperClass("Shubham","Shubham@gmail.com","21Yrs"));
        playerListHelperClasses.add(new playerListHelperClass("Shubham","Shubham@gmail.com","21Yrs"));

        adapter= new playerListRecyclerView(playerListHelperClasses);
        featurdRecycler.setAdapter(adapter);

    }
}
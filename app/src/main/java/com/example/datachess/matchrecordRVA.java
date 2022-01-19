package com.example.datachess;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static androidx.recyclerview.widget.RecyclerView.*;

public class matchrecordRVA extends RecyclerView.Adapter<matchrecordRVA.matchRecordViewHolder>{

    ArrayList<matchRecordCLass> matchRecords;
    public static final String TAG = "ABCD";

    public matchrecordRVA(ArrayList<matchRecordCLass> matchRecords) {
        this.matchRecords = matchRecords;
    }

    @NonNull
    @Override
    public matchRecordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.matchrecordlistview,parent,false);
        matchRecordViewHolder matchRecordViewHolder= new matchRecordViewHolder(view);
        return  matchRecordViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull matchRecordViewHolder holder, int position) {

        matchRecordCLass matchRecordCLass=matchRecords.get(position);

        Log.d(TAG, "onBindViewHolder: "+matchRecordCLass.toString());

        String slnoStr = String.valueOf(matchRecordCLass.getSlno());
        String p1 = matchRecordCLass.getPlayer1Name();
        String p2 = matchRecordCLass.getPlayer2Name();
        String result = matchRecordCLass.getResult();

        holder.slno.setText(slnoStr);
        holder.Player1.setText(p1);
        holder.Player2.setText(p2);
        holder.Result.setText(result);

    }

    @Override
    public int getItemCount() {
       return matchRecords.size();
    }


    public static class matchRecordViewHolder extends RecyclerView.ViewHolder{

        TextView slno,Player1,Player2,Result;


        public matchRecordViewHolder(@NonNull View itemView) {
            super(itemView);

            slno=itemView.findViewById(R.id.matchNum);
            Player1=itemView.findViewById(R.id.player1);
            Player2=itemView.findViewById(R.id.player2);
            Result=itemView.findViewById(R.id.Result);
        }
    }
}

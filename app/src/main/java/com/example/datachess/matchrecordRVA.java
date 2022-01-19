package com.example.datachess;

import android.content.Context;
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
        holder.slno.setText(matchRecordCLass.getSlno());
        holder.Player1.setText(matchRecordCLass.getPlayer1Name());
        holder.Player2.setText(matchRecordCLass.getPlayer2Name());
        holder.Result.setText(matchRecordCLass.getResult());

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

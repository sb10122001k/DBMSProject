package com.example.datachess.PlayerList;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.datachess.MatchRecord.matchrecordRVA;
import com.example.datachess.R;

import java.util.ArrayList;

public class playerListRecyclerView extends RecyclerView.Adapter<playerListRecyclerView.playerListviewHolder> {
    ArrayList<playerListHelperClass> featureLoc;
    public static final String TAG = "ABCD";

    public playerListRecyclerView(ArrayList<playerListHelperClass> featureLoc) {
        this.featureLoc = featureLoc;
    }

    @NonNull
    @Override
    public playerListviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.playerlist,parent,false);
        playerListRecyclerView.playerListviewHolder plViewHolder= new playerListRecyclerView.playerListviewHolder(view);
        return  plViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull playerListviewHolder holder, int position) {
        playerListHelperClass playerListHelperClass= featureLoc.get(position);

        Log.d(TAG, "onBindViewHolder: "+playerListHelperClass.toString());
        Log.d(TAG,"hi its me");

        String namep = playerListHelperClass.getName();
        String mailp = playerListHelperClass.getPmail();
        String agep = playerListHelperClass.getPage();

        holder.name.setText(namep);
        holder.mail.setText(mailp);
        holder.age.setText(agep);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class playerListviewHolder extends RecyclerView.ViewHolder{

        TextView name,mail,age;

        public playerListviewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.playerNamePl);
            mail=itemView.findViewById(R.id.playermailPl);
            age=itemView.findViewById(R.id.playerAgePl);

        }
    }

}

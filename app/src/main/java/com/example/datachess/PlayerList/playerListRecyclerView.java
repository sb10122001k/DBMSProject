package com.example.datachess.PlayerList;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.datachess.MatchRecord.matchrecordRVA;
import com.example.datachess.R;
import com.example.datachess.matchRecord;
import com.example.datachess.playeInfo;

import java.util.ArrayList;

public class playerListRecyclerView extends RecyclerView.Adapter<playerListRecyclerView.playerListviewHolder> {
    ArrayList<playerListHelperClass> featureLoc;
    public static final String TAG = "ABCD";
    private Context mContext;


    public playerListRecyclerView(ArrayList<playerListHelperClass> featureLoc,Context context) {
        this.featureLoc = featureLoc;
        this.mContext=context;
    }

    @NonNull
    @Override
    public playerListviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.playerlist,parent,false);
        playerListRecyclerView.playerListviewHolder plViewHolder= new playerListRecyclerView.playerListviewHolder(view);
        Log.d(TAG,"hi its me");
        return  plViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull playerListviewHolder holder, int position) {
        playerListHelperClass playerListHelperClass= featureLoc.get(position);


        String namep = playerListHelperClass.getName();
        String mailp = playerListHelperClass.getPmail();
        String agep = playerListHelperClass.getPage();

        holder.name.setText(namep);
        holder.mail.setText(mailp);
        holder.age.setText(agep);
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(mContext, playeInfo.class);
                intent.putExtra("mail_url", mailp);
                intent.putExtra("name_url", namep);
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return featureLoc.size();
    }

    public class playerListviewHolder extends RecyclerView.ViewHolder {


        TextView name,mail,age;
        RelativeLayout parentLayout;

        public playerListviewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.playerNamePl);
            mail=itemView.findViewById(R.id.playermailPl);
            age=itemView.findViewById(R.id.playerAgePl);
            parentLayout = itemView.findViewById(R.id.parent_layout);

        }


    }

}

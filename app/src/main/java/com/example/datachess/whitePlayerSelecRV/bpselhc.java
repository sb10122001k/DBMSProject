package com.example.datachess.whitePlayerSelecRV;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.datachess.MainActivity;
import com.example.datachess.PlayerList.playerListHelperClass;
import com.example.datachess.R;

import java.util.ArrayList;

public class bpselhc extends RecyclerView.Adapter<wpselhc.playerListviewHolderLp> {

    ArrayList<playerListHelperClass> featureLoc;
    MainActivity ma;
    // Context context=ma;
    public static final String TAG ="ABCd";
    public bpselhc(ArrayList<playerListHelperClass> featureLoc, MainActivity mainActivity) {
        this.featureLoc = featureLoc;
        this.ma=mainActivity;
    }


    @NonNull
    @Override
    public wpselhc.playerListviewHolderLp onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.playerselclis,parent,false);
        wpselhc.playerListviewHolderLp plViewHolder= new wpselhc.playerListviewHolderLp(view);
        //Log.d(TAG,"hi its me");
        return  plViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull wpselhc.playerListviewHolderLp holder, int position) {
        playerListHelperClass playerListHelperClass= featureLoc.get(position);
        //ma = (MainActivity)context;

        // Log.d(TAG, "onBindViewHolder: "+playerListHelperClass.toString());
        //Log.d(TAG,"hi its me");

        String namep = playerListHelperClass.getName();
        String mailp = playerListHelperClass.getPmail();
        String agep = playerListHelperClass.getPage();

        holder.name.setText(namep);
        holder.mail.setText(mailp);
        holder.age.setText(agep);
        holder.whplselec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("new","\n\n\n\n\n\n\n\n\n hiiiiii"+namep);
                Log.d("new","\n\n\n\n\n\n\n\n\n hiiiiii"+mailp);
                if(mailp!=null){
                    //String d= mailp.toString();
                    Toast.makeText(ma, " "+mailp, Toast.LENGTH_SHORT).show();
                    ma.g(mailp);
                }
                else {Toast.makeText(ma, " a,snfjasjf", Toast.LENGTH_SHORT).show();
                }    }
        });
    }

    @Override
    public int getItemCount() {
        return featureLoc.size();
    }

    public static class playerListviewHolderLp extends RecyclerView.ViewHolder{


        TextView name,mail,age;
        RelativeLayout whplselec;

        public playerListviewHolderLp(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.playerNamePlSel);
            mail=itemView.findViewById(R.id.playermailPlSel);
            age=itemView.findViewById(R.id.playerAgePlSel);
            whplselec=itemView.findViewById(R.id.wplsel);

        }
    }
}

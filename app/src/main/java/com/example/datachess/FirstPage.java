package com.example.datachess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class FirstPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Making notification bar transparent

        setContentView(R.layout.activity_first_page);


    }

    public void matchRecordOnClick(View view) {
        Intent intent =new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}
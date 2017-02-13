package com.allstarproject.cs2340.allstarwatercrowdsourcingapp.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


import com.allstarproject.cs2340.allstarwatercrowdsourcingapp.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogout = (Button) findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
        startActivity(intent);
    }
}

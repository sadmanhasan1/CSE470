package com.sakib635.sakibsfoodvalley.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sakib635.sakibsfoodvalley.R;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        //Remove action title bar
        getSupportActionBar().hide();
    }
}
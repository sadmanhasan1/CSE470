package com.sakib635.sakibsfoodvalley.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sakib635.sakibsfoodvalley.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Remove action title bar
        getSupportActionBar().hide();
    }
}
package com.example.databaseapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addUser(View view) {
        Intent intent = new Intent(this, Save.class);
        startActivity(intent);
    }

    public void viewUser(View view) {
        Intent intent = new Intent(this, Load.class);
        startActivity(intent);
    }
}
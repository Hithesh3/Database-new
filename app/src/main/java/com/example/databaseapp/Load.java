package com.example.databaseapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Load extends AppCompatActivity {
    TextView tvLoad;
    DatabaseAdapter databaseAdapter = new DatabaseAdapter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);

        tvLoad = (TextView) findViewById(R.id.tvLoad);

        String data = databaseAdapter.getData();
        if (data.isEmpty()) {
            tvLoad.setText("No Data Found");
        } else {
            tvLoad.setText(data);
        }
    }
}
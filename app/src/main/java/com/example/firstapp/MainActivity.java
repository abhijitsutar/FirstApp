package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView txtview = new TextView(this);
        txtview.setText("hello android ! ");
        txtview.setTextSize(50);
        setContentView(txtview);

        //setContentView(R.layout.activity_main);
    }
}
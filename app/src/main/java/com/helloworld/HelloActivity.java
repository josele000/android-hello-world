package com.helloworld;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        String msg = getIntent().getStringExtra("msgHello");
        TextView tvHello = findViewById(R.id.tvHello);
        Log.e("debug",msg);
        tvHello.setText(msg);


    }
}

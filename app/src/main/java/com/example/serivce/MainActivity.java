package com.example.serivce;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Button start,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=findViewById(R.id.start);
        stop=findViewById(R.id.stop);

        start.setOnClickListener(v -> startService(new Intent(MainActivity.this, Music.class)));
        stop.setOnClickListener(v -> stopService(new Intent(MainActivity.this, Music.class)));


    }
}
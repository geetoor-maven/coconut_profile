package com.example.hello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Angkatan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angkatan);
        final Button angkatan10 = (Button) findViewById(R.id.angkatan10);
        angkatan10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent K = new Intent(getApplicationContext(),Angkatan10.class);
                startActivity(K);
            }
        });


        final Button angkatan9 = (Button) findViewById(R.id.angkatan9);
        angkatan9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent K = new Intent(getApplicationContext(),Angkatan9.class);
                startActivity(K);
            }
        });

        final Button angkatan8 = (Button) findViewById(R.id.angkatan8);
        angkatan8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent K = new Intent(getApplicationContext(),Angkatan8.class);
                startActivity(K);
            }
        });

        final Button angkatan7 = (Button) findViewById(R.id.angkatan7);
        angkatan7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent K = new Intent(getApplicationContext(),angkatan7.class);
                startActivity(K);
            }
        });

        final Button angkatan6 = (Button) findViewById(R.id.angkatan6);
        angkatan6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent K = new Intent(getApplicationContext(),Angkatan6.class);
                startActivity(K);
            }
        });

        final Button angkatan5 = (Button) findViewById(R.id.angkatan5);
        angkatan5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent K = new Intent(getApplicationContext(),angkatan5.class);
                startActivity(K);
            }
        });

        final Button angkatan4 = (Button) findViewById(R.id.angkatan4);
        angkatan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent K = new Intent(getApplicationContext(),Angkatan4.class);
                startActivity(K);
            }
        });
        final Button angkatan3 = (Button) findViewById(R.id.angkatan3);
        angkatan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent K = new Intent(getApplicationContext(),Angkatan3.class);
                startActivity(K);
            }
        });
        final Button angkatan2 = (Button) findViewById(R.id.angkatan2);
        angkatan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent K = new Intent(getApplicationContext(),Angkatan2.class);
                startActivity(K);
            }
        });

        final Button angkatan1 = (Button) findViewById(R.id.angkatan1);
        angkatan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent K = new Intent(getApplicationContext(),Angkatan1.class);
                startActivity(K);
            }
        });
    }
}

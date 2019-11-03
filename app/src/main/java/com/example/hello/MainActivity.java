package com.example.hello;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button angkatan = (Button) findViewById(R.id.angkatan);
        angkatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent K = new Intent(getApplicationContext(),Angkatan.class);
                startActivity(K);
            }
        });
        final Button pendiri = (Button) findViewById(R.id.pendiri);
        pendiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent U = new Intent(getApplicationContext(),pendiri.class);
                startActivity(U);
            }
        });

        final Button visimisi = (Button) findViewById(R.id.visimisi);
        visimisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A = new Intent(getApplicationContext(),Visimisi.class);
                startActivity(A);
            }
        });
        final Button tentang = (Button) findViewById(R.id.tentang);
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View argo) {

                Intent I = new Intent(getApplicationContext(), Tentang.class);
                startActivity(I);

            }
        });


    }

}

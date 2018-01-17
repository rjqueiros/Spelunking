package com.example.kris.spelunking;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        {
            SharedPreferences weapon = getApplicationContext().getSharedPreferences("playerWPN", MODE_PRIVATE);
            String name = weapon.getString("weapon", "");

        TextView x = findViewById(R.id.txtIntro);
        x.setText("wep:" + name);
        }
        Button buttoni0 = findViewById(R.id.buttoni0);

        buttoni0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), South.class);
                startActivity(startIntent);
            }
        });
    }
}
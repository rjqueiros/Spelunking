package com.example.kris.spelunking;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button button0 = findViewById(R.id.button0);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), Intro.class);
                startActivity(startIntent);

            }
        });
         {
            SharedPreferences weapon = getApplicationContext().getSharedPreferences("playerWPN", MODE_PRIVATE);
            SharedPreferences.Editor editor = weapon.edit();
            editor.putString("weapon", "knife".toString());
            editor.apply();
        }
        {
            SharedPreferences hp = getApplicationContext().getSharedPreferences("plrHP", MODE_PRIVATE);
            SharedPreferences.Editor editor = hp.edit();
            editor.putInt("playerHP", 10);
            editor.apply();
        }
    }
}



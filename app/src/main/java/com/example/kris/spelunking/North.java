package com.example.kris.spelunking;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class North extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_intro);
            Button buttonn0 = findViewById(R.id.buttoni0);
            TextView x = findViewById(R.id.txtIntro);
            x.setText("you rest\n\n++HP");

        {
            SharedPreferences hp = getApplicationContext().getSharedPreferences("plrHP", MODE_PRIVATE);
            SharedPreferences.Editor editor = hp.edit();
            editor.putInt("playerHP", 10);
            editor.apply();
        }

            buttonn0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent startIntent = new Intent(getApplicationContext(), Intersection.class);
                    startActivity(startIntent);
                }
            });
        }
    }


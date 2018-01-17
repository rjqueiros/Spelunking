package com.example.kris.spelunking;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Intersection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intersection);
        Button buttonint0 = findViewById(R.id.buttonint0);
        Button buttonint1 = findViewById(R.id.buttonint1);
        Button buttonint2 = findViewById(R.id.buttonint2);
        Button buttonint3 = findViewById(R.id.buttonint3);

        {
            SharedPreferences weapon = getApplicationContext().getSharedPreferences("playerWPN", MODE_PRIVATE);
            String name = weapon.getString("weapon", "");

            TextView x = findViewById(R.id.txtIntersection);
            x.setText("wep:" + name);
        }

        buttonint0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), North.class);
                startActivity(startIntent);

            }
        });
        buttonint1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), East.class);
                startActivity(startIntent);

            }
        });
        buttonint2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), West.class);
                startActivity(startIntent);

            }
        });
        buttonint3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), South.class);
                startActivity(startIntent);

            }
        });
    }
}
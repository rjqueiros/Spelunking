package com.example.kris.spelunking;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FightGoblin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_west);
        Button buttonw0 = findViewById(R.id.buttonw0);

        {
            SharedPreferences goblinHP = getApplicationContext().getSharedPreferences("gobHP", MODE_PRIVATE);
            int pts = goblinHP.getInt("goblinHP", 0);

            SharedPreferences playerHP = getApplicationContext().getSharedPreferences("plrHP", MODE_PRIVATE);
            int ptsplr = playerHP.getInt("playerHP", 0);

            TextView x = findViewById(R.id.txtWest);
            x.setText("gob hp: " + pts + "\n\nplayerhp: " + ptsplr);
        }

        Button buttonw1 = findViewById(R.id.buttonw1);
        buttonw0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), FightGoblin.class);
                startActivity(startIntent);

            }
        });
        buttonw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), Intersection.class);
                startActivity(startIntent);

            }
        });
    }
}

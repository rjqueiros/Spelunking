package com.example.kris.spelunking;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class West extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_west);

        {
            SharedPreferences hp = getApplicationContext().getSharedPreferences("gobHP", MODE_PRIVATE);
            SharedPreferences.Editor editor = hp.edit();
            editor.putInt("goblinHP", 15);
            editor.apply();
        }

        Button buttonw0 = findViewById(R.id.buttonw0);
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

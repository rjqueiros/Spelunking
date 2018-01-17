package com.example.kris.spelunking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class South extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_south);
        Button buttons0 = findViewById(R.id.buttons0);
        Button buttons1 = findViewById(R.id.buttons1);
        Button buttons2 = findViewById(R.id.buttons2);
        buttons0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TalkOrc.class);
                startActivity(startIntent);

            }
        });
        buttons1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), FightOrc.class);
                startActivity(startIntent);

            }
        });
        buttons2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), Intersection.class);
                startActivity(startIntent);

            }
        });
    }
}

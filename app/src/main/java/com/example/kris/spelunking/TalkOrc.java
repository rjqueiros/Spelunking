package com.example.kris.spelunking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TalkOrc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        Button buttonii0 = findViewById(R.id.buttoni0);
        TextView x = findViewById(R.id.txtIntro);
        x.setText("orc says bla");

        buttonii0.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        Intent startIntent = new Intent(getApplicationContext(), South.class);
        startActivity(startIntent);
        }
        });
        }
        }
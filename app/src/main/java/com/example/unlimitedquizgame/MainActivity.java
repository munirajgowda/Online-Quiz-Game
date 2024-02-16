package com.example.unlimitedquizgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.unlimitedquizgame.Activities.SetsActivity;

public class MainActivity extends AppCompatActivity {

    CardView history, science;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        history = findViewById(R.id.history);
        science = findViewById(R.id.science);

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this, SetsActivity.class);
                startActivity(intent);
            }
        });
    }
}
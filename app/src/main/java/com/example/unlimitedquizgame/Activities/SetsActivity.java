package com.example.unlimitedquizgame.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.unlimitedquizgame.MainActivity;
import com.example.unlimitedquizgame.R;

public class SetsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sets);

        getSupportActionBar().hide();
    }
}
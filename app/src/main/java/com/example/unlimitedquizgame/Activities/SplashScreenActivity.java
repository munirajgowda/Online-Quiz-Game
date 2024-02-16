package com.example.unlimitedquizgame.Activities;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.unlimitedquizgame.MainActivity;
import com.example.unlimitedquizgame.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();
        long delayMillis;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            Intent intent=new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }, delayMillis= 2000);
    }
}
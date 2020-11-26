package com.example.quizrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            final int SPLASH_TIME_OUT = 5000; //the timing is 5 seconds
            setContentView(R.layout.splash);
            //now we create the handler : what will count the time in my device
            //post delayed checks for a timing before executing a function
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    //dictate where to move next
                    Intent dash = new Intent(com.example.quizrecyclerview.SplashScreen.this, RecyclerView.class);
                    startActivity(dash);
                }
            },SPLASH_TIME_OUT);
        }
}

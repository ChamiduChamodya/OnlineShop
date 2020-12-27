package com.nibm201.onlineshop.Startup;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import com.nibm201.onlineshop.R;

public class SplashScreen extends AppCompatActivity {
    private ProgressBar progressBar;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //screen portrait
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_splash_screen);

        //Hooks
        progressBar = findViewById(R.id.prograss_bar);

        //ProgressBar handle
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (i <= 100) {
                    progressBar.setProgress(i);
                    i++;
                    handler.postDelayed(this, 40);
                } else {
                    //Start Menu Intent
                    startActivity(new Intent(
                            SplashScreen.this
                            , LoginScreen.class)
                            .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
                    finish();
                }
            }
        }, 200);
    }
}
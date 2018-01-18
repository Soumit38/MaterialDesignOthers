package com.example.soumit.materialdesignothers;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class MaterialProgressBar extends AppCompatActivity {

    ProgressBar progressBar,progressBarLinear;
    Handler handler;
    Runnable runnable;
    Timer timer;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_progress_bar);

        progressBar = (ProgressBar) findViewById(R.id.progressbar_id);
        progressBar.setVisibility(View.VISIBLE);

        progressBarLinear = (ProgressBar) findViewById(R.id.progressbar_linear_id);
        progressBarLinear.setVisibility(View.VISIBLE);
        progressBarLinear.setProgress(20);
        progressBarLinear.setMax(100);
        progressBarLinear.setSecondaryProgress(0);

        handler = new Handler();

        runnable = new Runnable() {
            @Override
            public void run() {

                if(++i<100){
                    progressBarLinear.setProgress(i);
                    progressBarLinear.setSecondaryProgress(i+10);
                }else {
                    timer.cancel();
                }

//                timer.cancel();
//                progressBar.setVisibility(View.GONE);
            }
        };

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(runnable);
            }
        },8000, 1000);

    }
}

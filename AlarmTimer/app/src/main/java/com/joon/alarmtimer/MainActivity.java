package com.joon.alarmtimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;


public class MainActivity extends AppCompatActivity {

    ImageView img;
    TextView time;
    TextView inputtime;
    Button btn1;
    Button btn2;
    int sec;
    CountDownTimer countDownTimer;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.img);
        time = findViewById(R.id.time);
        inputtime = findViewById(R.id.inputtime);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

         mp = MediaPlayer.create(MainActivity.this,R.raw.alarm);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sec = Integer.parseInt(inputtime.getText().toString().trim());
                countDownTimer = new CountDownTimer(sec*1000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        int remainingTime = (int)millisUntilFinished / 1000;
                        time.setText(""+remainingTime);
                    }

                    @Override
                    public void onFinish() {
                        mp.start();
                        YoYo.with(Techniques.Tada)
                                .duration(700)
                                .repeat(5)
                                .playOn(findViewById(R.id.img));

                    }
                };
                time.setText(""+sec);
                countDownTimer.start();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.cancel();
                time.setText(""+sec);
            }
        });
    }
}



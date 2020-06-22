package com.joon.fingerspeed;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.joon.fingerspeed.R;

public class MainActivity extends AppCompatActivity {

    public static final int TAB_COUNT = 100;

    TextView time;
    TextView score;
    Button btn;
    int remainingTime;
    TextView cheat;

    int tap = TAB_COUNT;
    long min = 10000;
    int minu = 1000;

    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        time = findViewById(R.id.time);
        score = findViewById(R.id.score);
        btn = findViewById(R.id.btn);
        cheat = findViewById(R.id.cheat);

        countDownTimer = new CountDownTimer(min,minu){
            @Override
            public void onTick(long millisUntilFinished) {
                // txtTimer.setText("Time :"+ millisUntilFinished / 1000);
                remainingTime = (int)millisUntilFinished / 1000;
                time.setText(remainingTime + " 초");

                cheat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tap = tap -10;
                        score.setText(""+tap);

                        if(tap <=0){
                            countDownTimer.cancel();
                            score.setText(""+0);
                            long timer = (min/1000) - remainingTime;
                            String message = "기록은 " +timer+ " 초 입니다. 다시 도전하시겠습니까?";
                            showMyAlert("성공", message);
                        }
                    }
                });
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // 1. 타이머 남은 시간이 0인지 체크해서, 0이면 아래 실행 안하면 된다.
                        // 2. 탭수가 0인지 체크해서, 0이면 아래로 실행 안하면 된다.
                        // 3. 숫자 감소시키고
                        // 4. 감소된 숫자를 화면에 표시
                        if (remainingTime == 0){
                            return;
                        }
                        if(tap == 0){
                            return;
                        }
                        tap = tap - 1;
                        score.setText(""+tap);

                        if(tap == 0){
                            countDownTimer.cancel();
                            long timer = (min/1000) - remainingTime;
                            Toast.makeText(MainActivity.this,"성공하셨습니다.",Toast.LENGTH_SHORT).show();
                            String message = "기록은 " +timer+ " 초 입니다. 다시 도전하시겠습니까?";
                            showMyAlert("성공", message);
                        }

                    }

//                        if (txtCount == 0){
//                        Toast.makeText(MainActivity.this,"성공하였습니다.",Toast.LENGTH_SHORT).show();
//                        cancel();
//                        btnTap.setEnabled(false);// 버튼 비활성화
//                    }
                });
            }

            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this,"시간이 종료 되었습니다.",Toast.LENGTH_SHORT).show();
                time.setText("done!");
                if ( tap > 0){
                    showMyAlert("실패", "다시도전하시겠습니까?");
                }
            }
        };
        countDownTimer.start();
        score.setText(""+tap);
    }


    void showMyAlert(String title,String message){
        AlertDialog.Builder failAlert = new AlertDialog.Builder(MainActivity.this);
        failAlert.setTitle(title);
        failAlert.setMessage(message);
        failAlert.setPositiveButton("예", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                tap = TAB_COUNT;
                score.setText("" + tap);
                countDownTimer.start();
            }
        });
        failAlert.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        failAlert.setCancelable(false);
        failAlert.show();
    }
}
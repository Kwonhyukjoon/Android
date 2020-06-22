package com.joon.calculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView Percent;
    TextView Number;
    Button btn;
    TextView Result;
    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Percent = findViewById(R.id.Percent);
        Number = findViewById(R.id.Number);
        btn = findViewById(R.id.btn);
        Result = findViewById(R.id.Result);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                if(Percent.getText().length() == 0 || Number.getText().length() == 0) {
//                    Toast.makeText(MainActivity.this,"둘다 입력하세요.",Toast.LENGTH_SHORT).show();
//                    return;
//                }

                String percent = Percent.getText().toString();
                String number = Number.getText().toString();
                float result = Float.valueOf(percent) * Float.valueOf(number) / 100;
                score = score + 1;

                if (percent.isEmpty() || number.isEmpty()) {
                    Toast.makeText(MainActivity.this, "둘다 입력하세요.", Toast.LENGTH_SHORT).show();
                    return;
                }


                if (score >= 5) {
                    AlertDialog.Builder quizAlert = new AlertDialog.Builder(MainActivity.this);
                    quizAlert.setTitle(R.string.Title);
                    quizAlert.setMessage(R.string.Message);
                    quizAlert.setPositiveButton(R.string.Postive, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // 앱을 종료시키는 코드
                            finish();
                        }
                    });

                    // 유저가 화면의 다른 곳을 눌러도, 알러트다이알로그가 없어지지 않게 한다.
                    quizAlert.setCancelable(false);
                    quizAlert.show();
                    return;
                }
                Result.setText("" + result);
            }
        });

        }
    }


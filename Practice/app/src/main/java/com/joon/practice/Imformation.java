package com.joon.practice;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class Imformation extends AppCompatActivity {

    ImageView img;
    Button btn1;
    Button btn2;
    Button btn3;
    int turtle = R.drawable.animals;
    int rabbit = R.drawable.rabbit;

    String email;
    String pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imformation);

        img = findViewById(R.id.img);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        email = getIntent().getStringExtra("email");
        pwd = getIntent().getStringExtra("pwd");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(rabbit);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(turtle);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            Intent i = new Intent(Imformation.this,Congrutualation.class);
            @Override
            public void onClick(View v) {

                AlertDialog.Builder agreeAlert = new AlertDialog.Builder(Imformation.this);
                agreeAlert.setTitle("회원가입 완료");
                agreeAlert.setMessage("완료하시겠습니까?");
                agreeAlert.setPositiveButton("예", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        i.putExtra("email",email);
                        i.putExtra("pwd",pwd);
                        Log.i("email" ,email);
                        startActivity(i);
                        finish();
                    }
                });
                agreeAlert.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                agreeAlert.setCancelable(false);
                agreeAlert.show();

            }
        });



    }



}

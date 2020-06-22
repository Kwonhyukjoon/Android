package com.joon.practice;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Congrutualation extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.congul);

        textView = findViewById(R.id.textView);
        String email = getIntent().getStringExtra("email");
        String pwd = getIntent().getStringExtra("pwd");
        textView.setText(email + " 님의 가입을 축하드립니다."+pwd);

        // 이메일과 패스워드를, 쉐어드 프리퍼런스에 저장한다.
        SharedPreferences sp = getSharedPreferences("sp_prefs",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("email",email);
        editor.putString("pwd",pwd);
        editor.apply();

    }


}

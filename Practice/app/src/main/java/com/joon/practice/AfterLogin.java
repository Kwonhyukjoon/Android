package com.joon.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AfterLogin extends AppCompatActivity {

    TextView txtValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);

        txtValue = findViewById(R.id.txtValue);

        Intent i = getIntent();
        String txtvalue = i.getStringExtra("email");
        txtValue.setText(txtvalue+" 님의 로그인을 축하드립니다.");


    }
}

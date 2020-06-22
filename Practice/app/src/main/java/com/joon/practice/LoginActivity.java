package com.joon.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    TextView idtxt;
    TextView pwdtxt;
    Button logincom;
    CheckBox checkAutoLogin;

    String savedEmail;
    String savedPwd;

    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        idtxt = findViewById(R.id.idtxt);
        pwdtxt = findViewById(R.id.pwdtxt);
        logincom = findViewById(R.id.logincom);
        checkAutoLogin = findViewById(R.id.checkAutoLogin);

        sp = getSharedPreferences("sp_prefs",MODE_PRIVATE);
        savedEmail = sp.getString("email",null);
        savedPwd = sp.getString("pwd",null);

        logincom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = idtxt.getText().toString().trim();
                String pwd = pwdtxt.getText().toString().trim();
                // 자동로그인 정보를 가져온다. 체크박스에서 가져온다. 체크되었는지, 안되었는지.
                if(checkAutoLogin.isChecked()){
                    SharedPreferences.Editor editor = sp.edit();
                    editor.putBoolean("auto_login",true);
                    editor.apply();
                }else {
                    SharedPreferences.Editor editor = sp.edit();
                    editor.putBoolean("auto_login",false);
                    editor.apply();
                }
                if (savedEmail !=null && savedPwd !=null && savedEmail.equals(email) && savedPwd.equals(pwd)){
                    Intent i = new Intent(LoginActivity.this,AfterLogin.class);
                    i.putExtra("email",email);
                    startActivity(i);
                    finish();
                }else {
                    Toast.makeText(LoginActivity.this,"이메일이나 비밀번호를 확인해 주세요.",Toast.LENGTH_SHORT).show();
                    return;
                }
                Log.i("emailid" , email);
                Log.i("emailid",savedEmail);

            }
        });


        // 1. 자동로그인이, 쉐어드프리퍼런스에 저장되어 있는지 정보를 가져온다.
        boolean autoLogin = sp.getBoolean("auto_login",false);
        // 2. 자동로그인이 true로 되어있으면, 이메일과 비밀번호를 에디트텍스트에 표시
        // 3. 체크박스에도, 체크표시를 합니다.
        if(autoLogin == true){
            idtxt.setText(savedEmail);
            pwdtxt.setText(savedPwd);
            checkAutoLogin.setChecked(true);
        }



    }
}

package com.joon.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView editemail;
    TextView editpwd;
    TextView chkpwd;
    Button btn;
    Button btnlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editemail = findViewById(R.id.editemail);
        editpwd = findViewById(R.id.editpwd);
        chkpwd = findViewById(R.id.chkpwd);
        btn = findViewById(R.id.btn);
        btnlogin = findViewById(R.id.btnlogin);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Imformation.class);

                String email = editemail.getText().toString().trim();
                String pwd = editpwd.getText().toString();
                String pwdchk = chkpwd.getText().toString();


                if(email.indexOf("@")!=-1){
                    if (pwd.equals(pwdchk)){
                        if (pwd.length()>=6 && pwd.length()<=12){
                            if (pwdchk.length()>=6 && pwdchk.length()<=12){
                                Log.i("email",email);
                                i.putExtra("email",email);
                                i.putExtra("pwd" , pwd);
                                startActivity(i);
                                finish();
                            }
                        }else {
                            Toast.makeText(MainActivity.this, "비밀번호는 6자리이상, 12자리 이하 입니다.", Toast.LENGTH_SHORT).show();
                        }
                    }else {
                        Toast.makeText(MainActivity.this, "비밀번호를 일치하여 주십시오.", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(MainActivity.this, "이메일을 바르게 입력하세요.", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(i);
                Log.i("emailid","@@@@@@@@@@@@@@@@@@");

            }
        });




    }
}

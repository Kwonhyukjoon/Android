package com.joon.mytest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtTitle;
    EditText editName;
    EditText editPhone;
    ImageView imgcenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitle = findViewById(R.id.txtTitle);
        editName = findViewById(R.id.editText);
        editPhone = findViewById(R.id.editText2);
        imgcenter = findViewById(R.id.imgCenter);

        // 버튼을 클릭하면, 로그에 "버튼 클릭됨 "을 찍도로 코드 작성

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("but","버튼 클릭 됨");
                String text = txtTitle.getText().toString();
                Log.i("but","get test : "+text);
                String name = editName.getText().toString();
                String phone = editPhone.getText().toString();
                txtTitle.setText("이름 : " +name +"\n"+ "전화번호 : " +phone);

                Toast.makeText(MainActivity.this,name+"\n"+phone,Toast.LENGTH_LONG).show();

                imgcenter.setImageResource(R.drawable.orange);
            }
        });

    }
}

package com.joon.getdata;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editData;
    Button btnSend;
    Button btnThird;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editData = findViewById(R.id.editData);
        btnSend = findViewById(R.id.btnSend);
        btnThird = findViewById(R.id.btnThird);


        // 버튼 누르면, 두번째 액티비로 데이터 전달
        // 데이터란? 에디트 텍스트에서 문자열 가져온다.
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String data = editData.getText().toString().trim();
                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("data" , data);
                i.putExtra("hiddenData", 10);
                // 데이터를 받아오기 위해서는 , startActivityForResult 함수 이용해야 합니다.
                // startActivity(i);
                startActivityForResult(i,0);
            }
        });

        btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,ThirdActivity.class);
                String datathird = editData.getText().toString().trim();
                i.putExtra("datathird", datathird);
                Log.i("datathird",datathird);
                startActivityForResult(i,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 0 && resultCode == RESULT_OK){
            String message = data.getStringExtra("secondData");
            editData.setText(message);
        }
        if(requestCode == 1 && resultCode == RESULT_OK ){
            String messageok = data.getStringExtra("editok");
            editData.setText(messageok);
        }
    }
}

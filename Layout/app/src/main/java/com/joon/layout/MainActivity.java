package com.joon.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Calendar;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    TextView edittext;
    TextView txt;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext = findViewById(R.id.editText);
        txt = findViewById(R.id.txt);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //버튼 눌렸을때 해야 될 일을 여기에 작성
                //1. 에디트텍스트에 적혀있는 글자 가져오기

                String birth = edittext.getText().toString();
                Log.i("MyCat","유저가 입력한 값은 : " +birth);

                //2. 이번년도에서, 가지고온 년도를 뺀다.
                int age = 2020 - Integer.parseInt(birth) + 1;
                Log.i("MyCat" , "계산한 나이는 : " +age);
                edittext.setText("");
                //3. 텍스트뷰에 표시해야 겠다.
                txt.setText(""+age);


            }
        });
    }
}

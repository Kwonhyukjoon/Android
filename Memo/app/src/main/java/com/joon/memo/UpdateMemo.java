package com.joon.memo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.joon.memo.data.DatabaseHandler;
import com.joon.memo.model.Contact;

public class UpdateMemo extends AppCompatActivity {

    TextView editTitle;
    TextView editContents;
    Button editbtn;
    int id;
    DatabaseHandler db = new DatabaseHandler(UpdateMemo.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_memo);

        editTitle = findViewById(R.id.editTitle);
        editContents = findViewById(R.id.editContents);
        editbtn = findViewById(R.id.editbtn);


        Intent i = getIntent();
        id = i.getIntExtra("id",-1);
        String Title = i.getStringExtra("title");
        String Contents = i.getStringExtra("contents");

        editTitle.setText(Title);
        editContents.setText(Contents);

        editbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fixname = editTitle.getText().toString().trim();
                String fixphone = editContents.getText().toString().trim();
                //업데이트 테스트
                Contact contact = new Contact(id,fixname,fixphone);
                db.updateContact(contact);
                if(fixname.isEmpty() || fixphone.isEmpty()){
                    Toast.makeText(UpdateMemo.this,"데이터를 넣어주세요.",Toast.LENGTH_SHORT).show();
                    return;
                }
                Log.i("name","아이디 2번 데이터 : " + contact.getId() +", "+ contact.getTitle()+", " + contact.getContents());
                Toast.makeText(UpdateMemo.this,"수정되었습니다.",Toast.LENGTH_SHORT).show();
                finish();

            }
        });

    }
}

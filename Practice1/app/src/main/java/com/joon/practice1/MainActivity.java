package com.joon.practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.joon.practice1.data.DatabaseHandler;
import com.joon.practice1.model.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);


    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(MainActivity.this,AddContact.class);
            startActivity(i);
        }
    });
    // 삭제 테스트
        DatabaseHandler db = new DatabaseHandler(MainActivity.this);
        Contact contact = db.getContact(4);
        Log.i("myDB","아이디 4번 데이터 : " + contact.getId() +", "+
                contact.getName()+", " + contact.getPhoneNumber());
        db.deleteContact(contact);
//    // 업데이트 테스트
//        Contact contact = db.getContact(2);
//        Log.i("myDB","아이디 2번 데이터 : " + contact.getId() +", "+
//                contact.getName()+", " + contact.getPhoneNumber());
//        // 이름바꾸기
//        contact.setName("홍길동");
//        // 업데이트 메소드 실행.
//        db.updateContact(contact);

    }
    public void onResume(){
        super.onResume();
        DatabaseHandler db = new DatabaseHandler(MainActivity.this);
        ArrayList<Contact> contactList = db.getAllContacts();
        for (Contact contact : contactList){
            Log.i("myDB","저장된 주소록의 데이터 이름은 : " + contact.getName() + " 전화번호 : " + contact.getPhoneNumber());
        }
    }
}

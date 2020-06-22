package com.joon.contactmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.joon.contactmanager.data.DatabaseHandler;
import com.joon.contactmanager.model.Contact;

public class UpdateContact extends AppCompatActivity {

    EditText editName;
    EditText editPhone;
    Button editbtn;
    int id;
    DatabaseHandler db = new DatabaseHandler(UpdateContact.this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_contact);

        editName = findViewById(R.id.editName);
        editPhone = findViewById(R.id.editPhone);
        editbtn = findViewById(R.id.editbtn);

        id = getIntent().getIntExtra("id",-1);
        String name = getIntent().getStringExtra("name");
        String phone = getIntent().getStringExtra("phone");

        editName.setText(name);
        editPhone.setText(phone);


        editbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fixname = editName.getText().toString().trim();
                String fixphone = editPhone.getText().toString().trim();
                //업데이트 테스트
                Contact contact = new Contact(id,fixname,fixphone);
                db.updateContact(contact);
                if(fixname.isEmpty() || fixphone.isEmpty()){
                    Toast.makeText(UpdateContact.this,"데이터를 넣어주세요.",Toast.LENGTH_SHORT).show();
                    return;
                }
                Log.i("name","아이디 2번 데이터 : " + contact.getId() +", "+ contact.getName()+", " + contact.getPhoneNumber());
                Toast.makeText(UpdateContact.this,"수정되었습니다.",Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }
}

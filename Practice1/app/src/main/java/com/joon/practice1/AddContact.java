package com.joon.practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.joon.practice1.data.DatabaseHandler;
import com.joon.practice1.model.Contact;

import java.util.ArrayList;

public class AddContact extends AppCompatActivity {

    EditText name;
    EditText phone;
    Button savebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        name = findViewById(R.id.name);
        phone = findViewById(R.id.phone);
        savebtn = findViewById(R.id.savebtn);
        final DatabaseHandler db = new DatabaseHandler(AddContact.this);

        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phonename = name.getText().toString().trim();
                String phonenumber = phone.getText().toString().trim();
                if(phonename.isEmpty() || phonenumber.isEmpty()){
                    Toast.makeText(AddContact.this,"이름이나 연락처는 필수입니다.",Toast.LENGTH_SHORT).show();
                    return;
                }

                Contact new_contact = new Contact();
                new_contact.setName(phonename);
                new_contact.setPhoneNumber(phonenumber);
                db.addContact(new_contact);
                Toast.makeText(AddContact.this,"잘 저장되었습니다.",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}

package com.joon.memo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.style.TtsSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.joon.memo.data.DatabaseHandler;
import com.joon.memo.model.Contact;

public class AddMemo extends AppCompatActivity {

    EditText title;
    EditText contents;
    Button savebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_memo);

        title = findViewById(R.id.title);
        contents = findViewById(R.id.contents);
        savebtn = findViewById(R.id.savebtn);{

            savebtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String memotitle = title.getText().toString().trim();
                    String memocontents = contents.getText().toString().trim();
                    if(memotitle.isEmpty() || memocontents.isEmpty()){
                        Toast.makeText(AddMemo.this,"제목이랑 내용은 필수입니다.",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    DatabaseHandler db = new DatabaseHandler(AddMemo.this);
                    Contact new_contact = new Contact();
                    new_contact.setTitle(memotitle);
                    new_contact.setContents(memocontents);
                    db.addContact(new_contact);
                    Toast.makeText(AddMemo.this,"잘 저장되었습니다.",Toast.LENGTH_SHORT).show();
                    finish();
                }
            });
        }

    }
}

package com.joon.memo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.joon.memo.adapter.RecyclerViewAdapter;
import com.joon.memo.data.DatabaseHandler;
import com.joon.memo.model.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btn;
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    ArrayList<Contact> contactArrayList;
    DatabaseHandler db = new DatabaseHandler(MainActivity.this);
    public TextView searchtxt;
    public Button searchbtn;
    public Button erasybtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        searchtxt = findViewById(R.id.searchtxt);
        searchbtn = findViewById(R.id.searchbtn);
        erasybtn =  findViewById(R.id.erasybtn);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        searchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = searchtxt.getText().toString().trim();
                DatabaseHandler db = new DatabaseHandler(MainActivity.this);
                contactArrayList = db.getAllContacts(txt);
                recyclerViewAdapter = new RecyclerViewAdapter(MainActivity.this,contactArrayList);
                recyclerView.setAdapter(recyclerViewAdapter);

            }
        });

        erasybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                searchtxt.setText("");
                DatabaseHandler db = new DatabaseHandler(MainActivity.this);
                contactArrayList = db.getAllContacts();
                recyclerViewAdapter = new RecyclerViewAdapter(MainActivity.this,contactArrayList);
                recyclerView.setAdapter(recyclerViewAdapter);


            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AddMemo.class);
                startActivity(i);
            }
        });

        searchtxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String autosearch = s.toString();
                DatabaseHandler db = new DatabaseHandler(MainActivity.this);
                contactArrayList = db.getAllContacts(autosearch);
                recyclerViewAdapter = new RecyclerViewAdapter(MainActivity.this,contactArrayList);
                recyclerView.setAdapter(recyclerViewAdapter);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

        public void onResume(){
            super.onResume();
            DatabaseHandler db = new DatabaseHandler(MainActivity.this);
            contactArrayList = db.getAllContacts();
            recyclerViewAdapter = new RecyclerViewAdapter(MainActivity.this,contactArrayList);
            recyclerView.setAdapter(recyclerViewAdapter);
        }
}

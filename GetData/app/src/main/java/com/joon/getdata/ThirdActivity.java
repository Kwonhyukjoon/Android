package com.joon.getdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView txtthird;
    EditText editthird;
    Button btnthird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        txtthird = findViewById(R.id.txtthird);
        editthird = findViewById(R.id.editthird);
        btnthird = findViewById(R.id.btnthird);

        Intent i = getIntent();
        String datathird = i.getStringExtra("datathird");
        Log.i("datathird" , datathird);
        txtthird.setText(datathird);

        btnthird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editok = editthird.getText().toString().trim();
                Intent i = getIntent();
                i.putExtra("editok" ,editok);
                setResult(RESULT_OK,i);
                finish();
            }
        });
    }
}

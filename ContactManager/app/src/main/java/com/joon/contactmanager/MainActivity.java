package com.joon.contactmanager;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.cardview.widget.CardView;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import android.content.Intent;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;

        import com.joon.contactmanager.adapter.RecyclerViewAdapter;
        import com.joon.contactmanager.data.DatabaseHandler;
        import com.joon.contactmanager.model.Contact;

        import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btn;
    RecyclerView recyclerView; // 메인 화며에 있는 리사이클러 뷰
    RecyclerViewAdapter recyclerViewAdapter; // 우리가 만든, 하나의 셀을 연결시키는 어댑터
    ArrayList<Contact> contactArrayList; // 데이터베이스에서 읽어온 주소록 정보를 저장할 리스트
    DatabaseHandler db = new DatabaseHandler(MainActivity.this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        // 리사이클러뷰 연결하고, 기본적인 셋팅.
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AddContect.class);
                startActivity(i);
            }
        });

//   // 삭제 테스트
//        Contact contact = db.getContact(4);
//        Log.i("myDB","아이디 4번 데이터 : " + contact.getId() +", "+
//                contact.getName()+", " + contact.getPhoneNumber());
//        db.deleteContact(contact);
//
////        //업데이트 테스트
////        Contact contact = db.getContact(2);
////        Log.i("myDB","아이디 2번 데이터 : " + contact.getId() +", "+
////                contact.getName()+", " + contact.getPhoneNumber());
////        // 이름바꾸기
////        contact.setName("권혁준");
////        // 업데이트 메소드 실행.
////        db.updateContact(contact);

        // 디비 테이블에 저장된 데이터 갯수 가져오는 메소드 호출.
//        int count = db.getCount();
//        Log.i("myDB" , "데이터 갯수 : " + count);
    }

        // 우리가 만든 데이터베이스 핸들러 클래스를, 객체 생성한다.

//        // 데이터 하나를 만들어서, 디비(테이블)에 저장해 보자.
//        Contact new_contact = new Contact();
//        new_contact.setName("Jeremy");
//        new_contact.setPhoneNumber("010-1234-5678");
//        db.addContact(new_contact);

        // 저장된 데이터를 읽어오는 코드.
        public void onResume(){
            super.onResume();
//            DatabaseHandler db = new DatabaseHandler(MainActivity.this);
//            ArrayList<Contact> contactList = db.getAllContacts();
//            for (Contact contact : contactList){
//                Log.i("myDB","id 번호 : "+contact.getId()+ " 저장된 주소록의 데이터 이름은 : " + contact.getName() + " 전화번호 : " + contact.getPhoneNumber());
//            }

            // 데이터베이스에서 테이블에 저장된 데이터 읽어서, 어레이리스트에 저장
            DatabaseHandler db = new DatabaseHandler(MainActivity.this);
            contactArrayList = db.getAllContacts();

            // 우리가 만든 하나의 셀 표시하는 어댑터를 생성해서, 리사이클러뷰에 연결
            recyclerViewAdapter = new RecyclerViewAdapter(MainActivity.this,contactArrayList);
            recyclerView.setAdapter(recyclerViewAdapter);
        }

        public void refresh(){
            DatabaseHandler db = new DatabaseHandler(MainActivity.this);
            contactArrayList = db.getAllContacts();
            recyclerViewAdapter = new RecyclerViewAdapter(MainActivity.this,contactArrayList);
            recyclerView.setAdapter(recyclerViewAdapter);
            recyclerViewAdapter.notifyDataSetChanged();
        }
}

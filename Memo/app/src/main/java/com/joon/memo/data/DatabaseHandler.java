package com.joon.memo.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.joon.memo.model.Contact;
import com.joon.memo.util.Util;

import java.util.ArrayList;

public class DatabaseHandler extends SQLiteOpenHelper {


    public DatabaseHandler(@Nullable Context context) {
        super(context, Util.DATABASE_NAME, null, Util.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACT_TABLE = "create table " + Util.TABLE_NAME +
                "("+Util.KEY_ID + " integer not null primary key autoincrement ," +
                Util.KEY_TITLE + " text, " +
                Util.KEY_CONTENTS  + " text  )";

        db.execSQL(CREATE_CONTACT_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String DROP_TABLE = "drop table " + Util.TABLE_NAME;
        db.execSQL(DROP_TABLE);

        onCreate(db);

    }

    public void addContact(Contact contact){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Util.KEY_TITLE, contact.getTitle());
        values.put(Util.KEY_CONTENTS, contact.getContents());

        db.insert(Util.TABLE_NAME,null, values);
        db.close();
        Log.i("name", "inserted.");
    }

    public Contact getContact(int id){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(Util.TABLE_NAME,
                new String[] {Util.KEY_ID, Util.KEY_TITLE,Util.KEY_CONTENTS},
                Util.KEY_ID + " = ?", new String[]{String.valueOf(id)},
                null,null,null);

        if(cursor !=null){
            cursor.moveToFirst();
        }
        int selectedId = Integer.parseInt(cursor.getString(0));
        String selectedTitle = cursor.getString(1);
        String selectedContents = cursor.getString(2);

        Contact contact = new Contact();
        contact.setId(selectedId);
        contact.setTitle(selectedTitle);
        contact.setContents(selectedContents);


        return contact;
    }


    public ArrayList<Contact> getAllContacts(){
        ArrayList<Contact> contactList = new ArrayList<>();
        // 2. 데이터베이스에 select(조회) 해서,
        String selectAll = "select * from " + Util.TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectAll,null);
        // 3.여러개의 데이터를 루프 돌면서, Contact 클래스에 정보를 하나씩 담고
        if(cursor.moveToFirst()){
            do{
                int selectedId = Integer.parseInt(cursor.getString(0));
                String selctedTitle = cursor.getString(1);
                String selectedContents = cursor.getString(2);
                Contact contact = new Contact();
                contact.setId(selectedId);
                contact.setTitle(selctedTitle);
                contact.setContents(selectedContents);

                // 4. 위의 빈 어레이 리스트에 하나씩 추가를 시킨다.
                contactList.add(contact);
            }while(cursor.moveToNext());
        }
        return contactList;
    }

    public ArrayList<Contact> getAllContacts(String content){
        ArrayList<Contact> contactList = new ArrayList<>();
        // 2. 데이터베이스에 select(조회) 해서,
        String selectAll = "select * from " + Util.TABLE_NAME + " Where contents like '%"+content+"%'";
//        String searchQuery = "select id, title, content from memo where contents like or content like? ";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectAll,null);
//        Cursor cursor1 = db.rawQuery(searchQuery, new String[]{"'%'+content+'%'", "'%'+content+'%'"} );
        // 3.여러개의 데이터를 루프 돌면서, Contact 클래스에 정보를 하나씩 담고
        if(cursor.moveToFirst()){
            do{
                int selectedId = Integer.parseInt(cursor.getString(0));
                String selctedTitle = cursor.getString(1);
                String selectedContents = cursor.getString(2);
                Contact contact = new Contact();
                contact.setId(selectedId);
                contact.setTitle(selctedTitle);
                contact.setContents(selectedContents);

                // 4. 위의 빈 어레이 리스트에 하나씩 추가를 시킨다.
                contactList.add(contact);
            }while(cursor.moveToNext());
        }
        return contactList;
    }



    public int updateContact(Contact contact){
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put(Util.KEY_TITLE,contact.getTitle());
        values.put(Util.KEY_CONTENTS,contact.getContents());

        int ret = db.update(Util.TABLE_NAME, //테이블 명
                values, // 업데이트할 값
                Util.KEY_ID + " = ?", // where
                new String[]{String.valueOf(contact.getId())}); //?에 들어갈 값
        return ret;
    }
    //데이터 삭제 메서드
    public void deleteContact(Contact contact){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(Util.TABLE_NAME, // 테이블 명
                Util.KEY_ID + " = ?",//where
                new String[]{String.valueOf(contact.getId())} );
    }



}

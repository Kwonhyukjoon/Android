package com.joon.memo.adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.joon.memo.MainActivity;
import com.joon.memo.R;
import com.joon.memo.UpdateMemo;
import com.joon.memo.data.DatabaseHandler;
import com.joon.memo.model.Contact;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    Context context;
    ArrayList<Contact> contactList;

    public RecyclerViewAdapter(Context context, ArrayList<Contact> contactList){
        this.context = context;
        this.contactList = contactList;

    }
    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        Contact contact = contactList.get(position);
        String title = contact.getTitle();
        String contents = contact.getContents();
        (holder).txtTitle.setText(title);
        (holder).txtContents.setText(contents);
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView txtTitle;
        public TextView txtContents;
        public ImageView imgdelete;
        public CardView cardView;


        public ViewHolder(@NonNull View itemView){
            super(itemView);

            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtContents = itemView.findViewById(R.id.txtContents);
            cardView = itemView.findViewById(R.id.cardView);
            imgdelete = itemView.findViewById(R.id.imgdelete);



            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context,"이 셀은 " + getAdapterPosition() + "번째 셀입니다.",Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(context, UpdateMemo.class);
                    int index = getAdapterPosition();
                    Contact contact = contactList.get(index);
                    int id = contact.getId();
                    String title = contact.getTitle();
                    String contents = contact.getContents();
                    i.putExtra("id",id);
                    i.putExtra("title",title);
                    i.putExtra("contents",contents);
                    context.startActivity(i);
                }
            });

            imgdelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    AlertDialog.Builder deleteAlert = new AlertDialog.Builder(context);
                    deleteAlert.setTitle("주소록 삭제");
                    deleteAlert.setMessage("정말 삭제하시겠습니까?");
                    deleteAlert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            int index = getAdapterPosition();
                            Contact contact  = contactList.get(index);
                            DatabaseHandler db = new DatabaseHandler(context);
                            db.deleteContact(contact);
                            // 데이터셋이 바꼈다는 것을 알려주는 메소드 실행.
                            // 1.
                            contactList = db.getAllContacts();
                            notifyDataSetChanged();
                        }
                    });
                    deleteAlert.setNegativeButton("NO", null);
                    deleteAlert.setCancelable(false);
                    deleteAlert.show();

                }
            });
        }
    }
}

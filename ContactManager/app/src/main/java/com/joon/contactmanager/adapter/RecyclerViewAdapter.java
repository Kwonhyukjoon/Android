package com.joon.contactmanager.adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.joon.contactmanager.MainActivity;
import com.joon.contactmanager.R;
import com.joon.contactmanager.data.DatabaseHandler;
import com.joon.contactmanager.model.Contact;
import com.joon.contactmanager.UpdateContact;

import java.util.ArrayList;

// 마지막으로, 어댑터에, 우리가 만든 뷰홀더를 연결합니다.
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    // 멤버변수 셋팅
    Context context;
    ArrayList<Contact> contactList;

    // 1. 생성자 만들기
    public RecyclerViewAdapter(Context context, ArrayList<Contact> contactList){
        this.context = context;
        this.contactList = contactList;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // 첫번째 파라미터인, parent로 부터 뷰를 생성한다.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_row,parent,false);
        // 리턴에, 위에서 생성한 뷰를 뷰홀더에 담아서 리턴다.
        return new ViewHolder(view);
    }

    // 리스트에 있는 데이터와, 화면에 있는 뷰(텍스트뷰, 이미지뷰....)에 표시하는 메소드
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        Contact contact = contactList.get(position);
        String name = contact.getName();
        String phone = contact.getPhoneNumber();
        // 2. 뷰홀더에 있는 텍스트뷰에 문자열을 셋팅한다.
        (holder).txtName.setText(name);
        (holder).txtPhone.setText(phone);
    }

    // 리스트에 있는 데이터의 갯수를 리턴해줘야 한다.
    @Override
    public int getItemCount() {
        return contactList.size();
    }
    // 하나의 한 셀 xml 화면에 있는 구성요소(텍스브뷰, 이미지 등 )를 여기서 연결한다.
    public class ViewHolder extends RecyclerView.ViewHolder{
        //멤버변수
        public TextView txtName;
        public TextView txtPhone;
        public ImageView imgDelete;
        // 카드뷰 클릭하면 화면 넘어갈 수 있도록, 멤버 변수 셋팅
        public CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            // 2. 생성자 안에서, 멤버변수 연결.
            txtName = itemView.findViewById(R.id.txtName);
            txtPhone = itemView.findViewById(R.id.txtPhone);
            imgDelete = itemView.findViewById(R.id.imgDelete);
            cardView = itemView.findViewById(R.id.cardView);
            //카드뷰의 클릭 이벤트 처리
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // 수정 액티비티로 넘어가는 코드 작성
                    Toast.makeText(context,"이 셀은 " + getAdapterPosition() + "번째 셀입니다.",Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(context, UpdateContact.class);
                    int index = getAdapterPosition();
                    Contact contact = contactList.get(index);
                    int id = contact.getId();
                    String name = contact.getName();
                    String phone = contact.getPhoneNumber();
                    Log.i("name",""+id);
                    Log.i("name",name);
                    Log.i("name",phone);
                    i.putExtra("id",id);
                    i.putExtra("name", name);
                    i.putExtra("phone" , phone);
                    // 새로운 화면을 띄우는 startActivity 함수는, 액티비티 클래스의 메소드 이므로,
                    // context.startActivity 해야함 . 왜냐면 , context == MainActivity.this
                    context.startActivity(i);
                    //getAdapterPositon() 함수는, 현재 내가 클릭한 부분이, 몇번째 셀인지 알려준다.
                }
            });
                imgDelete.setOnClickListener(new View.OnClickListener() {
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
                                // 2.
                                ((MainActivity)context).refresh();
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

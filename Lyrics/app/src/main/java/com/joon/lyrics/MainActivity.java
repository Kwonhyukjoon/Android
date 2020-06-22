package com.joon.lyrics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    EditText editArtist;
    EditText editSong;
    Button btnApi;
    TextView txtLyrics;

    String requestUrl = "https://api.lyrics.ovh/v1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editArtist = findViewById(R.id.editArtist);
        editSong = findViewById(R.id.editSong);
        btnApi = findViewById(R.id.btnApi);
        txtLyrics = findViewById(R.id.txtLyrics);

        btnApi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. 첫번째 에디드 텍스트인, editArtist에서, 가수 문자열을 가져온다.
                // 2. 두번째 에디트 텍스트인, editSong에서 노래 제목 문자열을 가져온다.
                String artist = editArtist.getText().toString();
                String song = editSong.getText().toString();
                // 3. 위의 두개문자열을 파라미터로 만든다.
                String url = requestUrl + "/" + artist + "/" + song;
                Log.i("song","url : "+url);
                // 4. api를 요청한다.

                if(artist.isEmpty() || song.isEmpty()){
                    Toast.makeText(MainActivity.this,"가수와 노래제목을 정확히 입력하세요.",Toast.LENGTH_SHORT).show();
                    txtLyrics.setText("");
                    return;
                }

                // volley 라이브러리의 RequestQueue 클래스를 객체로 생성한다.
                RequestQueue requestQueue  = Volley.newRequestQueue(MainActivity.this);
                JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        // 정상적으로, api 호출이 완료되었으때 호출됨.
                        // restponse 변수에, 데이터가 실려서 옵니다.
                        // 여기서, 우리가 원하는 데이터를 파싱합니다.

                        try {
                            txtLyrics.setText(response.getString("lyrics"));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // 서버가 문제가 생겨서, 정상적으로 동작하지 않을때 이 메소드가 호출합니다.
                        // error 변수에, 왜 에러가 났는지 데이터가 들어있음.
                    }
                });
                requestQueue.add(jsonObjectRequest);
            }
        });




    }
}

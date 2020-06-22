package com.joon.employee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.joon.employee.model.Employee;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RequestQueue requestQueue;
    public static final String URL = "http://dummy.restapiexample.com/api/v1/employees";
    ArrayList employeeArrayList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. 발라의 리퀘스트 큐 객체를 가져온다.
        requestQueue = Volley.newRequestQueue(MainActivity.this);
        // 2. 제이슨리퀘스트 객체 생성 : 서버로부터 응답 받았을때  어떻게 처리할지를 코딩.
        JsonObjectRequest jsonObjectRequest =
                // http 프로토콜의 get 메소드 설정,
                // 요청할 URL,
                //요청할 때 필요한 json,
                // 서버로부터 정상적 응답받았을 시,
                //서버로부터 응답 에러 발생시
                new JsonObjectRequest(Request.Method.GET, URL, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Log.i("AAA", "result : " +response.toString());
                // status 의 값은 뭐냐??? status에 무슨 값이 담겨있는지 로그확인.
                try {
                    String value = response.getString("status");
                    Log.i("AAA" , "key status 의 값은 : " +value);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                try {
                    JSONArray dataArray = response.getJSONArray("data");
                    Log.i("AAA" , "key data 의 값은 : " +dataArray.toString());

                    // 데이터 파싱싱
                   for(int i = 0; i< dataArray.length(); i++){
                        JSONObject object = dataArray.getJSONObject(i);
                        // Log.i("AAA", "루프 " +i+ "번째 : " +object.toString());

                        // 직원의 이름을 24명  다 로그에 찍어보자.
                        String name = object.getString("employee_name");
                        int id = object.getInt("id");
                        int salary = object.getInt("employee_salary");
                        int age = object.getInt("employee_age");
                        Log.i("AAA" , "루프 "+i+"번째 사람의 이름 : " + name +
                                " 루프 "+i+"번째 사람의 아이디 : " + id +
                                " 루프 "+i+"번째 사람의 봉급 : " + salary +
                                " 루프 "+i+"번째 사람의 나이 : " + age);
                        // 파싱한 데이터를 , 클래스의 객체로 저장.
                       Employee employee = new Employee(id, name, salary, age);
                       employeeArrayList.add(employee);

                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.i("AAA" , "error" + error);

            }
        });
        requestQueue.add(jsonObjectRequest);
    }
}

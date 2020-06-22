package com.joon.libjava;

public class MemberService {

    static boolean login(String id,String password){
            if(id.compareTo("hong")==0 && password.compareTo("12345")==0){
                return true;
            }
            return false;
    }


    void logout(String id){
        System.out.println("Log Out!!");
    }
}

package com.joon.libjava;

public class User {

    private String email;
    private String passwd;
    public String nickname;

    User(String nickname){
        this.nickname = nickname;
    }


     boolean setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
            return true;
        }else{
            return false;
        }
    }

    boolean setPasswd(String a, String b) {
        if (a.compareTo(b) == 0 && a.length() >= 6 && a.length() <= 12) {
            this.passwd = a;
            return true;
        } else {
            return false;
        }
    }


        void print() {
            System.out.println("email : " + email);
            System.out.println("passwd : " + passwd);
            System.out.println("nickname : "+nickname);
        }

}


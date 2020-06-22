package com.joon.libjava;


public class Member {


    String name;
    String tel;
    String address;

    Member(String name, String tel, String address){
           this.name = name;
           this.tel = tel;
           this.address = address;
    }


    Member(){


        name = "no name";
        tel = "no tel";
        address = "no address";
        }


    void print(){
        System.out.println("name : " +name);
        System.out.println("tel : " +tel);
        System.out.println("address : " +address);
    }
}

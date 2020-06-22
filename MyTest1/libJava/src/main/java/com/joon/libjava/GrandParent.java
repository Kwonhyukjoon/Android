package com.joon.libjava;

public class GrandParent {

    protected String name;
    protected int age;

    public GrandParent(){

        System.out.println("GrandParent class");
    }

        //public void printGrandParentInfo(){
        public void printInfo(){
            System.out.println("name : " +name);
            System.out.println("age : " +age);
    }


}

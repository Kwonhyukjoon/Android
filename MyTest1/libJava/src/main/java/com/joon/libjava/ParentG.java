package com.joon.libjava;

public class ParentG extends GrandParent {

    protected String job;


    ParentG(){
        System.out.println("Parent class");
    }


//    void printParentGInfo(){
//        System.out.println("name : " +name);
//        System.out.println("age : " +age);
//        System.out.println("job : " +job);
//    }

    @Override
    public void printInfo() {
        System.out.println("name : " +name);
        System.out.println("age : " +age);
        System.out.println("job : " +job);
    }
}

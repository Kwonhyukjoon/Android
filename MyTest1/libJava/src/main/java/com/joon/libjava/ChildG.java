package com.joon.libjava;

public class ChildG extends ParentG {

    public String hobby;

    ChildG(){
        System.out.println("ChildG class");
    }

//    void printChildGInfo(){
//        System.out.println("name : " +name);
//        System.out.println("age : " +age);
//        System.out.println("job : " +job);
//        System.out.println("hobby : " +hobby);
//    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("name : " +name);
        System.out.println("age : " +age);
        System.out.println("job : " +job);
        System.out.println("hobby : " +hobby);
    }
}

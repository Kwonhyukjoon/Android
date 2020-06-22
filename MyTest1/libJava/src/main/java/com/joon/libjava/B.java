package com.joon.libjava;

public class B extends A {


//    @Override
//    void hello(){
//        System.out.println("B say hello");
//        System.out.println("hahahahahahaha");
//    }

    @Override
    void hello() {
        System.out.println("B say hello");
        System.out.println("hahahahahah");
        super.hello();
    }
}

package com.joon.libjava;

public class privateMember {

    int a = 10;
    public static final int NUMBER = 100;

    final void speedUP(){
//        NUMBER = 1000; // no change!(because of 'final')
        a = a + 10;
    }

    void speedDown(){
        a = a - 10;
    }




}

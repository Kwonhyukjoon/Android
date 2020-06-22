package com.joon.libjava;

public class Calculator {

    void powerOn(){
        System.out.println("Power on");
    }

    int plus(int a, int b, int c){
        int result = a+b+c;
        return result;
    }

    double divide(int a, int b){
        double result = (double)a / b;
        return result;
    }
}

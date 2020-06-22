package com.joon.libjava;

public class Student {

    String name;
    int kor;
    int eng;
    int mat;
    int sum;
    double avg;

    void sum(){
        sum = kor + eng + mat;
    }
    void avg(){
        avg = (double)(kor + eng + mat)/3;
    }

    void print(){
        System.out.println(name + " , "+ sum + " , " + avg);
    }

    int num(int a) {
        int b = kor*a;
        return b;
    }

    String grade(int a){
        if(a>avg){
            return "A Grade";
        }else{
            return "F Grade";
        }
    }

}

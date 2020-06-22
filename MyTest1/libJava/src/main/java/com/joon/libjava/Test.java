package com.joon.libjava;

public class Test {

     static float avg(int a, int b, int c){
        int d = (a+b+c)/3;
        return d;
    }

    public static void main(String[] args) {

        float avg = avg(345,6783,12345);
        System.out.println(avg);
        /*int score= 70;

        if (score>=90){
            System.out.println("A");
        }else if(score>=70 && score <90){
            System.out.println("B");
        }else if (score>=50 && score <70){
            System.out.println("C");
        }else
            System.out.println("F");*/

        /*int number = 1223;
        if(number%2==0){
            System.out.println("even number");
        }else {
            System.out.println("odd number");
        }

        int sum = 0;
        for (int i=1; i<=100; i=i+1){
            if(i%2==1){
            sum = sum + i;
        }
        }
        System.out.println(sum);*/

        /*int a = 2;
        int cnt = 5;

        int data = 1;
        for (int i = 0; i < cnt; i++) {
            data = data * a;
        }
        System.out.println(data);

        int b = 2;
        int bnt = 5;

        int j = 1;
        int dataa = 1;

        while (j <= bnt) {
            dataa = dataa * b;
            j++;
        }
        System.out.println(dataa);*/

        /*for(int i =2; i<=9; i++){
            for(int j=1; j<=9; j++){
                System.out.println(i+ " X " +j+" = " +(i*j));
            }
        }*/

        /*int data = 1;
        for(int i=1; i<=10000; i++){
            data = data*i;
            if(data>7000){
                System.out.println(data);
                break;
            }
            System.out.println(data);
            }*/

        /*int[] arr = new int[20];

        for(int i= 0; i<arr.length; i++){
            if(i==0){
                arr[i]=30;
            }else if(i%6==0){
                arr[i] = 40;
            }else{
                arr[i] = 30;
            }
            System.out.println("arr["+i+"]:"  +arr[i]);
        }*/
        /*int gab=0;

        for(int i =2; i<=100; i+=2){
            gab = gab+i;
        }
        System.out.println(gab);

        int i = 0;
        int sum2 = 0;
        while(i<=100){
            sum2 = sum2+i;
            i = i+2;
        }
        System.out.println(sum2);*/


    }
}


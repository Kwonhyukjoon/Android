package com.joon.libjava;


import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class ConfirmTest {

        static boolean a(String b){
            if(b.indexOf("@")!=-1){
                return true;
            }else {
                return false;
            }
        }

        static String b(String c){
            if(c.contains("!")){
                return "true";
            }else{
                return "false";
            }
        }

        static boolean pw(String a, String b){
            if(a.compareTo(b)==0 && a.length() >=6 && a.length()<=12) {
                return true;
            }else {
                return false;
            }
        }

        static int[] num(int a){
            int [] ret = new int[a];
            for(int i=0; i<a; i++) {
                ret[i] = i+1;
                System.out.println(ret[i]);
            }
            return ret;
        }

        static int cal(int value1, int value2, String operator){
            if(operator.compareTo("add")==0){
                return value1+value2;
            }else if(operator.compareTo("mul")==0){
                return value1*value2;
            }
            return 0;
        }


        public static void main(String[] args) {

        int hab = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                hab += i;
            }
        }
        System.out.println(hab);

        while (true){
            int a = (int)(Math.random()*6)+1;
            int b = (int)(Math.random()*6)+1;
            System.out.println("("+a+","+b+")");
            if (a+b == 5){
                break;
            }
        }

        System.out.println("5Question!");



        for(int x = 0; x<=10; x++){
            for (int y = 0; y<=10; y++){
                if((4*x)+(5*y) == 60){
                    System.out.println("("+x+","+y+")");
                }
            }

         }



        System.out.println("@@@@@@@@@@@@@@@@");
        for(int i =1; i<=5; i++){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("@@@@@@@@@@@@@@@@@@@@");
        int floor = 5;
        for(int i=0; i<floor; i++){
            for(int j=0; j<floor-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("#########################");

        int number =5;
        for(int i=0; i<number; i++){
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            for (int j=0; j<number-i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");


        int speed = 56;

            if(speed>=1 && speed<=3){
                System.out.println("Light air");
            }else if(speed>=4 && speed<=27){
                System.out.println("Breeze");
            }else if(speed>=28 && speed<=47){
                System.out.println("Gale");
            }else if(speed>=48 && speed<=63){
                System.out.println("Storm");
            }

            int a = 7;

            if(a%2==0){
                System.out.println("2*");
            }else {
                System.out.println("Not 2*");
            }

            String email = "mike@naver.com";

            System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
            System.out.println(a("@"));
            System.out.println(b("@"));

            System.out.println(pw("asdf1020","asdf1020"));
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");

            User user1 = new User("mike");

            user1.setEmail("mike@naver.com");

            user1.print();
            user1.setPasswd("12345","456465");
            user1.print();
            user1.setPasswd("12345@aa","12345@aa");
            user1.print();


            num(7);

            System.out.println(cal(50,50,"add"));
            System.out.println(cal(50,50,"mul"));
            System.out.println(cal(50,50,"adfdsf"));

            Member1 user2 = new Member1("Mike","aaa");
            Member1 user3 = new Member1("Paul","bbb");

            System.out.println(user2.name);
            System.out.println(user2.id);

            MemberService memberService = new MemberService();

            boolean result = memberService.login("hong","12345");
            if(result){
                System.out.println("Login");
                memberService.logout("hong");
            }else {
                System.out.println("Confirm!");
            }

            ClassTest_2 classTest_2 = new ClassTest_2("Mike", 3000, "Edu");

            classTest_2.getInformation();


    }



}

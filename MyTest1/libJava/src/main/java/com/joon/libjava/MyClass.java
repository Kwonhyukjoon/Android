package com.joon.libjava;


import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.awt.SystemTray;
import java.io.CharArrayReader;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MyClass {

    /*static int add(int a, int b){
        int c=a+b;

        return c;
    }

    static void say_hello(String name, int age){
        System.out.println("Hello My name is " + name + " I'm " +age+ " years old");
    }*/

    /*static void say_hello(int cnt){
        for(int i=0; i<cnt; i++){
            System.out.println("Hello");
        }
    }

    static void grade(int cnt){
        if (cnt>=16 && cnt<=30){
            System.out.println("A");
        }else if(cnt >=8 && cnt<=15){
            System.out.println("B");
        }else if(cnt >=1 && cnt<=7){
            System.out.println("C");
        }else {
            System.out.println("X");
        }
    }
    static String gra(int c){
        if (c>=16 && c<=30){
            return "A";
        }else if(c >=8 && c<=15){
            return "B";
        }else if(c >=1 && c<=7){
            return "C";
        }
        return "Size is Wrong";
    }

    static int gab(int a, int b){
            int c=1;
        for (int i=1; i<=b; i++){
            c = a*c;
        }
        return c;
    }

    static int get_minus_cnt(double[] arr){
        int cnt=0;
        for(int i =0; i<arr.length; i++){
            if (arr[i]<0){
                cnt++;
            }
        }
        return cnt;
    }*/


        /*static int mul(int a, int b){
            int c = a*b;
            System.out.println("hello");
            System.out.println("hi");
            return c;
        }*/

        /*static void some(int a, int b){
            int c = a + b;
        }*/

        /*static String some(String name){
            String sentence = "Hello" + name;
            System.out.println(name);
            System.out.println("bye");
            return sentence;
        }*/

    public static void main(String[] args) {

        /*Test1 test1 = new Test1();
        int ret1 = test1.add_int(10,20);
        float ret2 =test1.add_float(3.5f,10.111f);
        String ret3 = test1.add_string("welcome", " bye");

        System.out.println(ret1);
        System.out.println(ret2);
        System.out.println(ret3);


        Test2 test2 = new Test2();

        int ret4 = test2.add(10,20);
        float ret5 = test2.add(3.5f,10.111f);
        String ret6 = test2.add("welcome", " bye");

        System.out.println(ret4);
        System.out.println(ret5);
        System.out.println(ret6);*/

        /*Member m1 = new Member("Mike", "010-3679-0621","Seoul");
        Member m2 = new Member("Harry", "010-3679-0622","Kimpo");
        Member m3 = new Member();


        m1.print();
        m2.print();
        m3.print();*/

        /*Car c1 = new Car(60);
        Car c2 = new Car("Porshe","Porshe","red");

        c1.print();
        System.out.println();
        c2.print();*/

        /*Calculator cal = new Calculator();

        cal.powerOn();
        System.out.println(cal.plus(3,4,5));
        System.out.println(cal.divide(6,4));*/

        Parent p1 = new Parent();

        p1.name = "Tom";
        p1.age = 45;
        p1.setMoney(1000000);

        p1.printParentInfo();

        int money = p1.getMoney();
        System.out.println(money);

        Child ch1 = new Child();

        ch1.name = "Jerry";
        ch1.age = 40;
        ch1.setHobby("Movie");

        ch1.printParentInfo();
        System.out.println();
        System.out.println();
        ch1.printInfo();

        /*Person p = new Person();
        p.setNum(1);
        p.setName("person");
        p.setDept("dept");
        p.setAddress("address");
        p.print();

        Professor f = new Professor();
        f.setNum(2);
        f.setName("Mike");
        f.setDept("Computer");
        f.setAddress("Seoul");
        String[] sub = {"computer", "C" , "Java"};
        f.setSubjects(sub);

        f.print();
        f.print_subject();

        Students s = new Students();
        s.setNum(2);
        s.setName("Mike");
        s.setDept("buchen");
        s.setAddress("bucheon");
        String[] stduentClass = {"java" , "compiler"};
        s.setSubjects(stduentClass);

        s.print();
        s.print_subject();

        Staff staff = new Staff();
        staff.setNum(3);
        staff.setName("Paul");
        staff.setDept("Monitor");
        staff.setAddress("Kimpo");
        staff.setJob("Edu manager");
        staff.print();
        staff.print_job();*/

//        GrandParent gp = new GrandParent();
//        gp.name = "grand";
//        gp.age = 80;
//        //gp.printGrandParentInfo();
//        gp.printInfo();
//        System.out.println("-----------------------");
//
//        ParentG pg = new ParentG();
//            pg.name = "parent";
//            pg.age = 50;
//            pg.job = "edu";
////            pg.printGrandParentInfo();
////            pg.printParentGInfo();
//            pg.printInfo();
//
//            System.out.println("-----------------------");
//
//            ChildG chi = new ChildG();
//                chi.name = "child";
//                chi.age = 20;
//                chi.job = "student";
//                chi.hobby = "drum";
////                chi.printGrandParentInfo();
////                chi.printParentGInfo();
////                chi.printChildGInfo();
//                chi.printInfo();



        /*B b = new B();
        b.hello();*/



        /*System.out.println("This is Main");
            some("Hyukjoon"); // 3
            System.out.println(some("hyukjoon"));*/



        /*System.out.println("start");
        int a = 4;
        int b= 7;
        int c = mul(a,b);
        System.out.println(c);*/

        /*say_hello("hyukjoon",18);
        int ret = add(3,4); // 7 change!
        System.out.println(ret);*/

        /*say_hello("Hyukjoon");
        say_hello("mike");
        System.out.println(add(6,7));*/

        /*say_hello(4);

        grade(17);

        System.out.println(gra(21));
        System.out.println(gra(12));

        System.out.println(gab(3,3));


        double[] arr = {5,7,-23,-1,99,321,-99};
        int ret = get_minus_cnt(arr);
        System.out.println("minus cnt is : " +ret);
        System.out.println(get_minus_cnt(arr));*/

        /*System.out.println("Hello Java!");
        System.out.println("Welcome");

        String fish = "pretty fish";
        int count = 1;
        float price = 3000f;

        System.out.println("fish : " +fish);
        System.out.println("count : " +count);
        System.out.println("price : " +price);

        System.out.println(count * price);
        count = 3;
        System.out.println(count * price);

        int x= 5;
        int y= 7;

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(y/x);
        System.out.println(x^y);
        System.out.println(y%x);*/


        /*String name;
        int Math;

        System.out.println("name :");
        name = sc.next();
        System.out.println("math :");
        Math = sc.nextInt();

        System.out.println(name +":"+Math);*/

        /*int a = 7;
        int b = 20;
        char var1 = 'A';

        System.out.println(a==b);*/
        /*System.out.println(a !=b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);*/

        /*System.out.println(a == 10 && b==20);
        System.out.println(var1);
        System.out.println(var2);*/

        /*if (a>20){
            System.out.println("a is bigger.");
            System.out.println("Hello");
        }else if(a>10){
            System.out.println("a is middle");
        }else {
            System.out.println("else");
        }

        if (a>5){
            System.out.println("second if");
        }else {
            System.out.println("second else");
        }*/

        /*int c = 3;
        switch (c){
            case 1:
                System.out.println("1");
                break;
            case 3:
                System.out.println("3");
                break;
            case 5:
                System.out.println("5");
                break;

                default:
                    System.out.println("default");
                    break;
        }*/

        /*int d = 0;
        System.out.println(d);
        d = d + 1;
        System.out.println(d);
        d = d + 1;
        System.out.println(d);
        d = d + 1;
        System.out.println(d);*/

        /*for (int d =0; d<=10; d++){
            System.out.println("d :" +d);
        }

        for(int i =0; i< 5; i=i+2){
            System.out.println(i);
            System.out.println("hello");
        }

        int i =1;
        int sum = 0;
        while (i<=100){
            sum = sum +i;
            i++;
        }
        System.out.println(sum);*/

        /*int i = 1;
        while(i<100){
            if(i==5){
                System.out.println("Hello");
                i=99;
                continue;
            }
            System.out.println(i);
            i++;
        }*/

        /*int[] arr = new int[5];
        int[] arr2 = {1,2,3};

        arr[0] = 100;
        arr[1] = 88;
        arr[2] = 70;
        arr[3] = 99;
        arr[4] = 66;

        System.out.println(arr[2]);
        System.out.println(arr2[2]);
        System.out.println(arr[0]);

        arr[4] = 10;
        System.out.println(arr[4]);*/

        /*int[] arr1 = new int[34];
        short[] arr2 = new short[10];

        System.out.println(arr1.length);
        System.out.println(arr2.length);*/

        /*int[] number_arr = {6,7,-33,123,-1,0,392,-742};*/
        /*int gab=0;
        for(int i=0; i<number_arr.length; i++) {
            if (number_arr[i] < 0) {
                gab++;
            }
        }
        System.out.println(gab);





        for (int i = number_arr.length-1; i>=0; i--){
            System.out.print(number_arr[i] + " ");
        }*/

        /*int max = 0;
        for (int i =0; i<number_arr.length; i++){
            if(number_arr[i]>max){
                max = number_arr[i];
            }
        }
        System.out.println(max);*/

        /*String sentenace = "Hello World!";

        String word = "Welcome~";

        String sum_string = sentenace + " " + word;

        System.out.println(sum_string);


        int result = 3;

        result +=3; // result = result +3;
        System.out.println("result :" +result);

        result *=4;// result = result *4;
        System.out.println(result);

        result --;
        System  .out.println(result);*/

        /*boolean isAlien = true;

        if (isAlien == false){
            System.out.println("It is not an alien.");
        }else {
            System .out.println("It is an alien.");
        }

        int score = 90;

        if (score < 100 && score >= 90 ){
            System.out.println("A grade");
        }else if (score>= 80){
            System.out.println("B grade");
        }else if(score>=70){
            System.out.println("C grade");
        }else {
            System.out.println("F grade");
        }

        if(score >100 || score <80){
            System.out.println("correct");
        }else {
            System.out.println("incorrect");
        }*/

        /*int [] student_score_arr = new int[100];
            for (int i=0; i<student_score_arr.length; i++){
                student_score_arr[i]=50;
                System.out.println(student_score_arr[i]);
            }*/

        /*double[][] avg_score_arr = new double[7][15];

        int[][] score_arr = new int[20][3];

        int[][] shop_arr = new int[100][25];

        short[][][] image_arr = new short[100][100][3];

        int[][][] stu_arr = new int[20][3][2];*/

        /*int i,j;

        int [][] arr = new int[2][3];
        for(i=0; i<2; i++){
            for (j=0; j<3; j++){
                arr[i][j]=10;
            }
        }*/


        /*Account account = new Account();

        account.setBalance(10000);
        System.out.println("Current balance : " +account.getBalance());

        account.setBalance(10000000);
        System.out.println("Current balance : "+account.getBalance());

        account.setBalance(-3000);
        System.out.println("Current balance : "+account.getBalance());


        Printer printer = new Printer();
        printer.println(10);
        printer.println(3.14);
        printer.println("hello");*/


//        SuperChild sp = new SuperChild();
//
//        sp.print();
//        sp.superCall();

//        ChildAirplane ca1 = new ChildAirplane();
//        ca1.flyMode = 1;
//        ca1.takeoff();
//        ca1.fly();
//        ca1.land();
//
//        ca1.flyMode = 2;
//        ca1.takeoff();
//        ca1.fly();

//        int i = Integer.valueOf("123").intValue();
//        float f = Float.valueOf("23.5").floatValue();
//
//        System.out.println(i);
//        System.out.println(f);
//
//        int k = 15;
//        double d = 15.6;
//        String sk = String.valueOf(k);
//        String sd = String.valueOf(d);
//
//        System.out.println(sk);
//        System.out.println(sd);

//        String str1 = "hello";
//        String str2 = new String("Java");
//
//        String s_i = "123";
//        String s_f = "23.5";
//        String s_d = "234.567";
//
//        System.out.println(s_i + s_f + s_d);
//
//        int i = Integer.valueOf(s_i).intValue();
//        float f = Float.valueOf(s_f).floatValue();
//        double d = Double.valueOf(s_d).doubleValue();
//
//        System.out.println(i+f+d);
//
//        int x = Integer.parseInt(s_i);
//        float y = Float.parseFloat(s_f);
//        double z = Double.parseDouble(s_d);
//
//        System.out.println(x+y+z);
//
//        System.out.println("x+y : " +x+y);
//        System.out.println("x+y : " +(x+y));
//        String str5 = String.valueOf(x);
//        System.out.println(str5 +1000);
//
//        String str6 = Integer.toString(i);
//        String str7 = Float.toString(f);
//        String str8 = Double.toString(d);
//
//        System.out.println("str6 = " +str6);
//        System.out.println("str7 = " +str7);
//        System.out.println("str8 = " +str8);
//
//        System.out.println("concat() test :" + "abc".concat("def"));
//        String strVar = new String("hello");
//        String strVar2 = "hello";
//
//        String concatStr = strVar.concat(strVar2);
//        System.out.println(concatStr);
//
//        if(strVar == strVar2){
//            System.out.println("the same String");
//        }else {
//            System.out.println("different");
//        }
//
//        if(strVar.compareTo(strVar2) == 0){
//            System.out.println("the same String");
//        }else {
//            System.out.println("different");
//        }
//
//        if(strVar.equals(strVar2)){
//            System.out.println("the same String");
//        }else {
//            System.out.println("different");
//        }
//
//        String subject = "java programming langage class";
//        int location = subject.indexOf("m");
//        System.out.println(location);
//
//        if(subject.indexOf("langage") != -1){
//            System.out.println("exists");
//        }else {
//            System.out.println("No word");
//        }
//
//        System.out.println(subject.substring(0,4));
//        System.out.println(subject.substring(5,16));
//
//        String ssn = "56469874651685468";
//        int len = ssn.length();
//        int len2 = subject.length();
//        System.out.println(len);
//        System.out.println(len2);
//
//        if("programming".compareTo(" programming") == 0){
//            System.out.println("Same");
//        }else {
//            System.out.println("Different");
//        }
//
//        String ex1 = " pro gramming";
//        String ex2 = "pro gramming  ";
//        String ex3 = "   pro gramming         ";
//
//        System.out.println(ex1.length());
//        System.out.println(ex2.length());
//        System.out.println(ex3.length());
//
//        ex1 = ex1.trim();
//        ex2 = ex2.trim();
//        ex3 = ex3.trim();
//
//        System.out.println(ex1.length());
//        System.out.println(ex2.length());
//        System.out.println(ex3.length());
//
//        System.out.println(ex1);
//        System.out.println(ex2);
//        System.out.println(ex3);
//
//        String search_word = "JaVa";
//        subject = subject.toLowerCase();
//        search_word = search_word.toLowerCase();
//
//        if(subject.indexOf(search_word) != -1){
//            System.out.println("exists");
//        }else {
//            System.out.println("No word");
//        }
//
//        search_word = search_word.toUpperCase();
//        System.out.println(search_word);
//
//        String color = " red , blue , white , orange";
//        String[] arr = color.split(" , ");
//        for(int j =0; j<arr.length; j++){
//            System.out.println(arr[j]);
//        }
//
//        String[] arr2 = subject.split(" ");
//        for(int j =0; j<arr2.length; j++){
//            System.out.println(arr2[j]);
//        }
//
//        String[] arr3 = subject.split("a");
//        for(int j =0; j<arr3.length; j++){
//            System.out.println(arr3[j]);
//        }
//
//        String rep_str = subject.replace("java","Python");
//        System.out.println(subject);
//        System.out.println(rep_str);
//
//        System.out.println(subject.contains("class"));
//        if(subject.contains("class")){
//            System.out.println("subject");
//        }else{
//            System.out.println("not subject");
//        }
//
//        String url = "http://www.naver.com";
//
//        System.out.println(url.startsWith("http"));
//        if(url.startsWith("http")){
//            System.out.println("Web");
//        }else {
//            System.out.println("Not Web");
//        }
//        System.out.println(url.endsWith("kr"));
//
//        if(url.endsWith("kr")){
//            System.out.println("Korea");
//        }else {
//            System.out.println("Not Korea");
//        }
//
//        String text = "red/green/blue/white/black";
//        StringTokenizer st = new StringTokenizer(text, "/");
//        int countTokens = st.countTokens();
//        System.out.println(countTokens);
//        for (int j=0; j< countTokens; j++){
//            String token = st.nextToken();
//            System.out.println(token);
//        }
//
//        StringTokenizer st2 = new StringTokenizer(text, "/");
//        while (st2.hasMoreElements()){
//            String token = st2.nextToken();
//            System.out.println(token);
//        }
//
//        StringBuilder sb = new StringBuilder();
//        sb.append("Java ");
//        sb.append("Programming Class");
//        sb.append(" Bye");
//        sb.insert(5,"language ");
//        System.out.println(sb);
//
//        sb.replace(0,5,"Python");
//        System.out.println(sb);
//
//        System.out.println(sb.length());
//
//        String str = sb.toString();

//        int v1 = Math.abs(-5);
//        double v2 = Math.abs(3243.234);
//        float v3 = Math.abs(24111.455f);
//        long v4 = Math.abs(123213L);
//
//        System.out.println(v1);
//        System.out.println(v2);
//        System.out.println(v3);
//        System.out.println(v4);
//
//
//        double a1 = Math.ceil(5.3);
//        double a2 = Math.ceil(-5.3);
//            System.out.println(a1);
//            System.out.println(a2);
//
//            double a3 = Math.floor(5.7);
//            double a4 = Math.floor(-5.7);
//            System.out.println(a3);
//            System.out.println(a4);
//
//            int b1 = Math.max(1,10);
//            System.out.println(b1);
//
//            int b2 = Math.min(-238,-224);
//            System.out.println(b2);
//
//            double c= Math.random();
//            System.out.println(c);
//            c = Math.random();
//            System.out.println(c);
//            c = Math.random();
//            System.out.println(c);
//
//            c = Math.random()*100;
//            System.out.println(c);
//
//            long v14 = Math.round(5.6);
//            long v15 = Math.round(5.1);
//            System.out.println(v14);
//            System.out.println(v15);
//
//            // 0<=Math.random()<1
//            //0<=Math.random()<*6 <6
//            //0<=0,1,2,3,4,5<6
//            //1<=1,2,3,4,5,6<7
//            double num = (int)(Math.random()*45)+1;
//            System.out.println(num);

//        Date now = new Date();
//        String strNow1 = now.toString();
//        System.out.println(strNow1);
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        String strNow2 = sdf.format(now);
//        System.out.println(strNow2);
//
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH");
//        String strNow3 = sdf2.format(now);
//        System.out.println(strNow3);
//
//        Calendar now2 = Calendar.getInstance();
//        int year = now2.get(Calendar.YEAR);
//        int month = now2.get(Calendar.MONTH)+1;
//        int day = now2.get(Calendar.DAY_OF_MONTH);
//
//        int week = now2.get(Calendar.DAY_OF_WEEK);
//
//        String strWeek = null;
//        switch (week){
//            case Calendar.MONDAY:
//                strWeek = "Mon";
//                break;
//            case Calendar.TUESDAY:
//                strWeek = "Tue";
//                break;
//            case Calendar.WEDNESDAY:
//                strWeek = "Wed";
//                break;
//            case Calendar.THURSDAY:
//                strWeek = "Thu";
//                break;
//            case Calendar.FRIDAY:
//                strWeek = "Fri";
//                break;
//            case Calendar.SATURDAY:
//                strWeek = "Sat";
//                break;
//            case Calendar.SUNDAY:
//                strWeek = "Sun";
//                break;
//        }
//
//        System.out.println(strWeek);
//        System.out.println(week);
//
//
//        int ampm = now2.get(Calendar.AM_PM);
//        String strAmPm = null;
//        if(ampm == Calendar.AM){
//            strAmPm = "AM";
//        }else {
//            strAmPm = "PM";
//        }
//        System.out.println(ampm);
//        System.out.println(strAmPm);
//
//        int hour = now2.get(Calendar.HOUR);
//        int minute = now2.get(Calendar.MINUTE);
//        int second = now2.get(Calendar.SECOND);
//
//        System.out.println(year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second);

//        //formatting
//
//        double number = 1234567.89;
//
//        DecimalFormat df = new DecimalFormat("0");
//        System.out.println(df.format(number));
//
//        df = new DecimalFormat("0.0");
//        System.out.println(df.format(number));
//
//        df = new DecimalFormat("0.00");
//        System.out.println(df.format(number));
//
//        df = new DecimalFormat("00000000000000000.00000000");
//        System.out.println(df.format(number));
//
//        df = new DecimalFormat("#");
//        System.out.println(df.format(number));
//
//        df = new DecimalFormat("#.#");
//        System.out.println(df.format(number));
//
//        df = new DecimalFormat("########.####");
//        System.out.println(df.format(number));
//
//        df = new DecimalFormat("#.0");
//        System.out.println(df.format(number));
//
//        df = new DecimalFormat("+#.0");
//        System.out.println(df.format(number));
//
//        df = new DecimalFormat("-#.0");
//        System.out.println(df.format(number));
//
//        df = new DecimalFormat("#,###.0");
//        System.out.println(df.format(number));
//
//        df = new DecimalFormat("0.0E0");
//        System.out.println(df.format(number));
//
//        df = new DecimalFormat("+#,### ; -#,###");
//        System.out.println(df.format(number));
//
//        df = new DecimalFormat("#.00%");
//        System.out.println(df.format(number));
//
//        String id = "Java";
//        String name = "Mike";
//        String tel = "010-1234-5678";
//        String gender = "male";
//
//        String id2 = "Python";
//        String name2 = "Harry";
//        String tel2 = "010-5555-3333";
//        String gender2 = "female";
//
//        String text = "user Id : {0} \nuser name: {1} \ngender : {3} \nuser tel : {2}";
//
//        String result1 = MessageFormat.format(text, id, name, tel, gender);
//        System.out.println(result1);
//
//        String result2 = MessageFormat.format(text, id2, name2, tel2, gender2);
//        System.out.println(result2);

        // time

//        LocalDate currDate = LocalDate.now();
//        System.out.println("current local : " + currDate);
//
//        LocalDate targetDate = LocalDate.of(2024,5,10);
//        System.out.println("target Date : " +targetDate);
//        System.out.println();
//
//
//        LocalTime currTime = LocalTime.now();
//        System.out.println("currTime : " +currTime);
//
//        LocalTime targetTime = LocalTime.of(23,30,0,0);
//        System.out.println("targetTime : " +targetTime);
//
//        LocalDateTime currDateTime = LocalDateTime.now();
//        System.out.println("current : " +currDateTime);
//
//        LocalDateTime targetDateTime = LocalDateTime.of(2024,5,10,23,30,0,0);
//        System.out.println("target : " +targetDateTime);
//
//        ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
//        System.out.println("UTC : " +utcDateTime);
//
//        ZonedDateTime newyorkDateTime =
//                ZonedDateTime.now(ZoneId.of("America/New_York"));
//        System.out.println("new york : " + newyorkDateTime);
//
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
//
//        String strDateTime = now.getYear() + "/";
//        strDateTime += now.getMonth() + "/";
//        strDateTime += now.getDayOfMonth() + " ";
//        System.out.println(strDateTime);
//
//        LocalDate  nowDate = now.toLocalDate();
//        if(nowDate.isLeapYear()){
//            System.out.println("Yes Leap Year, 29");
//        }else {
//            System.out.println("No Leap Year, 28");
//        }
//
//        LocalDateTime newDate = now.plusYears(1)
//                .minusMonths(2).plusDays(4).plusHours(2);
//
//        System.out.println(newDate);
//
//        LocalDateTime startDateTime =
//                LocalDateTime.of(2021,1,1,9,0,0);
//        System.out.println("start date : " +strDateTime);
//
//        LocalDateTime endDateTime =
//                LocalDateTime.of(2024,3,31,18,0,0);
//        System.out.println("end date : " +endDateTime);
//
//        if(startDateTime.isBefore(endDateTime)){
//            System.out.println("ing...");
//        }else if(startDateTime.isEqual(endDateTime)){
//            System.out.println("same");
//        }else if(startDateTime.isAfter(endDateTime)){
//            System.out.println("end");
//        }
//
//        long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
//        System.out.println(remainYear);
//
//        long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
//        System.out.println(remainMonth);
//
//        long remainDay = startDateTime.until(endDateTime,ChronoUnit.DAYS);
//        System.out.println(remainDay);
//
//        long remainHour = startDateTime.until(endDateTime,ChronoUnit.HOURS);
//        System.out.println(remainHour);
//
//        long remainMinute = startDateTime.until(endDateTime,ChronoUnit.MINUTES);
//        System.out.println(remainMinute);
//
//        long remainSecond = startDateTime.until(endDateTime,ChronoUnit.SECONDS);
//        System.out.println(remainSecond);
//
//        remainYear = ChronoUnit.YEARS.between(startDateTime,endDateTime);
//
//        DateTimeFormatter formatter;
//        LocalDate localDate;
//
//        localDate = LocalDate.parse("2024-05-21");
//        System.out.println(localDate);
//
//        formatter = DateTimeFormatter.ISO_LOCAL_DATE;
//        localDate = LocalDate.parse("2024-05-21",formatter);
//        System.out.println(localDate);
//
//        formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//        localDate = LocalDate.parse("2024-05-21",formatter);
//        System.out.println(localDate);
//
//        formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//        localDate = LocalDate.parse("2024.05.21",formatter);
//        System.out.println(localDate);

        ArrayList<String> list = new ArrayList<String>();

        list.add("400");
        list.add("Java");
        list.add("Python");
        list.add("Javascript");
        list.add(2,"C");
        list.add("SQL");

        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        list.remove(0);
        System.out.println("-=----------------");
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        list.remove("Python");

        System.out.println("-=----------------");
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        list.add("Hello");
        list.add("Bye");
        list.add("Welcome to this Java Class.");
        list.add("Hello");
        list.add("Hello");

        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }


        System.out.println("------------------------------sdfdsfsdfdsfs");
        Iterator<String> i = list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("-----------------------------zzzzzzzzz");
        for(String value : list){
            System.out.println(value);
        }

        HashMap<String, String > map = new HashMap<>();
        map.put("name", "Mike");
        map.put("tel", "010-1234-5678");
        map.put("address", "Seoul");
        map.put("name", " Paul");

        System.out.println(map.get("name"));
        System.out.println(map.get("tel"));
        System.out.println(map.get("address"));


        System.out.println("-----------------------------");

        Object[] keys = map.keySet().toArray();
        for (int k=0; k<keys.length; k++){
            System.out.println((String)keys[k]);
        }

        System.out.println("-----------------------------");

        Object[] values = map.values().toArray();
        for (int k=0; k<values.length; k++){
            System.out.println((String)values[k]);
        }


        System.out.println("-----------------------------");

        HashMap<String,Integer> scoreMap = new HashMap<>();
        scoreMap.put("KOR", 88);
        scoreMap.put("ENG", 77);
        scoreMap.put("MAT", 100);

        Object[] values2 = scoreMap.values().toArray();
        for (int k = 0; k<values2.length; k++){
            System.out.println((Integer)values2[k]);
        }
        System.out.println("-----------------------------------");


        ArrayList<String> score = new ArrayList<>();
        score.add("46.33");
        score.add("77.8");
        score.add("90.0");
        score.add("87.5");
        for (int j = 0; j<score.size(); j++){
            System.out.println(score.get(j));
        }

        HashMap<String , Double> score2 = new HashMap<>();
        score2.put("Mike", 46.33);
        score2.put("Harry", 77.8);
        score2.put("Jane", 90.0);
        score2.put("Paul", 87.5);

        Object[] scoreValue = score2.values().toArray();
        for(int j=0; j<scoreValue.length; j++){
            System.out.println((Double)scoreValue[j]);
        }

        System.out.println(score2.get("Jane"));
        score2.remove("Jane");

        Object[] scoreValue2 = score2.values().toArray();
        for(int j=0; j<scoreValue2.length; j++){
            System.out.println((Double)scoreValue2[j]);
        }





    }
}

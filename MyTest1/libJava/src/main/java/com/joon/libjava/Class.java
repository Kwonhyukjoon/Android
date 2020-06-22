package com.joon.libjava;

public class Class {
    public static void main(String[] args) {
        /*System.out.println("I am main");

        int a = 10;
        // class  <-> instance(object)
        Product p = new Product();
        p.number =1;
        p.name = "Monitor";

        Product p2 = new Product();
        p2.number =2;
        p2.name = "Keyboard";

        System.out.println(p2.number);
        System.out .println(p.number);
        System.out.println(p.name);
        System.out.println(p2.name);

        Dog d = new Dog();
        Dog d2 = new Dog();

        d.name = "mike";
        d.age = 1;



        d2.name = "paul";
        d2.age = 2;



        System.out.println("Kinds of Dog");
        System.out.println("name : " + d.name + " age : " + d.age);
        System.out.println("name : " + d2.name + " age : " + d2.age);*/


        /*Student std = new Student();
        Student std2 = new Student();

        std.name = "mike";
        std.kor = 90;
        std.eng = 80;
        std.mat = 90;
        std.sum();
        std.avg();

        System.out.println(std.name+ " , "+std.sum + " , " +std.avg);
        std.print();
        System.out.println(std.num(6));

        System.out.println(std.grade(95));


        std2.name = "Paul";
        std2.kor = 80;
        std2.eng = 90;
        std2.mat = 70;

        std2.sum();
        std2.avg();*/

        /*Account aco = new Account();

        aco.setMoney(6);
        aco.setMoney(20);
        System.out.println(aco.getMoney(40));
        System.out.println(aco.getMoney(14));
        aco.printmoney();


        Point[] arr = new Point[5];

        for(int i=0; i<arr.length; i++){
            arr[i] = new Point();
            arr[i].x=i;
            arr[i].y=i;
        }*/

        ObjParam myobj = new ObjParam();
        myobj.str = "Hello World";

        ObjectParamTest test = new ObjectParamTest();
        test.setObj(myobj);
        ObjParam ret_param = test.getObj();
        System.out.println("new str :" +ret_param.str);




        /*Product p1 = new Product();
        Product p2 = new Product();

        p1.number = 1;
        p1.name = "Computer";

        p2.number = 2;
        p2.name = "Mouse";

        p1.print();
        p2.print();*/
    }
}

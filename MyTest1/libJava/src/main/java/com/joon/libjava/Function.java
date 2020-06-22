package com.joon.libjava;

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
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class Function {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("Java");

        String s_i = "123";
        String s_f = "23.5";
        String s_d = "234.567";

        System.out.println(s_i + s_f + s_d);

        int i = Integer.valueOf(s_i).intValue();
        float f = Float.valueOf(s_f).floatValue();
        double d = Double.valueOf(s_d).doubleValue();

        System.out.println(i+f+d);

        int x = Integer.parseInt(s_i);
        float y = Float.parseFloat(s_f);
        double z = Double.parseDouble(s_d);

        System.out.println(x+y+z);

        System.out.println("x+y : " +x+y);
        System.out.println("x+y : " +(x+y));
        String str5 = String.valueOf(x);
        System.out.println(str5 +1000);

        String str6 = Integer.toString(i);
        String str7 = Float.toString(f);
        String str8 = Double.toString(d);

        System.out.println("str6 = " +str6);
        System.out.println("str7 = " +str7);
        System.out.println("str8 = " +str8);

        System.out.println("concat() test :" + "abc".concat("def"));
        String strVar = new String("hello");
        String strVar2 = "hello";

        String concatStr = strVar.concat(strVar2);
        System.out.println(concatStr);

        if(strVar == strVar2){
            System.out.println("the same String");
        }else {
            System.out.println("different");
        }

        if(strVar.compareTo(strVar2) == 0){
            System.out.println("the same String");
        }else {
            System.out.println("different");
        }

        if(strVar.equals(strVar2)){
            System.out.println("the same String");
        }else {
            System.out.println("different");
        }

        String subject = "java programming langage class";
        int location = subject.indexOf("m");
        System.out.println(location);

        if(subject.indexOf("langage") != -1){
            System.out.println("exists");
        }else {
            System.out.println("No word");
        }

        System.out.println(subject.substring(0,4));
        System.out.println(subject.substring(5,16));

        String ssn = "56469874651685468";
        int len = ssn.length();
        int len2 = subject.length();
        System.out.println(len);
        System.out.println(len2);

        if("programming".compareTo(" programming") == 0){
            System.out.println("Same");
        }else {
            System.out.println("Different");
        }

        String ex1 = " pro gramming";
        String ex2 = "pro gramming  ";
        String ex3 = "   pro gramming         ";

        System.out.println(ex1.length());
        System.out.println(ex2.length());
        System.out.println(ex3.length());

        ex1 = ex1.trim();
        ex2 = ex2.trim();
        ex3 = ex3.trim();

        System.out.println(ex1.length());
        System.out.println(ex2.length());
        System.out.println(ex3.length());

        System.out.println(ex1);
        System.out.println(ex2);
        System.out.println(ex3);

        String search_word = "JaVa";
        subject = subject.toLowerCase();
        search_word = search_word.toLowerCase();

        if(subject.indexOf(search_word) != -1){
            System.out.println("exists");
        }else {
            System.out.println("No word");
        }

        search_word = search_word.toUpperCase();
        System.out.println(search_word);

        String color = " red , blue , white , orange";
        String[] arr = color.split(" , ");
        for(int j =0; j<arr.length; j++){
            System.out.println(arr[j]);
        }

        String[] arr2 = subject.split(" ");
        for(int j =0; j<arr2.length; j++){
            System.out.println(arr2[j]);
        }

        String[] arr3 = subject.split("a");
        for(int j =0; j<arr3.length; j++){
            System.out.println(arr3[j]);
        }

        String rep_str = subject.replace("java","Python");
        System.out.println(subject);
        System.out.println(rep_str);

        System.out.println(subject.contains("class"));
        if(subject.contains("class")){
            System.out.println("subject");
        }else{
            System.out.println("not subject");
        }

        String url = "http://www.naver.com";

        System.out.println(url.startsWith("http"));
        if(url.startsWith("http")){
            System.out.println("Web");
        }else {
            System.out.println("Not Web");
        }
        System.out.println(url.endsWith("kr"));

        if(url.endsWith("kr")){
            System.out.println("Korea");
        }else {
            System.out.println("Not Korea");
        }

        String text = "red/green/blue/white/black";
        StringTokenizer st = new StringTokenizer(text, "/");
        int countTokens = st.countTokens();
        System.out.println(countTokens);
        for (int j=0; j< countTokens; j++){
            String token = st.nextToken();
            System.out.println(token);
        }

        StringTokenizer st2 = new StringTokenizer(text, "/");
        while (st2.hasMoreElements()){
            String token = st2.nextToken();
            System.out.println(token);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Java ");
        sb.append("Programming Class");
        sb.append(" Bye");
        sb.insert(5,"language ");
        System.out.println(sb);

        sb.replace(0,5,"Python");
        System.out.println(sb);

        System.out.println(sb.length());

        String str = sb.toString();


        int v1 = Math.abs(-5);
        double v2 = Math.abs(3243.234);
        float v3 = Math.abs(24111.455f);
        long v4 = Math.abs(123213L);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);


        double a1 = Math.ceil(5.3);
        double a2 = Math.ceil(-5.3);
        System.out.println(a1);
        System.out.println(a2);

        double a3 = Math.floor(5.7);
        double a4 = Math.floor(-5.7);
        System.out.println(a3);
        System.out.println(a4);

        int b1 = Math.max(1,10);
        System.out.println(b1);

        int b2 = Math.min(-238,-224);
        System.out.println(b2);

        double c= Math.random();
        System.out.println(c);
        c = Math.random();
        System.out.println(c);
        c = Math.random();
        System.out.println(c);

        c = Math.random()*100;
        System.out.println(c);

        System.out.println("---------------------------------------------");

        long v14 = Math.round(5.6);
        long v15 = Math.round(5.1);
        System.out.println(v14);
        System.out.println(v15);

        // 0<=Math.random()<1
        //0<=Math.random()<*6 <6
        //0<=0,1,2,3,4,5<6
        //1<=1,2,3,4,5,6<7
        double num = (int)(Math.random()*45)+1;
        System.out.println(num);

        Date now = new Date();
        String strNow1 = now.toString();
        System.out.println(strNow1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String strNow2 = sdf.format(now);
        System.out.println(strNow2);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH");
        String strNow3 = sdf2.format(now);
        System.out.println(strNow3);

        Calendar now2 = Calendar.getInstance();
        int year = now2.get(Calendar.YEAR);
        int month = now2.get(Calendar.MONTH)+1;
        int day = now2.get(Calendar.DAY_OF_MONTH);

        int week = now2.get(Calendar.DAY_OF_WEEK);

        String strWeek = null;
        switch (week){
            case Calendar.MONDAY:
                strWeek = "Mon";
                break;
            case Calendar.TUESDAY:
                strWeek = "Tue";
                break;
            case Calendar.WEDNESDAY:
                strWeek = "Wed";
                break;
            case Calendar.THURSDAY:
                strWeek = "Thu";
                break;
            case Calendar.FRIDAY:
                strWeek = "Fri";
                break;
            case Calendar.SATURDAY:
                strWeek = "Sat";
                break;
            case Calendar.SUNDAY:
                strWeek = "Sun";
                break;
        }

        System.out.println(strWeek);
        System.out.println(week);


        int ampm = now2.get(Calendar.AM_PM);
        String strAmPm = null;
        if(ampm == Calendar.AM){
            strAmPm = "AM";
        }else {
            strAmPm = "PM";
        }
        System.out.println(ampm);
        System.out.println(strAmPm);

        int hour = now2.get(Calendar.HOUR);
        int minute = now2.get(Calendar.MINUTE);
        int second = now2.get(Calendar.SECOND);

        System.out.println(year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second);

        //formatting

        double number = 1234567.89;

        DecimalFormat df = new DecimalFormat("0");
        System.out.println(df.format(number));

        df = new DecimalFormat("0.0");
        System.out.println(df.format(number));

        df = new DecimalFormat("0.00");
        System.out.println(df.format(number));

        df = new DecimalFormat("00000000000000000.00000000");
        System.out.println(df.format(number));

        df = new DecimalFormat("#");
        System.out.println(df.format(number));

        df = new DecimalFormat("#.#");
        System.out.println(df.format(number));

        df = new DecimalFormat("########.####");
        System.out.println(df.format(number));

        df = new DecimalFormat("#.0");
        System.out.println(df.format(number));

        df = new DecimalFormat("+#.0");
        System.out.println(df.format(number));

        df = new DecimalFormat("-#.0");
        System.out.println(df.format(number));

        df = new DecimalFormat("#,###.0");
        System.out.println(df.format(number));

        df = new DecimalFormat("0.0E0");
        System.out.println(df.format(number));

        df = new DecimalFormat("+#,### ; -#,###");
        System.out.println(df.format(number));

        df = new DecimalFormat("#.00%");
        System.out.println(df.format(number));

        String id = "Java";
        String name = "Mike";
        String tel = "010-1234-5678";
        String gender = "male";

        String id2 = "Python";
        String name2 = "Harry";
        String tel2 = "010-5555-3333";
        String gender2 = "female";

        String text1 = "user Id : {0} \nuser name: {1} \ngender : {3} \nuser tel : {2}";

        String result1 = MessageFormat.format(text1, id, name, tel, gender);
        System.out.println(result1);

        String result2 = MessageFormat.format(text1, id2, name2, tel2, gender2);
        System.out.println(result2);

        LocalDate currDate = LocalDate.now();
        System.out.println("current local : " + currDate);

        LocalDate targetDate = LocalDate.of(2024,5,10);
        System.out.println("target Date : " +targetDate);
        System.out.println();


        LocalTime currTime = LocalTime.now();
        System.out.println("currTime : " +currTime);

        LocalTime targetTime = LocalTime.of(23,30,0,0);
        System.out.println("targetTime : " +targetTime);

        LocalDateTime currDateTime = LocalDateTime.now();
        System.out.println("current : " +currDateTime);

        LocalDateTime targetDateTime = LocalDateTime.of(2024,5,10,23,30,0,0);
        System.out.println("target : " +targetDateTime);

        ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("UTC : " +utcDateTime);

        ZonedDateTime newyorkDateTime =
                ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("new york : " + newyorkDateTime);

        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1);

        String strDateTime = now1.getYear() + "/";
        strDateTime += now1.getMonth() + "/";
        strDateTime += now1.getDayOfMonth() + " ";
        System.out.println(strDateTime);

        LocalDate  nowDate = now1.toLocalDate();
        if(nowDate.isLeapYear()){
            System.out.println("Yes Leap Year, 29");
        }else {
            System.out.println("No Leap Year, 28");
        }

        LocalDateTime newDate = now1.plusYears(1)
                .minusMonths(2).plusDays(4).plusHours(2);

        System.out.println(newDate);

        LocalDateTime startDateTime =
                LocalDateTime.of(2021,1,1,9,0,0);
        System.out.println("start date : " +strDateTime);

        LocalDateTime endDateTime =
                LocalDateTime.of(2024,3,31,18,0,0);
        System.out.println("end date : " +endDateTime);

        if(startDateTime.isBefore(endDateTime)){
            System.out.println("ing...");
        }else if(startDateTime.isEqual(endDateTime)){
            System.out.println("same");
        }else if(startDateTime.isAfter(endDateTime)){
            System.out.println("end");
        }

        long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
        System.out.println(remainYear);

        long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
        System.out.println(remainMonth);

        long remainDay = startDateTime.until(endDateTime,ChronoUnit.DAYS);
        System.out.println(remainDay);

        long remainHour = startDateTime.until(endDateTime,ChronoUnit.HOURS);
        System.out.println(remainHour);

        long remainMinute = startDateTime.until(endDateTime,ChronoUnit.MINUTES);
        System.out.println(remainMinute);

        long remainSecond = startDateTime.until(endDateTime,ChronoUnit.SECONDS);
        System.out.println(remainSecond);

        remainYear = ChronoUnit.YEARS.between(startDateTime,endDateTime);

        DateTimeFormatter formatter;
        LocalDate localDate;

        localDate = LocalDate.parse("2024-05-21");
        System.out.println(localDate);

        formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        localDate = LocalDate.parse("2024-05-21",formatter);
        System.out.println(localDate);

        formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        localDate = LocalDate.parse("2024-05-21",formatter);
        System.out.println(localDate);

        formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        localDate = LocalDate.parse("2024.05.21",formatter);
        System.out.println(localDate);
    }

}

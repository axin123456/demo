package com.orbyun.Generic;


import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;


public class GenericTest {
    @Test
    public void test8() {

        //nihaosssssssssssssss






        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate1);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        LocalTime localTime = LocalTime.now();
        int hour = localTime.getHour();
        int minute = localTime.getMinute();
        int second = localTime.getSecond();
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

    }

    @Test
    public void test7() {
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.YEAR, 1970);
        instance.set(Calendar.MONTH,5);
        instance.set(Calendar.DAY_OF_MONTH, 19);


        System.out.println(instance.getTime());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd  HH-mm-ss");
        String format = simpleDateFormat.format(instance.getTime());
        System.out.println(format);
    }


    @Test
    public void test6() {

        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = dateFormat.format(date);
        System.out.println(format);
        long currentTimeMillis = System.currentTimeMillis();
        String format1 = dateFormat.format(currentTimeMillis);
        System.out.println(format1);


    }

    @Test
    public void test5() {
        String string = "abcdssdfsdfsdfsdfsdf";
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length /2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }
        String s = new String(chars);
        System.out.println(s);
    }
    @Test
    public void test4() {
        String string = "abcdssdfsdfsdfsdfsdf";
        String s = "";
        for (int i = 0; i <string.length(); i++) {
            char c = string.charAt(i);
          s=c+s;

        }
        System.out.println(s);
    }

    @Test
    public void test3() {
        String string = "abcdssdfsdfsdfsdfsdf";
        String s = new String();
        for (int i = string.length()-1; i >=0; i--) {
            char c = string.charAt(i);
            s+=c;

        }
        System.out.println(s);
    }

    @Test
    public void test2() {
       char[] chars={'a','b','c','d','e'};
        String s = new String(chars);
        System.out.println(s);

        String s1 = new String(chars, 2, 3);
        System.out.println(s1);

        String s2 = new String(chars, 0, chars.length);
        System.out.println(s2);

        String string = "abcdssdfsdfsdfsdfsdf";
        System.out.println(string.length());

        char c = string.charAt(3);
        System.out.println(c);
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }


    }

}



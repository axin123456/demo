package com.orbyun;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListTest {

    public static final List list = new ArrayList();

    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(()->{
            addArrayList();
        });
        Thread thread2=new Thread(()->{
            addLinkedList();

        });

        thread.start();
        thread.join();
        thread2.start();
        thread2.join();

        Random random = new Random();
        int i = random.nextInt(100);
        System.out.println(i);




    }

    private static void addArrayList() {
        ArrayList<String> arrayList = new ArrayList<>();
        long begin2  = System.currentTimeMillis();
        for (int i = 0; i <1000000; i++) {
            arrayList.add(i+"");
        }
        System.out.println("arrayList添加花费是："+(System.currentTimeMillis()-begin2));
        System.out.println(arrayList.size());
    }



    private static void addLinkedList() {
        LinkedList<String> linkedList = new LinkedList<>();
        long begin = System.currentTimeMillis();
        for (int i = 0; i <1000000; i++) {
            linkedList.add(i+"");
        }
        System.out.println("linkedList添加花费是："+(System.currentTimeMillis()-begin));
        System.out.println(linkedList.size());
    }


}

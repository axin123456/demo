package com.orbyun.testWait;

public class test {
    public static void main(String[] args) {
        Service service=new Service();
        Thread thread = new Thread(new SleepThread(service));
        Thread thread1 = new Thread(new WaitThread(service));
        thread.start();
        thread1.start();

    }
}

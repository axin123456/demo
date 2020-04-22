package com.orbyun.threadtest;

import java.util.UUID;
import java.util.concurrent.*;

public class ThreadTest {
    /*  public static void main(String[] args) throws ExecutionException, InterruptedException {
          System.out.println("主线程开始.....");
          //new Thread(new Thread1()).start();
          //new Thread(new Thread2()).start();
          FutureTask<String> task = new FutureTask<>(new Thread03());
          new Thread(task).start();
          String s = task.get();
          System.out.println(s);
          System.out.println("主线程结束.....");
      }*/
  /*public static void main(String[] args) {
      ExecutorService executorService = Executors.newFixedThreadPool(2);

      System.out.println("所有任务都已经准备.......");
      for (int i = 0; i < 10; i++) {
          Thread thread = new Thread(() -> {
              System.out.println("当前线程开始" + Thread.currentThread());
              try {
                  TimeUnit.SECONDS.sleep(5);
              } catch (Exception e) {
                  e.printStackTrace();
              }
              System.out.println("当前线程结束" + Thread.currentThread());
          });
          executorService.submit(thread);

      }
      System.out.println("所有任务都已经提交");

  }*/
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        System.out.println("主线程开始.....");
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("当前线程开始" + Thread.currentThread());
            String uuid = UUID.randomUUID().toString();
            System.out.println("当前线程结束" + Thread.currentThread());
            return uuid;
        }, pool).whenComplete((r,e)->{
            System.out.println("当前线程结果是:"+r);
            System.out.println("当前线程异常是:"+e);
        });
        System.out.println("主线程结束" + future.get());

    }


}

class Thread1 extends Thread {
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("thread01-当前线程" + Thread.currentThread());
    }
}

class Thread2 implements Runnable {

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Thread2-当前线程" + Thread.currentThread());
    }
}

class Thread03 implements Callable<String> {

    @Override
    public String call() throws Exception {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "ok";
    }
}

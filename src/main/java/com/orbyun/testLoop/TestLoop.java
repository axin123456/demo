package com.orbyun.testLoop;

import java.math.BigDecimal;
import java.util.Scanner;

public class TestLoop {
   /* public static void main(String[] args) {
        int result=0;
        int count=0;
        for (int i = 100; i < 1000; i++) {
            if (i % 7 == 0) {
                result+=i;
                System.out.println("**i:"+i);
                count++;
            }
        }
        int avg=result/count;
        System.out.println("avg:"+avg);
    }*/

    /* public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
        // int m = scanner.nextInt();
         for (int i = 0; i < n; i++) {
             for (int j = 0; j <n- i; j++) {
                 System.out.print(" ");
             }
             for (int m = 0; m < 2*i+1; m++) {
                 System.out.print("#");
             }
             System.out.println();
         }
 */
    public static void main(String[] args) {
     /*  boolean flag=true;
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       for (int i = 2; i < n; i++) {
           if (n % i == 0) {
               flag=false;
           }
       }
       if (flag) {
           System.out.println(n+"是质数");
       }else {
           System.out.println(n+"不是质数");
       }*/
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);
        }
        for (int i : arr) {
            System.out.print("i:"+i+" ");
        }
        System.out.println(" ");
        int[] newArr = new int[arr.length];
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                newArr[count] = arr[i];
                count++;
            }
        }
        int[] finalArr = new int[count];
        for (int i = 0; i < count; i++) {
            finalArr[i] = newArr[i];
        }
        for (int i : finalArr) {
            System.out.print("i:"+i+" ");
        }
        System.out.println(" ");
    }
}

package com.company;

import java.util.Scanner;

public class Math5 {
    public static boolean isprime(int a){
        if(a<2) return false;
        for(int i=2;i*i<=a;i++){
            if(a%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int result=0;

        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            if(isprime(n)) result++;
        }

        System.out.println(result);
    }
}

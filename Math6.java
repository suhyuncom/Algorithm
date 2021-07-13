package com.company;

import java.util.Scanner;

public class Math6 {
    public static boolean isprime(int num){
        if(num < 2) return false;
        for(int i=2; i*i<=num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        while(true)
        {
            int num = sc.nextInt();
            boolean isExist = false;

            if (num == 0) {
                System.out.println(sb);
                return;
            }

            for(int i=3; i<=num; i+=2){
                if(isprime(i) && isprime(num-i)){
                    sb.append(num+" = "+i+" + "+(num-i)).append("\n");
                    isExist = true;
                    break;
                }
            }

            if(!isExist){
                sb.append("Goldbach's conjecture is wrong.").append("\n");
            }
        }
    }
}

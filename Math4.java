package com.company;

import java.util.Scanner;

public class Math4 {
    public static int calc(int a, int b){
        if(b == 0){
            return a;
        }else{
            return calc(b, a%b);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int t, n = 0;
        t = sc.nextInt();
        long[] answer = new long[t];
        while(t-- > 0){
            n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            long ans = 0;
            for(int i=0; i<n-1; i++){
                for(int j=i+1; j<n; j++){
                    ans += calc(a[i], a[j]);
                }
            }
            answer[num]=ans;
            num++;
        }
        for(int i=0;i<answer.length;i++){
            System.out.println(answer[i]);
        }
    }
}

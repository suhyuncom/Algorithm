package com.company;

import java.util.Scanner;

public class Math3 {
    public int calc (int a, int b){
        int[] answer = new int[2];
        int temp = 1;
        int gcd = a*b;

        while(temp!=0){
            temp = b%a;
            b=a;
            a=temp;
        }
        answer[0]=b;
        answer[1]=gcd/b;

        return answer[1];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Math3 math = new Math3();
        int num;
        num = sc.nextInt();
        int[] x = new int[num];
        int[] y = new int[num];
        int[] result = new int[num];

        for(int i=0;i<num;i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            result[i] = math.calc(x[i], y[i]);
        }
        for(int k=0;k<num;k++){
            System.out.println(result[k]);
        }
    }
}

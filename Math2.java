package com.company;
import java.util.*;
public class Math2 {
    public int[] solution(int a, int b) {
        int[] answer = new int[2];
        int temp=1;
        int gcd=a*b;
        while(temp!=0){
            temp=b%a;
            b=a;
            a=temp;
        }
        answer[0]=b;
        answer[1]=gcd/b;
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        return answer;
    }
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        Math2 sol = new Math2();

        x = sc.nextInt();
        y = sc.nextInt();

        sol.solution(x,y);
    }
}

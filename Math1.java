package com.company;
import java.util.*;

public class Math1 {
    public int[] func(int a, int b){
        int result[] = new int[2];
        int temp = 1;
        int gcd = a*b;

        while(temp!=0){
            temp = b%a;
            b=a;
            a=temp;
        }
        result[0]=b;
        result[1]=gcd/b;
        System.out.println(result[0]);
        System.out.println(result[1]);
        return result;
    }

    public static void main(String[] args) {
	    int x,y;
	    Scanner sc = new Scanner(System.in);
	    Math1 sol = new Math1();
	    x = sc.nextInt();
	    y = sc.nextInt();

	    sol.func(x, y);
    }
}

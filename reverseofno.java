package com.divyansh;

import java.util.Scanner;

public class reverseofno {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("enter the number you want to reverse:");
        int num = in.nextInt();

        int ans = 0;

        while(num > 0) {
            int rem = num % 10;
            num = num / 10;

            ans = ans * 10 + rem;

        }
        System.out.println(ans);
    }
}

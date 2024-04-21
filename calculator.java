package com.divyansh;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//    take input from the user untill the user doesn't press X or x

        int ans = 0;

        while(true){
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
// take both the numbers as input from the user
                System.out.println("enter the first number :");
                int num1 = in.nextInt();

                System.out.println("enter the second number: ");
                int num2 = in.nextInt();

                if (op == '+'){
                    ans = num1 +  num2;

                }
                if (op == '-'){
                    ans = num1 - num2;

                }
                if (op == '*') {

                    ans = num1 * num2;

                }
                if (op == '/'){
                    if (num2!=0){
                        ans = num1 / num2;

                    }

                }
                if (op == '%') {

                    ans = num1 % num2;

                }
            } else if (op == 'X' || op == 'x') {
                break;

            }
            else{
                System.out.println("invalid operation");

            }
            System.out.println(ans);
        }
    }
}

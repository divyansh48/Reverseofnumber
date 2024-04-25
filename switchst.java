package com.divyansh;

import java.util.Scanner;

public class switchst {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String fruit = in.next();
//        switch (fruit) {
//            case "mango":
//                System.out.println("king of fruits");
//                break;
//            case "apple":
//                System.out.println("sweet red fruit");
//                break;
//            case "orange":
//                System.out.println("round fruit");
//                break;
//            case "grapes":
//                System.out.println("small fruit");
//                break;
//            default:
//                System.out.println("enter the valid statement");
//                break;
//        }



//        this is the new way of writing switch statement
        switch (fruit) {
            case "mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("sweet red fruit");
            case "orange" -> System.out.println("round fruit");
            case "grapes" -> System.out.println("small fruit");
            default -> System.out.println("enter the valid statement");
        }

    }
}

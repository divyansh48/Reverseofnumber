package com.divyansh;

import java.util.Scanner;

public class nestedswitch {
    public static <string> void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("enter the employee id");
        int empid= in.nextInt();

        switch (empid){
            case 1:
                System.out.println("valid id");
                break;
            case 2:
                System.out.println("valid id");
                break;
            case 3:
                System.out.print("enter the branch");
                String branch = in.next();
                switch (branch){
                    case "IT":
                        System.out.println("IT branch");
                        break;
                    case "CS":
                        System.out.println("CS branch");
                        break;
                    case "electrical":
                        System.out.println("electrical branch");
                        break;
                    default:
                        System.out.println("mechanical branch");
                        break;
                }
                break;
            default:
                System.out.println("invalid employee id");






        }

    }
}

package com.bptn.course.kwoledge_check;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        long factorial = 1;

        for (int i = number; i >= 1; i--) {
            System.out.print(i +" *");
            factorial *= i;

        }

        System.out.println("Factorial: " + factorial);

        scanner.close();
    }
}
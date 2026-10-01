package com.bptn.course._02_scanner;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
				// Fill in the code below
		System.out.println("Eter a character");

		Scanner obj = new Scanner(System.in);
		char  c = obj.next().charAt(0);
				int ascii = c;
				System.out.println("The ASCII value of " + c + " is: " + ascii);
	}
}
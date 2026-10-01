package com.bptn.course._05_strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println("Enter the string to check for palindrome: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		//char[] inputArray = input.toCharArray();
		String reverseInput = "";
		System.out.println("Input : " + input );
		// Fill in the code below to reverse the input string and store it in the reverseInput variable
		for ( int i = input.length()-1; i>=0; i--){

			reverseInput = reverseInput + input.charAt(i);
		}
		//Note: you'll have to write the logic to make that decision, as well.
		if(reverseInput.equals(input)){
			System.out.println("Input string is palindrome");
		}
		else {
			System.out.println("Input string is not palindrome");
		}
	}
}

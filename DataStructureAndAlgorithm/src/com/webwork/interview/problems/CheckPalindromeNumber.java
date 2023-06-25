package com.webwork.interview.problems;

public class CheckPalindromeNumber {
	
	public static void main(String args[]) {
	int number = 121;
	String numberString = Integer.toString(number);
	if(isPalinDromeNumberOrString(numberString)) {
		System.out.println("Palindrome!");
	}else {
		System.out.println("Not Palindrome!");
	}
	
	}

	private static boolean isPalinDromeNumberOrString(String numberString) {
		String reverse = new StringBuilder(numberString).reverse().toString();
		if(reverse.equals(numberString)) {
			return true;
		}else {
			return false;
		}
	}

}

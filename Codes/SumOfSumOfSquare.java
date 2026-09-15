package com.company.number;

public class SumOfSumOfSquare {
	public static int reverseNumber(int number) {
		int reqNumber = 0;
		String strNum = Integer.toString(number);
		StringBuilder sb = new StringBuilder(strNum);
		sb.reverse();
		reqNumber = Integer.parseInt(sb.toString());
		return reqNumber;
	}
	
	public static int sumOfSumOfSquare(int number) {
		int sumOfResults = 0;
		number = reverseNumber(number);
		while(number != 0) {
			int var = number;
			int result = 0;
			while(var != 0) {
				int digit = var % 10;
				result = result + digit * digit;
				var = var / 10;
			}
			sumOfResults = sumOfResults + result;
			number = number / 10;
		}
		return sumOfResults;
	}
	public static void main(String[] args) {
		int number  = 234;
		int result = sumOfSumOfSquare(number);
		System.out.println("Number = " + number);
		System.out.println("Result = " + result);
	}
}

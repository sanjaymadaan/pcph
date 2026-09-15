package com.company.number;


//Sum of Sum of Square of Digits in Cyclic Order
//
//1234
//
//12 + 22 + 32 + 42  = 1+4+9+16 = 30
//234
//22 + 32 + 42  = 4+9+16 = 29
//34
//32 + 42  =  9+16 = 25
//4
//42  =  16 = 16
//
//30 + 29 + 25 + 16 = 100

public class SumOfSumOfSquare {
	public static int reverseNumber(int number) {
		int revNum = 0;
		String str = Integer.toString(number);
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		revNum = Integer.parseInt(sb.toString());
		return revNum;
	}
	public static int sumOfSquare(int number) {
		int result = 0;
		while(number != 0) {
			int digit = number % 10;
			result = result + digit * digit;
			number /= 10;
		}
		return result;
	}
	public static void main(String[] args) {
		int number = 1234;
		int reqNum = reverseNumber(number);
		int reqTotal = 0;
		
		while(reqNum != 0) {
			reqTotal = reqTotal + sumOfSquare(reqNum);  //4321
			reqNum = reqNum / 10;
		}
		System.out.println("Result = " + reqTotal);
	}
}

package chap05.q;

import java.util.Scanner;

public class Factorial {
	static int factorial(int n) {
		int res = 1;

		for (int i = 2; i <= n; i++)
			res *= i;

		return res;
	}

	public static void main(String[] args) {
		System.out.println(factorial(1));
		System.out.println(factorial(2));
		System.out.println(factorial(3));
		System.out.println(factorial(4));
		System.out.println(factorial(5));
	}
}

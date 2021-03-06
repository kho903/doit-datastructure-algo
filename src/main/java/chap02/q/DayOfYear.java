package chap02.q;

import java.util.Scanner;

public class DayOfYear {
	static int[][] mdays = {
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};

	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	static int dayOfYear(int y, int m, int d) {

		while (--m > 0)
			d += mdays[isLeap(y)][m];

		return d;
	}

	static int leftDayOfYear(int y, int m, int d) {
		int notLeapResult = 365 - dayOfYear(y, m, d);
		return isLeap(y) == 0 ? notLeapResult : notLeapResult + 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;

		System.out.println("그 해 경과 일수를 구합니다.");
		do {
			System.out.print("년 : ");
			int year = sc.nextInt();
			System.out.print("월 : ");
			int month = sc.nextInt();
			System.out.print("일 : ");
			int day = sc.nextInt();

			System.out.printf("그 해 %d일 째입니다.\n", dayOfYear(year, month, day));
			System.out.printf("그 해 님은 일 수는 %d일입니다.\n", leftDayOfYear(year, month, day));

			System.out.print("retry? (1. Yes / 2. No) :");
			retry = sc.nextInt();
		} while (retry == 1);
	}
}

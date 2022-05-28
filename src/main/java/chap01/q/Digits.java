package chap01.q;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n : ");
		int n = sc.nextInt();
		int ans = 0;
		while (n > 0) {
			n /= 10;
			ans++;
		}
		System.out.printf("n은 %d자리입니다.", ans);
	}
}

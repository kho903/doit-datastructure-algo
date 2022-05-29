package chap02.q;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	static void swap(int[] a, int idx1, int idx2) {
		System.out.printf("a[%d]와 a[%d]를 교환합니다.\n", idx1, idx2);
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		System.out.println(Arrays.toString(a));
	}

	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
		}
		System.out.println("역순 정렬을 마쳤습니다.");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수: ");

		int n = sc.nextInt();

		int[] x = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		reverse(x);
	}
}

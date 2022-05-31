package chap03.q;

import java.util.Scanner;

public class SeqSearchSen {

	static int seqSearchSen(int[] a, int n, int key) {
		int i;
		a[n] = key;

		for (i = 0; i < n; i++) {
			if (a[i] == key)
				break;
		}
		return i == n ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num + 1];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		System.out.print("검색 값 : ");
		int key = sc.nextInt();

		int idx = seqSearchSen(x, num, key);

		if (idx == -1)
			System.out.println("검색 값의 요소가 없습니다.");
		else
			System.out.println("검색 값은 x[" + idx + "]에 있습니다.");

	}
}

package chap03;

import java.util.Scanner;

public class BinarySearch {
	static int binarySearch(int[] a, int n, int key) {
		int left = 0;
		int right = n - 1;

		do {
			int mid = (left + right) / 2;
			if (a[mid] == key)
				return mid;
			else if (a[mid] < key)
				left = mid + 1;
			else
				right = mid - 1;
		} while (left <= right);

		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num];

		System.out.println("오름차순으로 입력하세요.");

		System.out.print("x[0]: ");
		x[0] = sc.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]: ");
				x[i] = sc.nextInt();
			} while (x[i] < x[i - 1]);
		}

		System.out.print("검색할 값: ");
		int ky = sc.nextInt();

		int idx = binarySearch(x, num, ky);

		if (idx == -1)
			System.out.println("검색 값의 요소가 없습니다.");
		else
			System.out.println("검색 값은 x[" + idx + "]에 있습니다.");

	}
}

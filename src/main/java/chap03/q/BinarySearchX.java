package chap03.q;

import java.util.Scanner;

public class BinarySearchX {
	static int binSearchX(int[] a, int n, int key) {
		int left = 0;
		int right = n - 1;
		do {
			int mid = (left + right) / 2;
			if (a[mid] == key) {
				for (; mid > left; mid--)
					if (a[mid - 1] < key)
						break;
				return mid;
			} else if (a[mid] < key)
				left = mid + 1;
			else
				right = mid - 1;
		} while (left <= right);

		return -1;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];

		System.out.println("오름차순으로 입력하세요.");

		System.out.print("x[0] : ");
		x[0] = sc.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt();
			} while (x[i] < x[i - 1]);
		}

		System.out.print("검색 값 : ");
		int ky = sc.nextInt();

		int idx = binSearchX(x, num, ky);

		if (idx == -1)
			System.out.println("그 값의 요소는 존재하지 않습니다.");
		else
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
	}
}

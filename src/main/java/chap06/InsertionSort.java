package chap06;

import java.util.Arrays;

public class InsertionSort {
	static void insertionSort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			int j;
			int tmp = a[i];
			for (j = i; j > 0 && a[j - 1] > tmp; j--)
				a[j] = a[j - 1];
			a[j] = tmp;
		}
	}

	public static void main(String[] args) {
		System.out.println("단순 삽입 정렬");

		int[] a = {3, 2, 5, 1, 9, 7, 8};
		insertionSort(a, a.length);
		System.out.println(Arrays.toString(a));
		a = new int[] {5, 2, 3, 1, 9, 6};
		insertionSort(a, a.length);
		System.out.println(Arrays.toString(a));
	}
}

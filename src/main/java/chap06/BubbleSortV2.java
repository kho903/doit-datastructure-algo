package chap06;

import java.util.Arrays;

public class BubbleSortV2 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			int change = 0;
			for (int j = n - 1; j > i; j--)
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					change++;
				}
			if (change == 0) break;
		}
	}

	public static void main(String[] args) {
		System.out.println("Bubble Sort V2");
		int[] a = {3, 2, 5, 1, 9, 7, 8};
		bubbleSort(a, a.length);
		System.out.println(Arrays.toString(a));
		a = new int[] {5, 2, 3, 1, 9, 6};
		bubbleSort(a, a.length);
		System.out.println(Arrays.toString(a));
	}
}

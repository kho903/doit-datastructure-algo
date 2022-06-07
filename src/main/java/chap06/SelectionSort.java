package chap06;

import java.util.Arrays;

public class SelectionSort {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void selectionSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[min])
					min = j;
			}
			swap(a, i, min);
		}
	}

	public static void main(String[] args) {
		System.out.println("Selection Sort");
		int[] a = {3, 2, 5, 1, 9, 7, 8};
		selectionSort(a, a.length);
		System.out.println(Arrays.toString(a));
		a = new int[] {5, 2, 3, 1, 9, 6};
		selectionSort(a, a.length);
		System.out.println(Arrays.toString(a));
	}
}

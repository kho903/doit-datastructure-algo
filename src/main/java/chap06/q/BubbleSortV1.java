package chap06.q;

import java.util.Arrays;

public class BubbleSortV1 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void bubbleSort(int[] a, int n) {
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++)
				if (a[j] > a[j + 1])
					swap(a, j, j + 1);
		}
	}

	public static void main(String[] args) {
		System.out.println("Bubble Sort V1");
		int[] a = {3, 2, 5, 1, 9, 7, 8};
		bubbleSort(a, a.length);
		System.out.println(Arrays.toString(a));
		a = new int[] {5, 2, 3, 1, 9, 6};
		bubbleSort(a, a.length);
		System.out.println(Arrays.toString(a));
	}
}

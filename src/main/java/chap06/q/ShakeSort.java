package chap06.q;

import java.util.Arrays;

public class ShakeSort {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void shakeSort(int[] a, int n) {
		int left = 0;
		int right = n - 1;
		int last = right;

		while (left < right) {
			for (int j = right; j > left; j--) {
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					last = j;
				}
			}
			left = last;

			for (int j = left; j < right; j++) {
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
					last = j;
				}
			}
			right = last;
		}
	}

	public static void main(String[] args) {
		System.out.println("Shake Sort");
		int[] a = {3, 2, 5, 1, 9, 7, 8};
		shakeSort(a, a.length);
		System.out.println(Arrays.toString(a));
		a = new int[] {5, 2, 3, 1, 9, 6};
		shakeSort(a, a.length);
		System.out.println(Arrays.toString(a));
	}
}

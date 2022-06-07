package chap06;

import java.util.Arrays;

public class QuickSort {
	static void swap(int[] a, int idx1, int idx2) {
		int tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
	}

	static void quickSort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int pivot = a[(pl + pr) / 2];

		do {
			while (a[pl] < pivot) pl++;
			while (a[pr] > pivot) pr--;
			if (pl <= pr)
				swap(a, pl++, pr--);
		} while (pl <= pr);

		if (left < pr) quickSort(a, left, pr);
		if (pl < right) quickSort(a, pl, right);
	}

	public static void main(String[] args) {

		int[] a = {3, 2, 5, 1, 9, 7, 8};
		quickSort(a,0,  a.length - 1);
		System.out.println(Arrays.toString(a));
		a = new int[] {5, 2, 3, 1, 9, 6};
		quickSort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}
}

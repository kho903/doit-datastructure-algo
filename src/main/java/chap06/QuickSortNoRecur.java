package chap06;

import java.util.Arrays;

import chap04.IntStack;

public class QuickSortNoRecur {
	static void swap(int[] a, int idx1, int idx2) {
		int tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
	}

	static void quickSort(int[] a, int left, int right) {
		IntStack lstack = new IntStack(right - left + 1);
		IntStack rstack = new IntStack(right - left + 1);

		lstack.push(left);
		rstack.push(right);

		while (lstack.isEmpty() != true) {
			int pl = left = lstack.pop();
			int pr = right = rstack.pop();
			int x = a[(left + right) / 2];

			do {
				while (a[pl] < x) pl++;
				while (a[pr] > x) pr--;
				if (pl <= pr)
					swap(a, pl++, pr--);
			} while (pl <= pr);

			if (left < pr) {
				lstack.push(left);
				rstack.push(pr);
			}
			if (pl < right) {
				lstack.push(pl);
				rstack.push(right);
			}
		}
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

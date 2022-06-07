package chap06;

import java.util.Arrays;

public class ShellSortV2 {
	static void shellSort(int[] a, int n) {
		int h;
		for (h = 1; h < n / 9; h = h * 3 + 1);

		for (; h > 0; h /= 3) {
			for (int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				for (j = i - h; j >= 0 && a[j] > tmp; j -= h)
					a[j + h] = a[j];
				a[j + h] = tmp;
			}
		}
	}


	public static void main(String[] args) {
		System.out.println("셸 정렬 (V2)");

		int[] a = {3, 2, 5, 1, 9, 7, 8};
		shellSort(a, a.length);
		System.out.println(Arrays.toString(a));
		a = new int[] {5, 2, 3, 1, 9, 6};
		shellSort(a, a.length);
		System.out.println(Arrays.toString(a));
	}
}

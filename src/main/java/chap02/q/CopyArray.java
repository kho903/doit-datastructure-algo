package chap02.q;

import java.util.Arrays;

public class CopyArray {
	static void copy(int[] a, int[] b) {
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
	}

	static void rcopy(int[] a, int[] b) {
		for (int i = 0; i < b.length; i++) {
			a[b.length - i - 1] = b[i];
		}
	}

	public static void main(String[] args) {
		int[] b = {1,2,3,4,5};
		int[] a1 = new int[b.length];
		int[] a2 = new int[b.length];

		copy(a1, b);
		rcopy(a2, b);

		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));

	}
}

package chap06.q;

import java.util.Arrays;

public class BubbleSortV1Print {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void bubbleSort(int[] a, int n) {

		int ccnt = 0;			// 비교 회수
		int scnt = 0;			// 교환 회수

		for (int i = 0; i < n - 1; i++) {
			System.out.printf("패스%d : \n", i + 1);
			for (int j = n - 1; j > i; j--) {
				for (int m = 0; m < n - 1; m++)
					System.out.printf("%3d %c" , a[m], (m != j-1) ? ' ' :
						(a[j - 1] > a[j]) ? '+' : '-');
				System.out.printf("%3d\n", a[n - 1]);

				ccnt++;
				if (a[j - 1] > a[j])
					swap(a, j - 1, j);
			}

			for (int m = 0; m < n; m++)
				System.out.printf("%3d  " , a[m]);
			System.out.println();
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

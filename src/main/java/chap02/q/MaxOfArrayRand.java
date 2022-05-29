package chap02.q;

import java.util.Random;

public class MaxOfArrayRand {
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) max = a[i];
		}
		return max;
	}

	public static void main(String[] args) {
		Random rand = new Random();

		int n = rand.nextInt(20);
		System.out.printf("%d 명의 키의 최댓값을 구합니다.", n);
		System.out.println();

		int[] height = new int[n];
		for (int i = 0; i < n; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.printf("height[%d] = %d", i, height[i]);
			System.out.println();
		}

		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
	}
}

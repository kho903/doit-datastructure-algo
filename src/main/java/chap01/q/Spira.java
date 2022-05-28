package chap01.q;

public class Spira {
	static void spira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < 2 * n; j++) {
				if (j > n - i && j < n + i) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		spira(4);
	}
}

/*
1 : 4
2 : 3, 4, 5
3 : 2, 3, 4, 5, 6
4 : 1, 2, 3, 4, 5, 6, 7
 */
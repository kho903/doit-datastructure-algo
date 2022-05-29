package chap02;

public class ArrayEquals {
	static boolean equals(int[] a, int[] b) {
		if (a.length != b.length) return false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {1, 2, 3, 4, 5};
		int[] c = {1, 2, 3, 4, 6};

		System.out.printf("배열 a와 b는 %s\n", (equals(a, b) ? "같습니다" : "같지 않습니다."));
		System.out.printf("배열 a와 c는 %s\n", (equals(a, c) ? "같습니다" : "같지 않습니다."));
	}
}

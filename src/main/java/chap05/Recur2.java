package chap05;

public class Recur2 {
	// 꼬리 재귀 제거
	static void recur(int n) {
		while (n > 0) {
			recur(n - 1);
			System.out.println(n);
			n -= 2;
		}
	}

	public static void main(String[] args) {
		recur(4);
	}
}

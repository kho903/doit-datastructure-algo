package chap01.q;

public class TriangleLB {

	static void triangleLB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		triangleLB(2);
		System.out.println();
		triangleLB(3);
		System.out.println();
		triangleLB(4);
	}
}

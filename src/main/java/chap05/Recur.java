package chap05;

public class Recur {
	static void recur(int n) {
		if (n > 0) {
			recur(n - 1);
			System.out.println(n);
			recur(n - 2);
		}
	}

	public static void main(String[] args) {
		System.out.println("recur(1)");
		recur(1);
		System.out.println("recur(2)");
		recur(2);
		System.out.println("recur(3)");
		recur(3);
		System.out.println("recur(4)");
		recur(4);
		System.out.println("recur(5)");
		recur(5);
	}
}

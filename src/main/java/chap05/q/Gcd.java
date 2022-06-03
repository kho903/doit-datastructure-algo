package chap05.q;

public class Gcd {
	static int gcd(int x, int y) {
		while (y != 0) {
			int t = y;
			y = x % y;
			x = t;
		}

		return x;
	}

	public static void main(String[] args) {
		System.out.println(gcd(1, 2));
		System.out.println(gcd(3, 6));
		System.out.println(gcd(8, 12));
		System.out.println(gcd(10, 8));
		System.out.println(gcd(30, 42));
	}
}

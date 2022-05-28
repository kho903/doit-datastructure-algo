package chap01;

public class Q {
	static int max4(int a, int b, int c, int d) {
		return Math.max(a, Math.max(b, Math.max(c, d)));
	}

	static int min3(int a, int b, int c) {
		return Math.min(a, Math.min(b, c));
	}

	static int min4(int a, int b, int c, int d) {
		return Math.min(a, Math.min(b, Math.min(c, d)));
	}


	static int med3(int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}
	public static void main(String[] args) {
		System.out.println(max4(1, 3, 4, 2));
		System.out.println(min3(1, 3, 4));
		System.out.println(min4(1, 3, 4, 2));
		System.out.println(med3(1, 3, 2));
	}
}

package chap05.q;

public class GCDArray {

	static int gcd(int x, int y) {
		while (y != 0) {
			int t = y;
			y = x % y;
			x = t;
		}
		return x;
	}

	static int gcdArray(int[] a, int start, int n) {
		if (n == 1)
			return a[start];
		else if (n == 2)
			return gcd(a[start], a[start + 1]);
		else
			return gcd(a[start], gcdArray(a, start + 1, n - 1));
	}

	public static void main(String[] args) {
		int[] a = {18, 9, 12, 6};
		System.out.println(gcdArray(a, 0, a.length));
	}
}

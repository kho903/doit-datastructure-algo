package chap05;

import chap04.IntStack;

public class NoRecur {
	static void noRecur(int n) {
		IntStack s = new IntStack(n);

		while (true) {
			if (n > 0) {
				s.push(n);
				n--;
				continue;
			}
			if (!s.isEmpty()) {
				n = s.pop();
				System.out.println(n);
				n -= 2;
				continue;
			}
			break;
		}
	}

	public static void main(String[] args) {
		noRecur(4);
	}
}

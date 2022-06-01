package chap03;

import java.util.Comparator;

public class X {

	public static final Comparator<Integer> COMPARATOR = new Comp();

	private static class Comp implements Comparator<Integer> {
		@Override
		public int compare(Integer d1, Integer d2) {
			if (d1 > d2) return 1;
			else if (d1 < d2) return -1;
			else return 0;
		}
	}
}

package chap06;

import static java.util.Calendar.*;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class SortCalendar {
	public static void main(String[] args) {
		GregorianCalendar[] x = {
			new GregorianCalendar(2017, NOVEMBER, 1),
			new GregorianCalendar(1996, NOVEMBER, 2),
			new GregorianCalendar(2022, JUNE, 8)
		};

		Arrays.sort(x);

		for (GregorianCalendar g : x) {
			System.out.printf("%04d년 %02d월 %02d일\n",
				g.get(YEAR),
				g.get(MONTH) + 1,
				g.get(DATE)
			);
		}
	}
}

package chap05.q;

import java.util.Scanner;

public class HanoiString {

	static String[] tower = {"A 기둥", "B 기둥", "C 기둥"};
	static void move(int no, int x, int y) {
		if (no > 1)
			move(no - 1, x, 6 - x - y);
		System.out.printf("원반[%d]을 %s 기둥에서 %s 기둥으로 옮김\n", no, tower[x - 1], tower[y - 1]);
		if (no > 1)
			move(no - 1, 6 - x - y, y);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("하노이 탑");
		System.out.print("원반 갯수 : ");
		int n = sc.nextInt();
		move(n, 1, 3);
	}

}

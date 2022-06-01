package chap04;

import java.util.Scanner;

public class IntStackTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(64);

		while (true) {
			System.out.println(); // 메뉴 구분을 위한 빈 행 추가
			System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.capacity());
			System.out.print("(1)푸시　(2)팝　(3)피크　(4)덤프　(0)종료: ");

			int menu = sc.nextInt();
			if (menu == 0) break;

			int x;
			switch (menu) {
				case 1:                                // push
					System.out.print("데이터: ");
					x = sc.nextInt();
					try {
						s.push(x);
					} catch (IntStack.OverflowIntStackException e) {
						System.out.println("스택이 가득 찼습니다.");
					}
					break;

				case 2:                                // pop
					try {
						x = s.pop();
						System.out.println("pop 한 데이터는 " + x + "입니다.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어있습니다.");
					}
					break;

				case 3:                                // peek
					try {
						x = s.peek();
						System.out.println("peek 한 데이터는 " + x + "입니다.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어있습니다.");
					}
					break;

				case 4:                                // dump
					s.dump();
					break;
			}
		}
	}
}

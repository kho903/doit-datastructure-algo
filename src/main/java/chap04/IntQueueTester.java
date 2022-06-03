package chap04;

import java.util.Scanner;

public class IntQueueTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntQueue s = new IntQueue(8);
		while (true) {
			System.out.println("현재 데이터 수 : " + s.size() + " / " + s.getMax());
			System.out.print("(1) enqueue (2) dequeue (3) peek (4) dump (0) exit : ");
			int menu = sc.nextInt();
			if (menu == 0) break;

			int x;
			switch (menu) {
				case 1: // enqueue
					System.out.println("데이터 : ");
					x = sc.nextInt();
					try {
						s.enqueue(x);
					} catch (IntQueue.OverflowIntQueueException e) {
						System.out.println("큐가 가득 찼습니다.");
					}
					break;
				case 2: // dequeue
					try {
						x = s.dequeue();
						System.out.printf("dequeue한 데이터는 %d입니다.\n", x);
					} catch (IntQueue.EmptyIntQueueException e) {
						System.out.println("큐가 비어 있습니다.");
					}
					break;
				case 3:
					try {
						x = s.peek();
						System.out.printf("peek 한 데이터는 %d입니다.\n", x);
					} catch (IntQueue.EmptyIntQueueException e) {
						System.out.println("큐가 비어 있습니다.");
					}
					break;
				case 4:
					s.dump();
					break;
			}
		}
	}
}

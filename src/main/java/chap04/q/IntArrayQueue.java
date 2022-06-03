package chap04.q;

public class IntArrayQueue {
	private int max;
	private int num;
	private int[] queue;

	public static class EmptyIntArrayQueueException extends RuntimeException {
		public EmptyIntArrayQueueException() {
		}
	}

	//--- 실행 시 예외 : 큐가 가득 참 ---//
	public static class OverflowIntArrayQueueException extends RuntimeException {
		public OverflowIntArrayQueueException() {
		}
	}

	public IntArrayQueue(int max) {
		this.max = max;
		num = 0;
		try {
			queue = new int[max];
		} catch (OutOfMemoryError error) {
			this.max = 0;
		}
	}

	public int enque(int x) {
		if (num >= max)
			throw new OverflowIntArrayQueueException();
		queue[num++] = x;
		return x;
	}

	public int deque() {
		if (num <= 0)
			throw new EmptyIntArrayQueueException();
		int x = queue[0];
		for (int i = 0; i < num - 1; i++)
			queue[i] = queue[i + 1];
		num--;
		return x;
	}

	public int peek() {
		if (num <= 0)
			throw new EmptyIntArrayQueueException();
		return queue[num - 1];
	}

	public int indexOf(int x) {
		for (int i = 0; i < num; i++)
			if (queue[i] == x)
				return i;
		return -1;
	}

	public void clear() {
		num = 0;
	}

	public int getMax() {
		return max;
	}

	public int size() {
		return num;
	}

	public boolean isEmpty() {
		return num <= 0;
	}

	public boolean isFull() {
		return num >= max;
	}

	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비어 있습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(queue[i] + " ");
			System.out.println();
		}
	}
}

package chap04;

public class IntQueue {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] queue;

	public int getMax() {
		return max;
	}

	public static class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
		}
	}

	public static class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
		}
	}

	public IntQueue(int max) {
		num = front = rear = 0;
		this.max = max;
		try {
			queue = new int[this.max];
		} catch (OutOfMemoryError e) {
			this.max = 0;
		}
	}

	public int enqueue(int x) {
		if (num >= max)
			throw new OverflowIntQueueException();
		queue[rear++] = x;
		num++;
		if (rear == max)
			rear = 0;
		return x;
	}

	public int dequeue() {
		if (num <= 0)
			throw new EmptyIntQueueException();
		int x = queue[front++];
		num--;
		if (front == max)
			front = 0;
		return x;
	}

	public int peek() {
		if (num <= 0)
			throw new EmptyIntQueueException();
		return queue[front];
	}

	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (queue[idx] == x)
				return idx;
		}
		return -1;
	}

	public void clear() {
		num = front = rear = 0;
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
				System.out.print(queue[(i + front) % max] + " ");
			System.out.println();
		}
	}
}

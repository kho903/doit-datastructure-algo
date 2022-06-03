package chap04.q;

public class IntDeque {
	private int[] queue;
	private int max;
	private int num;
	private int front;
	private int rear;

	public int getMax() {
		return max;
	}

	public static class EmptyIntDequeException extends RuntimeException {
		public EmptyIntDequeException() {
		}
	}

	public static class OverflowIntDequeException extends RuntimeException {
		public OverflowIntDequeException() {
		}
	}

	public IntDeque(int max) {
		num = front = rear = 0;
		this.max = max;
		try {
			queue = new int[this.max];
		} catch (OutOfMemoryError e) {
			this.max = 0;
		}
	}

	public int enqueueFront(int x) {
		if (num >= max)
			throw new OverflowIntDequeException();
		num++;
		if (--front < 0)
			front = max - 1;
		queue[front] = x;
		return x;
	}

	public int enqueueRear(int x) {
		if (num >= max)
			throw new OverflowIntDequeException();
		queue[rear++] = x;
		num++;
		if (rear == max)
			rear = 0;
		return x;
	}

	public int dequeueFront() {
		if (num <= 0)
			throw new EmptyIntDequeException();
		int x = queue[front++];
		num--;
		if (front == max)
			front = 0;
		return x;
	}

	public int dequeueRear() {
		if (num <= 0)
			throw new EmptyIntDequeException();
		num--;
		if (--rear < 0)
			rear = max - 1;
		return queue[rear];
	}

	public int peekFront() {
		if (num <= 0)
			throw new EmptyIntDequeException();
		return queue[front];
	}

	public int peekRear() {
		if (num <= 0)
			throw new EmptyIntDequeException();
		return queue[rear == 0 ? max - 1 : rear - 1];
	}

	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (queue[idx] == x)
				return idx;
		}
		return -1;
	}

	public int search(int x) {
		for (int i = 0; i < num; i++)
			if (queue[(i + front) % max] == x)
				return i + 1;
		return 0;
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
			System.out.println("덱이 비어 있습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(queue[(i + front) % max] + " ");
			System.out.println();
		}
	}
}

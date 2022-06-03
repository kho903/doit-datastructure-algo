package chap04.q;

public class Gqueue<T> {
	private int max;
	private int num;
	private int front;
	private int rear;
	private T[] queue;

	public int getMax() {
		return max;
	}

	public static class EmptyGqueueException extends RuntimeException {
		public EmptyGqueueException() {
		}
	}

	public static class OverflowGqueueException extends RuntimeException {
		public OverflowGqueueException() {
		}
	}

	public Gqueue(int max) {
		num = front = rear = 0;
		this.max = max;
		try {
			queue = (T[])new Object[this.max];
		} catch (OutOfMemoryError error) {
			this.max = 0;
		}
	}

	public T enqueue(T x) {
		if (num >= max)
			throw new OverflowGqueueException();
		queue[rear++] = x;
		num++;
		if (rear == max)
			rear = 0;
		return x;
	}

	public T dequeue() {
		if (num <= 0)
			throw new EmptyGqueueException();
		T x = queue[front++];
		num--;
		if (front == max)
			front = 0;
		return x;
	}

	public T peek() {
		if (num <= 0)
			throw new EmptyGqueueException();
		return queue[front];
	}

	public int indexOf(T x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (queue[idx].equals(x))
				return i + front;
		}
		return -1;
	}

	public int search(T x) {

		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (queue[idx].equals(x))
				return i + 1;
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
			System.out.println("큐가 비었습니다.");
		else {
			for (int i = 0; i < num; i++) {
				int idx = (i + front) % max;
				System.out.print(queue[idx].toString() + " ");
			}
			System.out.println();
		}
	}
}

package chap04.q;

public class MyStack<T> {
	private int max;
	private int ptr;
	private T[] stk;


	public static class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}

	public static class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}


	public MyStack(int max) {
		ptr = 0;
		this.max = max;

		try {
			stk = (T[]) new Object[max];
		} catch (OutOfMemoryError error) {
			this.max = 0;
		}
	}

	public T push(T x) {
		if (ptr >= max)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}

	public T pop() {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}

	public T peek() {
		if (ptr <=0)
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}

	public int indexOf(T t) {
		for (int i = ptr - 1; i >= 0; i--) {
			if (stk[i] == t) return i;
		}
		return -1;
	}

	public void clear() {
		ptr = 0;
	}


	public int capacity() {
		return max;
	}

	public int size() {
		return ptr;
	}


	public boolean isEmpty() {
		return ptr <= 0;
	}

	public boolean isFull() {
		return ptr >= max;
	}

	public void dump() {
		if (ptr <= 0)
			System.out.println("스택이 비어있습니다.");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
}

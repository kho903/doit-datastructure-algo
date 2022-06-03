package chap04.q;

public class DoubleHeadIntStack {

	private int[] stk;
	private int max;
	private int ptrLeft;
	private int ptrRight;

	public enum RightLeft {StackLeft, StackRight};

	public int getMax() {
		return max;
	}

	public static class EmptyDoubleHeadIntStackException extends RuntimeException {
		public EmptyDoubleHeadIntStackException() {
		}
	}

	public static class OverflowDoubleHeadIntStackException extends RuntimeException {
		public OverflowDoubleHeadIntStackException() {
		}
	}

	public DoubleHeadIntStack(int max) {
		ptrLeft = 0;
		ptrRight = max - 1;
		this.max = max;
		stk = new int[this.max];
	}

	public int push(RightLeft rl, int x) {
		if (ptrLeft >= ptrRight + 1)
			throw new OverflowDoubleHeadIntStackException();
		switch (rl) {
			case StackLeft:
				stk[ptrLeft++] = x;
				break;
			case StackRight:
				stk[ptrRight--] = x;
				break;
		}
		return x;
	}

	public int pop(RightLeft rl) {
		int x = 0;
		switch (rl) {
			case StackLeft:
				if (ptrLeft <= 0)
					throw new EmptyDoubleHeadIntStackException();
				x = stk[--ptrLeft];
			case StackRight:
				if (ptrRight >= max - 1)
					throw new EmptyDoubleHeadIntStackException();
				x = stk[++ptrRight];
				break;
		}
		return x;
	}

	public int peek(RightLeft rl) {
		int x = 0;
		switch (rl) {
			case StackLeft:
				if (ptrLeft <= 0)
					throw new EmptyDoubleHeadIntStackException();
				x = stk[ptrLeft - 1];
			case StackRight:
				if (ptrRight >= max - 1)
					throw new EmptyDoubleHeadIntStackException();
				x = stk[ptrRight + 1];
				break;
		}
		return x;
	}

	public int indexOf(RightLeft rl, int x) {
		switch (rl) {
			case StackLeft:
				for (int i = ptrLeft - 1; i >= 0; i--) {
					if (stk[i] == x)
						return i;
				}
				break;
			case StackRight:
				for (int i = ptrRight + 1; i < max; i++) {
					if (stk[i] == x)
						return i;
				}
				break;
		}
		return -1;
	}

	public void clear(RightLeft rl) {
		switch (rl) {
			case StackLeft:
				ptrLeft = 0;
				break;
			case StackRight:
				ptrRight = max - 1;
				break;
		}
	}

	public int size(RightLeft rl) {
		switch (rl) {
			case StackLeft:
				return ptrLeft;
			case StackRight:
				return max - ptrRight - 1;
		}
		return 0;
	}

	public boolean isEmpty(RightLeft rl) {
		switch (rl) {
			case StackLeft:
				return ptrLeft <= 0;
			case StackRight:
				return ptrRight >= max - 1;
		}
		return true;
	}

	public boolean isFull() {
		return ptrLeft >= ptrRight + 1;
	}

	public void dump(RightLeft rl) {
		if (isEmpty(rl))
			System.out.println("스택이 비어 있습니다.");
		switch (rl) {
			case StackLeft:
				for (int i = 0; i < ptrLeft; i++)
					System.out.print(stk[i] + " ");
				System.out.println();
				break;
			case StackRight:
				for (int i = max - 1; i > ptrRight; i--)
					System.out.println(stk[i] + " ");
				System.out.println();
				break;
		}
	}

}

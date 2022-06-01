package chap03;

import java.util.Comparator;

public class A implements Comparable<A> {
	// 필드, 메서드 등
	int field;

	@Override
	public int compareTo(A o) {
		// this 가 o보다 크면 양의 값 반환
		// this 가 o보다 작으면 음의 값 반환
		// this 가 c와 같으면 0 반환
		return this.field - o.field;
	}

	@Override
	public boolean equals(Object obj) {
		// this 가 c와 같으면 true
		// this 가 c와 같지 않으면 false 반환
		return super.equals(obj);
	}
}

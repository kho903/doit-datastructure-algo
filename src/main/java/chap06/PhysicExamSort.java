package chap06;

import java.util.Arrays;
import java.util.Comparator;

public class PhysicExamSort {
	static class PhysicData {
		String name;
		int height;
		double vision;

		public PhysicData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		@Override
		public String toString() {
			return name + " " + height + " " + vision;
		}

		static final Comparator<PhysicData> HEIGHT_ORDER = new HeightOrderComparator();

		private static class HeightOrderComparator implements Comparator<PhysicData> {
			@Override
			public int compare(PhysicData o1, PhysicData o2) {
				// return (o1.height > o2.height) ? 1 :	(o1.height < o2.height) ? -1 : 0;
				return Integer.compare(o1.height, o2.height);
			}
		}

	}

	public static void main(String[] args) {
		PhysicData[] x = {
			new PhysicData("이나령", 162, 0.3),
			new PhysicData("전서현", 173, 0.7),
			new PhysicData("이수민", 175, 2.0),
			new PhysicData("홍준기", 171, 1.5),
			new PhysicData("유지훈", 168, 0.4),
			new PhysicData("이호연", 174, 1.2),
			new PhysicData("김한결", 169, 0.8),
		};

		Arrays.sort(x,
			PhysicData.HEIGHT_ORDER
		);

		for (PhysicData p : x) {
			System.out.printf("%s %d %.1f\n", p.name, p.height, p.vision);
		}
	}
}

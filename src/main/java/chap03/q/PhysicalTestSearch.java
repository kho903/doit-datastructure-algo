package chap03.q;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysicalTestSearch {
	static class PhysicalData {
		private String name;
		private int height;
		private double vision;

		public PhysicalData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		@Override
		public String toString() {
			return name + " " + height + " " + vision;
		}

		public static final Comparator<PhysicalData> HEIGHT_ORDER
			= new HeightOrderComparator();

		public static final Comparator<PhysicalData> VISION_ORDER
			= new VisionOrderComparator();

		private static class HeightOrderComparator implements Comparator<PhysicalData> {

			@Override
			public int compare(PhysicalData d1, PhysicalData d2) {
				return (d1.height > d2.height) ? 1 :
					(d1.height < d2.height) ? -1 : 0;
			}
		}

		private static class VisionOrderComparator implements Comparator<PhysicalData> {

			@Override
			public int compare(PhysicalData d1, PhysicalData d2) {
				return (d1.vision > d2.vision) ? 1 :
					(d1.vision < d2.vision) ? -1 : 0;
			}
		}

	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PhysicalData[] x = {
			new PhysicalData("강민하", 162, 0.3),
			new PhysicalData("이수연", 168, 0.4),
			new PhysicalData("황지안", 169, 0.5),
			new PhysicalData("유서범", 171, 0.6),
			new PhysicalData("김찬우", 173, 0.7),
			new PhysicalData("장경오", 174, 1.2),
			new PhysicalData("박준서", 175, 2.0),
		};

		System.out.print("시력이 몇인 사람을 찾고 있나요 ? : ");
		double vision = sc.nextDouble();
		System.out.println(vision);
		int idx = Arrays.binarySearch(
			x,
			new PhysicalData("", 0, vision),
			PhysicalData.VISION_ORDER
		);

		if (idx < 0) {
			System.out.println("요소가 없습니다.");
		} else {
			System.out.println("x[" + idx + "] 에 있습니다.");
			System.out.println("찾은 데이터 : " + x[idx]);
		}
	}
}

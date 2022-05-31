package chap02;

public class Int2DArray {
	public static void main(String[] args) {
		int[][] x = new int[2][4];

		x[0][1] = 37;
		x[0][3] = 54;
		x[1][2] = 65;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.printf("x[%d][%d] = %d\n", i, j, x[i][j]);
			}
		}
	}
}

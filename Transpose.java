
public class Transpose {

	public static void main(String[] args) {
		int[][] a = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 }, { 1, 2, 3 } };

		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < a.length; j++) {

				System.out.print(a[j][i] + " ");
			}

			System.out.println();

		}

	}

}

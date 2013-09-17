public class multi {
	public static void main(String[] args) {
		int[][] a ={  {1, 2, 3, 4, 5},
					  {6, 7, 8, 9, 10},
					  {11, 12, 13, 14, 15} };

		// sumRow(a, 2);
		// sumColumn(a, 2);
		// sumTotal(a, 2);
		//print(reverseRow(a, 2));
		snakeDraft(10, 3);
	}

	public static void print(int[][] a) {
		for (int r=0; r<a.length; r++) {
			for (int c=0; c<a[r].length; c++) {
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
	}

	public static int sumRow(int[][] a, int x) {

		int sum = 0;

		for (int i=0; i<a[x].length; i++) {
			sum += a[x][i];
		}
		System.out.println(sum);
		return sum;
	}

	public static int sumColumn(int[][] a, int x) {
		int sum = 0;

		for (int c=0; c<a.length; c++) {
			sum += a[c][x];
		}
		
		System.out.println(sum);
		return sum;
	}

	public static int sumTotal(int[][] a, int x) {
		int sum = 0;

		for (int r=0; r<a.length; r++) {
			for (int c=0; c<a[r].length; c++) {
				sum += a[r][c];
			}
		}
		System.out.println(sum);
		return sum;
	}

	public static int[][] reverseRow(int[][] a, int x) {
		for (int c=a.length + 1; c>=0; c--) {
			System.out.print(a[x][c] + " ");
		}
		return a;
	}

	public static int[][] snakeDraft(int players, int rounds) {
		int[][] x = new int[rounds][players];
		for (int r=0; r<x.length; r++) {
			for (int c=0; c<x[r].length; c++) {
				for (int i=0; i<x.length; i++) {
					x[r][c] = i;
					System.out.print(x[r][c]);
				}
			}
		}
		return x;
	}
}
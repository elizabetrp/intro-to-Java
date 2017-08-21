package chapter7;

public class RectangularMatrix {
//	�� �� ������ ��������, ����� ������� ����������� ������� � ������
//	(n, m). ������������ � ���������� �� ��������� �� �� ����� ��
//	���������. �� �� ������ ������������ � ������ (3,3), ����� ���
//	���������� ����.

	public static void main(String[] args) {
		int[][] matrix = {{1, 8, 9, 16}, {2, 7, 10, 15}, {3, 6, 11, 14}, {4, 5, 12, 13}, {22, 19, 25, 32}};
		int bestSum = Integer.MIN_VALUE;
		int bestRow = 0;
		int bestCol = 0;
		for (int row = 0; row < matrix.length - 1; row++) {
			for (int col = 0; col < matrix[0].length - 2; col++) {
				int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
						+ matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2]
						+ matrix[row + 1][col] + matrix[row][col + 1];
				if (sum > bestSum) {
					bestSum = sum;
					bestRow = row;
					bestCol = col;
				}
			}
		}
		
		System.out.println("The best platform is: ");
		System.out.printf(" %d %d %d%n", matrix[bestRow - 1][bestCol], matrix[bestRow - 1][bestCol + 1], matrix[bestRow - 1][bestCol + 2]);
		System.out.printf(" %d %d %d%n", matrix[bestRow][bestCol], matrix[bestRow][bestCol + 1], matrix[bestRow][bestCol + 2]);
		System.out.printf(" %d %d %d%n", matrix[bestRow + 1][bestCol], matrix[bestRow + 1][bestCol + 1], matrix[bestRow + 1][bestCol + 2]);
		
		System.out.printf("The maximal sum is: %d%n", bestSum);
	}
}

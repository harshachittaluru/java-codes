package com.assignments.task4;

public class AddTwoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		int[][] sum = new int[3][3];

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				System.out.print(sum[i][j] + " ");
			}
		}
	}

}

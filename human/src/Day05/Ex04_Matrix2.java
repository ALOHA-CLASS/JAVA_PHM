package Day05;

import java.util.Scanner;

public class Ex04_Matrix2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("X : ");
		int X = sc.nextInt();
		System.out.print("Y : ");
		int Y = sc.nextInt();
		System.out.print("Z : ");
		int Z = sc.nextInt();
		
		int arr[][][] = new int[X][Y][Z];
		
		// 입력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		
		// 출력
		for (int[][] depth : arr) {
			for (int[] row : depth) {
				for (int col : row) {
					System.out.print(col + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		sc.close();
	}
}












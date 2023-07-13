package Day02;

import java.util.Scanner;

public class Ex21_Star2 {
	
	public static void main(String[] args) {
		// 입력 : 5
		// *****
		// ****
		// ***
		// **
		// *
		
		Scanner sc = new Scanner(System.in);
		System.out.print("N : ");
		int N = sc.nextInt();
		
		// i : 1, j : 1 2 3 4 5
		// i : 2, j : 1 2 3 4 
		// i : 3, j : 1 2 3  
		// i : 4, j : 1 2   
		// i : 5, j : 1    
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N-i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for (int i = 1; i <= N; i++) {
			for (int j = N; j >= i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}








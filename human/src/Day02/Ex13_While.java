package Day02;

public class Ex13_While {

	public static void main(String[] args) {
		// 1~10 까지 공백을 두고 출력하시오.
		System.out.print(1 + " ");
		System.out.print(2 + " ");
		System.out.print(3 + " ");
		System.out.print(4 + " ");
		System.out.print(5 + " ");
		System.out.print(6 + " ");
		System.out.print(7 + " ");
		System.out.print(8 + " ");
		System.out.print(9 + " ");
		System.out.print(10 + " ");
		System.out.println();
		
		int a = 1;
		
		// while( 조건 ) { 반복 실행문 }
		while( a <= 10 ) {
			System.out.print(a++ + " ");
			// a++;		// a = a + 1;
		}
	}
}

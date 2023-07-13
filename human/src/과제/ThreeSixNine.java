package 과제;

public class ThreeSixNine {
	
	public static void main(String[] args) {
		
		// 1~100 사이의 정수를 반복
		for (int i = 1; i <= 100; i++) {
			int one = i % 10;			// 일의 자리
			int ten = i / 10;			// 십의 자리
			boolean one369 = (one == 3 || one == 6 || one == 9);	// 일의 자리가 369가 되는지 여부
			boolean ten369 = (ten == 3 || ten == 6 || ten == 9);	// 십의 자리가 369가 되는지 여부
			
			// 일의 자리, 십의 자리 모두 369
			if( one369 && ten369 ) {
				// --> **
				System.out.println("**");
			}
			// 그렇지 않고, 둘중의 하나만 369
			else if( one369 || ten369 ) {
				// --> *
				System.out.println("*");
			}
			// 그렇지 않으면,
			else {
				// --> i(숫자) 출력
				System.out.println(i);
			}
			
		}
		
	}

}
package Day01;

public class Ex11_Long {
	
	public static void main(String[] args) {
		
		// int (4byte : 32bits) : 2^32 개  : 42억 개
		// int 수 표현 범위 : -21억xxx ~ 21억xxx
		
		// long (8byte : 64bits) : 2^64 개
		long ln1 = 1000;
		long ln2 = 2100000000;
		// long 타입 리터럴 : 숫자L
		long ln3 = 2200000000L;
		
		int max = Integer.MAX_VALUE;		// int 최댓값
		int min = Integer.MIN_VALUE;		// int 최솟값
		
		System.out.println("int 최댓값 : " + max);
		System.out.println("int 최솟값 : " + min);
		
		System.out.println("ln1 : " + ln1);
		System.out.println("ln2 : " + ln2);
		System.out.println("ln3 : " + ln3);
	}

}

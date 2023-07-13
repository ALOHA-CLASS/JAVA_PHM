package Day01;

public class Ex09_Byte {
	
	public static void main(String[] args) {
		// 1byte = 8bits
		// bit : 0 또는 1 로 표현한 자리
		// 0000 0000
		// 10		--> 2
		// 100		--> 4
		// 0000 0000		: 2^8 	: 256
		// N bit			: 2^n개
		
		// byte 는 1byte 범위의 데이터를 표현
		// 8bits		: 2^8 : 256 개
		// 양수와 음수로 나누면, -128~127
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = (byte) 128;
		// (에러) byte var6 = 200;		// 데이터 범위를 벗어남(오버플로우)
		// - 에러 메시지 : Type mismatch
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
	}

}

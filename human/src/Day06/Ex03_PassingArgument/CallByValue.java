package Day06.Ex03_PassingArgument;

public class CallByValue {
	
	public static int sum(int a, int b) {
		a = 100;
		b = 200;
		
		System.out.println("***** sum 메소드 *****");
		System.out.println("(a, b) : " + a + ", " + b);
		
		return a + b;
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("***** main 메소드 *****");
		System.out.println("(a, b) : " + a + ", " + b);
		
		int result = sum(a, b);
		System.out.println("result : " + result);
		
		System.out.println("***** main 메소드 (sum 호출 후) *****");
		System.out.println("(a, b) : " + a + ", " + b);
		
	}
	
}

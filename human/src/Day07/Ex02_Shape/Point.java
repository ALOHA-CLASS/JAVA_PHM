package Day07.Ex02_Shape;

/**
 * Point 클래스
 * 멤버변수로 정수형 변수 x, y 를 선언하시오.
 * 기본생성자와 x, y를 매개변수로 갖는 생성자를 정의하시오.
 * toString() 메소드를 재정의하시오.
 */
public class Point {
	int x, y;

	// 기본 생성자
	public Point() {
		this(0, 0);
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// toString
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}

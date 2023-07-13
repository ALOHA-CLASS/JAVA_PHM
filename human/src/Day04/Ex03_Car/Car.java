package Day04.Ex03_Car;

/**
 * 
 */
public class Car {
	
	// 멤버변수 == 필드(field)
	String model;
	// private 접근지정자 : 클래스 내부에서만 접근 가능
	private int speed;
	// public int speed;
	
	// 생성자
	public Car() {
		
	}

	public Car(String model) {
		this.model = model;
	}

	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}

	// getter : 변수의 값을 가져오는 메소드
	// setter : 변수의 값을 지정하는 메소드
	// - get/set 뒤에 변수명을 첫글자를 대문자로해서 메소드명을 정의
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if( speed < 0 )
			speed = 0;
		
		if( speed >= 300 )
			speed = 300;
		
		this.speed = speed;
	}
	
	
	
	
	
	
}











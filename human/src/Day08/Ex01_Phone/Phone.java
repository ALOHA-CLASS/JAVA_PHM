package Day08.Ex01_Phone;

// 추상 클래스 
public abstract class Phone {
	
	// 변수
	public String owner;		// 사용자명
	
	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 메소드
	public void turnOn() {
		System.out.println("전원을 켭니다...");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다...");
	}
	

}

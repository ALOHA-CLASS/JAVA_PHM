package Day06.Ex05_StaticMember;

public class SingleTonTest {
	
	public static void main(String[] args) {
		SingleTon st01 = SingleTon.getInstnace();
		SingleTon st02 = SingleTon.getInstnace();
		
		// 인스턴스가 메모리 공간에 하나만 할당 되어있는지 확인
		System.out.println( st01 == st02 );
	}

}

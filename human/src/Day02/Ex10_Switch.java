package Day02;

import java.util.Scanner;

public class Ex10_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("채널을 선택하세요 : ");
		int channel = sc.nextInt();

		// switch : ctrl + space
		switch (channel) {
			case 1:
					System.out.println("넷플릭스 - 마당있는집");
					break;
			case 2:
					System.out.println("디즈니플러스");
					break;
			case 3:
					System.out.println("쿠팡 플레이");
					break;
			case 13:
					System.out.println("(EBS) 세계테마기행");
					break;
			case 33:
					System.out.println("(tvn) ???");
					break;
			default:
					System.out.println("유효한 채널번호를 입력해주세요.");
					break;
		}
		sc.close();
	}
}








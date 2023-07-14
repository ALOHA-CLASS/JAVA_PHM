package Day08.Ex06_MultipleInterface;
public class SmartTelevisionEx {
	
	public static void main(String[] args) {
		
		SmartTelevision tv = new SmartTelevision();
		
		tv.turnOn();
		tv.setVolume(20);
		int channel = tv.channelSearch("MBC");
		tv.setChannel(channel);
		
		String[] contents = tv.contentSearch("아이돌");
		System.out.println("========== 검색된 컨텐츠 ==========");

		for (int i = 0; i < contents.length; i++) {
			System.out.print( contents[i] );
			if( i < contents.length-1 ) 
				System.out.print(", ");
		}
		System.out.println();
		
		tv.receiveVoice("오늘 날씨 어때?");
		
		tv.turnOff();
	}
}

package coupling;

public class SmartWatch implements Watch{
	
	public SmartWatch() {
		System.out.println("스마트 워치 생성됨");
	}
	public void volumeUp() {
		System.out.println("스마트 워치 ++");
	}
	public void volumeDown() {
		System.out.println("스마트 워치 --");
	}
	
}

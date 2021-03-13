package tommy.spring.polymorphism01;

public class TVUser {
	public static void main(String[] args) {
		SamsungTV tv = new SamsungTV();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		//LG 티비로 변경한다면, 유지보수가 정말 힘들것이다..
		
	}
}
package tommy.spring.polymorphism02;

public class TVUser {
	public static void main(String[] args) {
		LgTV tv = new LgTV(); //수정하기 편해짐.
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		/*
		 이렇게 다형성을 이용하면 TVUser와 같은 클라이언트 프로그램이 여러 개 있더라도 최소한
		 의 수정으로 TV를 교체할 수 있다. 따라서 유지보수가 좀 더 편해졌다고 할 수 있다. 
		 */
	}
}
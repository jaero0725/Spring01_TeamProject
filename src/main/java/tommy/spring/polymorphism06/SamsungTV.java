package tommy.spring.polymorphism06;

public class SamsungTV implements TV {

	private Speaker speaker; //다형성을 이용하기 위해  Speaker 로 바꾼다. 
	private int price;
	
	public SamsungTV() {
		System.out.println("SamsungTV 객체 생성");
	}

	public SamsungTV(Speaker speaker) {
		System.out.println("SamsungTV 객체 생성 : 생성자 인젝션");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("SamsungTV 객체 생성 : 생성자 인젝션 다중 인젝션");
		this.speaker = speaker;
		this.price = price;
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}

	@Override
	public void powerOn() {
		System.out.println("Samsung TV 켜기 (가격 :" + price + "원)");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung TV 끄기");
	}
}

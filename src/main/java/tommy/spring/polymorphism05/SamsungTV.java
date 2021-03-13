package tommy.spring.polymorphism05;

public class SamsungTV implements TV {

	private SonySpeaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("SamsungTV 객체 생성");
	}

	public SamsungTV(SonySpeaker speaker, int price) {
		System.out.println("SamsungTV 객체 생성 : 생성자 인젝션 다중 인젝션");
		this.speaker = speaker;
		this.price = price;
	}

	public SamsungTV(SonySpeaker speaker) {
		System.out.println("SamsungTV 객체 생성 : 생성자 인젝션");
		this.speaker = speaker;
	}

	public SonySpeaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(SonySpeaker speaker) {
		this.speaker = speaker;
	}

	// powerOn(), powerOff() 메서드 생략
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

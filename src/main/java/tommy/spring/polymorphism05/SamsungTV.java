package tommy.spring.polymorphism05;

public class SamsungTV implements TV {

	private SonySpeaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("SamsungTV ��ü ����");
	}

	public SamsungTV(SonySpeaker speaker, int price) {
		System.out.println("SamsungTV ��ü ���� : ������ ������ ���� ������");
		this.speaker = speaker;
		this.price = price;
	}

	public SamsungTV(SonySpeaker speaker) {
		System.out.println("SamsungTV ��ü ���� : ������ ������");
		this.speaker = speaker;
	}

	public SonySpeaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(SonySpeaker speaker) {
		this.speaker = speaker;
	}

	// powerOn(), powerOff() �޼��� ����
	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}

	@Override
	public void powerOn() {
		System.out.println("Samsung TV �ѱ� (���� :" + price + "��)");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung TV ����");
	}
}

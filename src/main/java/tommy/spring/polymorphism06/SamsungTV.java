package tommy.spring.polymorphism06;

public class SamsungTV implements TV {

	private Speaker speaker; //�������� �̿��ϱ� ����  Speaker �� �ٲ۴�. 
	private int price;
	
	public SamsungTV() {
		System.out.println("SamsungTV ��ü ����");
	}

	public SamsungTV(Speaker speaker) {
		System.out.println("SamsungTV ��ü ���� : ������ ������");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("SamsungTV ��ü ���� : ������ ������ ���� ������");
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
		System.out.println("Samsung TV �ѱ� (���� :" + price + "��)");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung TV ����");
	}
}

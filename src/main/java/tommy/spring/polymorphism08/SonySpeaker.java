package tommy.spring.polymorphism08;

public class SonySpeaker implements Speaker{

	public SonySpeaker() {
		System.out.println("===> SonySpeaker ��ü ����");
	}

	public void volumeUp() {
		System.out.println("SonySpeaker---�Ҹ� �ø���.");
	}

	public void volumeDown() {
		System.out.println("SonySpeaker---�Ҹ� ������.");
	}

}

package tommy.spring.polymorphism06;

public class AppleSpeaker implements Speaker {

	public AppleSpeaker() {
		super();
		System.out.println("AppleSpeaker ��ü����");
	}

	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker --- �Ҹ� �ø���.");
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker --- �Ҹ� ������.");
	}

}

package tommy.spring.polymorphism09;

import org.springframework.stereotype.Component;

@Component("apple")
public class AppleSpeaker implements Speaker {

	public AppleSpeaker() {
		super();
		System.out.println("AppleSpeaker 按眉积己");
	}

	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker --- 家府 棵赴促.");
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker --- 家府 郴赴促.");
	}

}

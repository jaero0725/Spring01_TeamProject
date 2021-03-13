package tommy.spring.polymorphism09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")  //id가 tv인 얘로 등록을해라~ 객체를 등록.
public class LgTV implements TV{
	
	@Autowired  //충돌해결
	@Qualifier("apple") //id가 apple인 놈을 주입해라.
	private Speaker speaker;
	/*
	 * @Resource 는 두개 합쳐진거..
	 * 
	 */
	@Override
	public void powerOn() {
		System.out.println("LgTV 전원을 켠다.");		
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV 전원을 끈다.");
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
}

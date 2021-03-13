package tommy.spring.polymorphism08;

import org.springframework.stereotype.Component;

@Component("tv")  //id가 tv인 얘로 등록을해라~ 객체를 등록.
public class LgTV implements TV{
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
		System.out.println("LgTV 볼륨을 올린다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("LgTV 볼륨을 내린다.");
		
	}
}

package tommy.spring.polymorphism11;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")  //id가 tv인 얘로 등록을해라~ 객체를 등록.
public class LgTV implements TV{
	
	@Autowired
	private Speaker speaker;
	
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

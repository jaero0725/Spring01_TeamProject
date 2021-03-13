package tommy.spring.polymorphism10;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("tv")  //id�� tv�� ��� ������ض�~ ��ü�� ���.
public class LgTV implements TV{
	
	@Resource(name ="sony")
	private Speaker speaker;
	
	@Override
	public void powerOn() {
		System.out.println("LgTV ������ �Ҵ�.");		
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV ������ ����.");
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

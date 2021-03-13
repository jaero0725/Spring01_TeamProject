package tommy.spring.polymorphism08;

import org.springframework.stereotype.Component;

@Component("tv")  //id�� tv�� ��� ������ض�~ ��ü�� ���.
public class LgTV implements TV{
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
		System.out.println("LgTV ������ �ø���.");
	}

	@Override
	public void volumeDown() {
		System.out.println("LgTV ������ ������.");
		
	}
}

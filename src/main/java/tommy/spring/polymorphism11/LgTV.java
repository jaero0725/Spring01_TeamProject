package tommy.spring.polymorphism11;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")  //id�� tv�� ��� ������ض�~ ��ü�� ���.
public class LgTV implements TV{
	
	@Autowired
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

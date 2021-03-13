package tommy.spring.polymorphism09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")  //id�� tv�� ��� ������ض�~ ��ü�� ���.
public class LgTV implements TV{
	
	@Autowired  //�浹�ذ�
	@Qualifier("apple") //id�� apple�� ���� �����ض�.
	private Speaker speaker;
	/*
	 * @Resource �� �ΰ� ��������..
	 * 
	 */
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

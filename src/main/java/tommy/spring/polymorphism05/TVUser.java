package tommy.spring.polymorphism05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		//1. spring container�� ����.
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. Spring Container�� ���� ���ϴ� ��ü�� ����.
		TV tv = (TV) factory.getBean("tv");
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		//3. Spring Container ����
		factory.close();
	}
}

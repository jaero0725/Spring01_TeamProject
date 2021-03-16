package tommy.spring.lifecycle02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class MyLifeBeanMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("applicationContext.xml");
	
		MyLifeBean bean = (MyLifeBean) ctx.getBean("myLifeBean"); //mapping
		bean.sayHello();
		ctx.close();
	}
/*
	1. ���� ������ ����
	2. ���� setter �޼��� ����.
	3. ���� �̸� ����
	---> myLifeBean
	4. �� ���丮 ����
	---> class org.springframework.beans.factory.xml.XmlBeanFactory
	8. �ʱ�ȭ ���� �� ���� ó���� ����
	6. Property ���� �Ϸ�
	7. �ʱ�ȭ �޼��� ����.
	5. �ʱ�ȭ ���� �� ���� ó���� ����
	hellomyLifeBean !!
	���� 
 
 */
}

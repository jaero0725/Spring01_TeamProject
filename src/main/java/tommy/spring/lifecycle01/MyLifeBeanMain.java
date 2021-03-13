package tommy.spring.lifecycle01;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class MyLifeBeanMain {

	public static void main(String[] args) {
		
		// 1. spring container�� ����.
		FileSystemResource resource = new FileSystemResource("src/main/resources/applicationContext.xml");
		
		@SuppressWarnings("deprecation")
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		factory.addBeanPostProcessor(new CustomBeanPostProcessor());
		MyLifeBean bean = (MyLifeBean) factory.getBean("myLifeBean"); //mapping
		bean.sayHello();
		factory.destroyBean("myLifeBean", bean);

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

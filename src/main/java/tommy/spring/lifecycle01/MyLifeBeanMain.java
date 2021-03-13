package tommy.spring.lifecycle01;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class MyLifeBeanMain {

	public static void main(String[] args) {
		
		// 1. spring container를 구동.
		FileSystemResource resource = new FileSystemResource("src/main/resources/applicationContext.xml");
		
		@SuppressWarnings("deprecation")
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		factory.addBeanPostProcessor(new CustomBeanPostProcessor());
		MyLifeBean bean = (MyLifeBean) factory.getBean("myLifeBean"); //mapping
		bean.sayHello();
		factory.destroyBean("myLifeBean", bean);

	}
/*
	1. 빈의 생성자 실행
	2. 빈의 setter 메서드 실행.
	3. 빈의 이름 설정
	---> myLifeBean
	4. 빈 팩토리 설정
	---> class org.springframework.beans.factory.xml.XmlBeanFactory
	8. 초기화 후의 빈에 대한 처리를 실행
	6. Property 설정 완료
	7. 초기화 메서드 수행.
	5. 초기화 전에 빈에 대한 처리를 실행
	hellomyLifeBean !!
	종료 
 
 */
}

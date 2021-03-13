package tommy.spring.lifecycle02;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//Bean의 라이프 사이클을 알아보자. 
//MyLifeBean, BeanNameAware, BeanFacotryAware, InitializingBean, DisposableBean 상속 받음
public class MyLifeBeanImpl implements MyLifeBean, BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {

	private String greeting;
	private String beanName;
	private BeanFactory beanFactory;

	//생성자
	public MyLifeBeanImpl() {
		System.out.println("1. 빈의 생성자 실행");
	}
	
	//setter 
	public void setGreeting(String greeting) {
		this.greeting = greeting;
		System.out.println("2. 빈의 setter 메서드 실행.");
	}

	// MyLifeBean
	@Override
	public void sayHello() {
		System.out.println(greeting + beanName + " !!");
	}

	// BeanNameAware
	@Override
	public void setBeanName(String beanName) {
		System.out.println("3. 빈의 이름 설정");
		this.beanName = beanName;
		System.out.println("---> " + this.beanName);

	}
	
	//BeanFactoryAware
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("4. 빈 팩토리 설정");
		this.beanFactory = beanFactory;
		System.out.println("---> " + this.beanFactory.getClass());
	}
	
	//InitializingBean
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("6. Property 설정 완료");
	}

	public void init() {
		System.out.println("7. 초기화 메서드 수행.");
	}

	// DisposableBean
	@Override
	public void destroy() throws Exception {
		System.out.println("종료");
	}

}

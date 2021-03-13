package tommy.spring.lifecycle02;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("5. 초기화 전에 빈에 대한 처리를 실행");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("8. 초기화 후의 빈에 대한 처리를 실행");
		return bean;
	}

}

/*
 * Bean Factory를 IoC Container 로 사용하는 경우에는 단순히 addBeanPostProcessor() 메서드를 이용하여
 * 프로그램 방식으로만 빈 후처리기(Bean Post Processor)를 등록함.
 * 
 * 
 * 
 * 빈 후처리 과정 (Process of Bean Postprocessing)
 * 
 * 1) 빈 객체(Bean Instance) 생성 (생성자(Constructor) 또는 팩토리 메서드(Factory Method) 사용).
 * 2) 빈 프로퍼티(Bean Property)에 값과 빈 레퍼런스 설정. 3) Aware Interface에 정의된 Setter 메서드 호출
 * 4) 빈 인스턴스(Bean Instance)를 각 빈 후처리기(Bean Post Processor)의
 * postProcessBeforeInitialization() 에 전달. 5) 초기화 Callback 메서드 호출 6) 빈 인스턴스(Bean
 * Instance)를 각 빈 후처리기(Bean Post Processor)의 postProcessAfterInitialization() 에
 * 전달. 7) 빈 사용 준비 완료 8) 컨테이너 종료 후, 소멸(Destructor) Callback 메서드 호출
 * 
 * 
 * [BeanFactory 인터페이스] - 빈 객체를 관리하고 각 빈 객체 간의 의존 관계를 설정해주는 기능 제공. - 가장 단순한 컨테이너.
 * 
 * [XmlBeanFactory 클래스] - 외부 자원으로부터 설정 정보를 읽어 와 빈 객체를 생성하는 클래스
 * 
 * 
 * 
 * 출처: https://ooz.co.kr/217 [이러쿵저러쿵]
 * 
 * 
 */
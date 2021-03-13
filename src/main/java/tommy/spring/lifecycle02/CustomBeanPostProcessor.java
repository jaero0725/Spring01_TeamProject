package tommy.spring.lifecycle02;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("5. �ʱ�ȭ ���� �� ���� ó���� ����");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("8. �ʱ�ȭ ���� �� ���� ó���� ����");
		return bean;
	}

}

/*
 * Bean Factory�� IoC Container �� ����ϴ� ��쿡�� �ܼ��� addBeanPostProcessor() �޼��带 �̿��Ͽ�
 * ���α׷� ������θ� �� ��ó����(Bean Post Processor)�� �����.
 * 
 * 
 * 
 * �� ��ó�� ���� (Process of Bean Postprocessing)
 * 
 * 1) �� ��ü(Bean Instance) ���� (������(Constructor) �Ǵ� ���丮 �޼���(Factory Method) ���).
 * 2) �� ������Ƽ(Bean Property)�� ���� �� ���۷��� ����. 3) Aware Interface�� ���ǵ� Setter �޼��� ȣ��
 * 4) �� �ν��Ͻ�(Bean Instance)�� �� �� ��ó����(Bean Post Processor)��
 * postProcessBeforeInitialization() �� ����. 5) �ʱ�ȭ Callback �޼��� ȣ�� 6) �� �ν��Ͻ�(Bean
 * Instance)�� �� �� ��ó����(Bean Post Processor)�� postProcessAfterInitialization() ��
 * ����. 7) �� ��� �غ� �Ϸ� 8) �����̳� ���� ��, �Ҹ�(Destructor) Callback �޼��� ȣ��
 * 
 * 
 * [BeanFactory �������̽�] - �� ��ü�� �����ϰ� �� �� ��ü ���� ���� ���踦 �������ִ� ��� ����. - ���� �ܼ��� �����̳�.
 * 
 * [XmlBeanFactory Ŭ����] - �ܺ� �ڿ����κ��� ���� ������ �о� �� �� ��ü�� �����ϴ� Ŭ����
 * 
 * 
 * 
 * ��ó: https://ooz.co.kr/217 [�̷���������]
 * 
 * 
 */
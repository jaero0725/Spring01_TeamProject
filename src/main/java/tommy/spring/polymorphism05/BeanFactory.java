package tommy.spring.polymorphism05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanFactory {
	public Object getBean(String beanName) {
		if(beanName.equals("samsung")) {
			return new SamsungTV();
		} else if(beanName.equals("lg")) {
			return new LgTV();
		}
		return null;
	}
}

//Factory ������ ����غ���
/*
	���յ��� ���߱� ���� �ٸ� ������� ������ ������ �̿��ϴ� ����� �ִ�. TV�� ��ü�� �� Ŭ��
	�̾�Ʈ �ҽ��ڵ带 �������� �ʰ� ��ü�� �� �ִٸ� ���������� ���� ���� ���̴�. �̸� ���ؼ� 
	Factory ������ �����ؾ� �ϴµ� Factory ������ Ŭ���̾�Ʈ���� ����� ��ü ������ ĸ��ȭ�Ͽ� 
	TVUser�� TV���̸� ������ ���ջ��·� ����� �ش�.
	
	-- Factory ���� ���. 
*/

/*
	BeanFactory   
	���� Ŭ���� :  org.springframework.beans.factory.xml.XmlBeanFactory
     
	ApplicationContext   : local���� ���°�  
     	=> 2���� ����?   
     			
     			org.springframework.context.ApplicationContext �������̽��� �� ��ü ������ ����Ŭ, ���ϰ� 
     			���� �ڿ��� �߻�ȭ, �޽��� ���� �� ����ȭ����, �̺�Ʈ ����, XML ��Ű�� Ȯ���� ���� ���� 
     			���� �� �߰����� ����� �����Ѵ�.      			
     			
     			=> bean - core / context -> applicationContext
	WebApplicationContext  : web ������ ���°� 
*/

/*
 <beans>, 
<description>, <alias>, <import>�� �� ���� �ڽ� ������Ʈ�� ���
*/
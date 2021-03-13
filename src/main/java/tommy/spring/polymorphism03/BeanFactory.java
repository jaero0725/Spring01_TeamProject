package tommy.spring.polymorphism03;

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
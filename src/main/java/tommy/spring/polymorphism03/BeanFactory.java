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

//Factory 패턴을 사용해보자
/*
	결합도를 낮추기 위한 다른 방법으로 디자인 패턴을 이용하는 방법이 있다. TV를 교체할 때 클라
	이언트 소스코드를 수정하지 않고 교체할 수 있다면 유지보수는 더욱 편리할 것이다. 이를 위해서 
	Factory 패턴을 적용해야 하는데 Factory 패턴은 클라이언트에서 사용할 객체 생성을 캡슐화하여 
	TVUser와 TV사이를 느슨한 결합상태로 만들어 준다.
	
	-- Factory 패턴 사용. 
*/
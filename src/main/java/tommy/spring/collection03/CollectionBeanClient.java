package tommy.spring.collection03;

import java.util.Map;
import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		
		Properties addressList = bean.getAddressList();
		for (String key : addressList.stringPropertyNames()) {
			System.out.println("Å° : " + key + "| °ª : " + addressList.get(key));
		}
	}

}

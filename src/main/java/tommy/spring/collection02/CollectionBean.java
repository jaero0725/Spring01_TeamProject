package tommy.spring.collection02;

import java.util.Map;

public class CollectionBean {
	private Map<String,String> addressList; //addressList�� ����.

	public Map<String, String> getAddressList() {
		return addressList;
	}

	public void setAddressList(Map<String, String> addressList) {
		this.addressList = addressList;
	}
}

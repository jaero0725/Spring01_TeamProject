package tommy.spring.polymorphism02;

public class TVUser {
	public static void main(String[] args) {
		LgTV tv = new LgTV(); //�����ϱ� ������.
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		/*
		 �̷��� �������� �̿��ϸ� TVUser�� ���� Ŭ���̾�Ʈ ���α׷��� ���� �� �ִ��� �ּ���
		 �� �������� TV�� ��ü�� �� �ִ�. ���� ���������� �� �� �������ٰ� �� �� �ִ�. 
		 */
	}
}
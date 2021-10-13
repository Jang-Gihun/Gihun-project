package coupling;

import org.springframework.stereotype.Component;

@Component("galphone")
public class GalPhone implements Phone {
	
	private Watch watch;
	private	String user;
	
	public GalPhone() {
		System.out.println("������ ������");
	}
	
	public void setWatch(Watch watch) {
		this.watch = watch;
		System.out.println("������-setWatch() ȣ���");
	}

	public void setUser(String user) {
		this.user = user;
		System.out.println("������-setUser() ȣ���");
	}

	public void initPhone() {
		System.out.println("������-��������� �ִٸ�, �ʱ�ȭ");
	}
	public void powerOn() {
		System.out.println("������ ���� ON"+this.user+"��"); 
	}
	public void powerOff() {
		System.out.println("������ ���� Off"); 
	}
	public void volumeUp() {
		//System.out.println("������ �Ҹ� ++"); 
		watch.volumeUp();
	}
	public void volumeDown() {
		//System.out.println("������ �Ҹ� --"); 
		watch.volumeDown();
	}
	
}

package coupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("phone")
public class IPhone implements Phone {
		@Autowired
		private Watch watch;
		private String user;
		public IPhone() {
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

		/*
		public IPhone(Watch watch) {
			System.out.println("������ ������2");
			this.watch = watch;
		}
		public IPhone(Watch watch, String user) {
			System.out.println("������ ������3");
			this.watch = watch;
			this.user = user;
		}*/
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
			//watch = new SmartWatch();
			watch.volumeUp();
			//System.out.println("������ �Ҹ� ++"); 
		}
		public void volumeDown() {
			//watch = new SmartWatch();
			watch.volumeDown();
			//System.out.println("������ �Ҹ� --"); 
		}
}

package coupling;

import org.springframework.stereotype.Component;

@Component("galphone")
public class GalPhone implements Phone {
	
	private Watch watch;
	private	String user;
	
	public GalPhone() {
		System.out.println("°¶·°½Ã »ý¼ºµÊ");
	}
	
	public void setWatch(Watch watch) {
		this.watch = watch;
		System.out.println("°¶·°½Ã-setWatch() È£ÃâµÊ");
	}

	public void setUser(String user) {
		this.user = user;
		System.out.println("°¶·°½Ã-setUser() È£ÃâµÊ");
	}

	public void initPhone() {
		System.out.println("°¶·°½Ã-¸â¹öº¯¼ö°¡ ÀÖ´Ù¸é, ÃÊ±âÈ­");
	}
	public void powerOn() {
		System.out.println("°¶·°½Ã Àü¿ø ON"+this.user+"´Ô"); 
	}
	public void powerOff() {
		System.out.println("°¶·°½Ã Àü¿ø Off"); 
	}
	public void volumeUp() {
		//System.out.println("°¶·°½Ã ¼Ò¸® ++"); 
		watch.volumeUp();
	}
	public void volumeDown() {
		//System.out.println("°¶·°½Ã ¼Ò¸® --"); 
		watch.volumeDown();
	}
	
}

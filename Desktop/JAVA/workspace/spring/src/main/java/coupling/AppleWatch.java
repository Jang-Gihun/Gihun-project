package coupling;

import org.springframework.stereotype.Component;

@Component("aw")
public class AppleWatch implements Watch {
	public  AppleWatch() {
		System.out.println("���ÿ�ġ ������");
	}
	@Override
	public void volumeUp() {
		System.out.println("���ÿ�ġ �Ҹ� ++");
	}

	@Override
	public void volumeDown() {
		System.out.println("���ÿ�ġ �Ҹ� --");
	}
	
}

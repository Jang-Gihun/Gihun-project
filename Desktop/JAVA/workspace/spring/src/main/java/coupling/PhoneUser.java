package coupling;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class PhoneUser {

	public static void main(String[] args) {

		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		//XmlApplicationContext << spring
		
		Phone phone = (Phone) factory.getBean("phone");
		phone.powerOn();
		phone.volumeUp();
		phone.volumeUp();
		/*
		Phone phone2 = (Phone) factory.getBean("galphone");
		phone2.powerOn();
		phone2.volumeUp();
		phone2.volumeDown();
		*/
		factory.close();

		/*
		 * BeanFactory bf = new BeanFactory(); 
		 * Phone phone =(Phone)bf.getBean(args[0]);
		 * // �ʿ��� ��ü�� �����ϸ�, 
		 * // ��ü�� �����ϴ� ��ü�� BeanFactory�̴�. 
		 * phone.powerOn();
		 * phone.volumeUp();
		 */

	}

}

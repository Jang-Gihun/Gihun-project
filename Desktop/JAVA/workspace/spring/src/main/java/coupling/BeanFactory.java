package coupling;

public class BeanFactory {
	//������ ���ջ��¸� �������
	//��ü������ ĸ��ȭ
	public Object getBean(String beanName) {
		if (beanName.equals("i")) {
			return new IPhone();
		}
		else if (beanName.equals("gal")) {
			return new GalPhone();
		}
		return null;
	}
}

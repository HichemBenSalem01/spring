package ccom.hichem.rtibi;

public class BeanA {
	private int age;
	private BeanB beanB;

	public BeanB getBeanB() {
		return beanB;
	}

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("setter age");
		this.age = age;
	}

	public BeanA() {
		System.out.println("spring injection");
	}
}

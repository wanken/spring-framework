package beantest.beans;

/**
 * @author waver
 * @date 2019.2.20 23:09
 */
public class TestBean {
	private String beanName;

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	@Override
	public String toString() {
		return "TestBean{" +
				"beanName='" + beanName + '\'' +
				'}';
	}
}

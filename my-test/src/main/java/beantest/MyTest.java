package beantest;

import beantest.beans.TestBean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author waver
 * @date 2019.2.20 23:00
 */
public class MyTest {
	public static void main(String[] args) {
		MyTest myTest = new MyTest();
		myTest.testXmlBeanFactory();
		myTest.testXmlBeanDefinitionReader();
	}

	/**
	 * 已废弃的获取Bean的方法
	 */
	@Test
	public void testXmlBeanFactory(){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("/spring/beans.xml"));
		TestBean testBean = (TestBean) bf.getBean("testBean");
		testBean.setBeanName("Yes");
		System.out.println(testBean);
	}

	/**
	 * 新的获取Bean的方法
	 */
	@Test
	public void testXmlBeanDefinitionReader(){
		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
		xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("/spring/beans.xml"));
		TestBean testBean = (TestBean) defaultListableBeanFactory.getBean("testBean");
		testBean.setBeanName("Yes");
		System.out.println(testBean);
	}
}

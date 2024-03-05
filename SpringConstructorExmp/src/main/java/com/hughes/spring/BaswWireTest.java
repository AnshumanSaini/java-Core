package com.hughes.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BaswWireTest {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("wiring.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		SpringBase2 s = (SpringBase2) factory.getBean("base2");
		s.Base2Display();
	}

}

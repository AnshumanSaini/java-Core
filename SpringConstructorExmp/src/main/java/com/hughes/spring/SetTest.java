package com.hughes.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SetTest {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("context.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		SetSpring sConst = (SetSpring) factory.getBean("set");
		SetSpring sSetter = (SetSpring) factory.getBean("setSetter");
		sConst.display();
		System.out.println(sSetter.getName());
		System.out.println(sSetter.getSet());
	}

}

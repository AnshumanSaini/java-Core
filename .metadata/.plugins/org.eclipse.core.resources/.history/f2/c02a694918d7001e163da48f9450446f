package com.hughes.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

import com.edu.spring.Customer;


public class TestInjection {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		AdditionPOJO s = (AdditionPOJO) factory.getBean("add");
		s.add();
		
		SubtractionPOJO t = (SubtractionPOJO) factory.getBean("sub");
		t.sub();
	}

}

package com.hughes.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestMap {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("context.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		MapSpring mapConst = (MapSpring) factory.getBean("map");
		mapConst.display();
		
		SpringListConst listConst = (SpringListConst) factory.getBean("ls");
		listConst.display();
		
		MapSpring mapSetter = (MapSpring) factory.getBean("mapSetter");
		System.out.println(mapSetter.getMap());
		System.out.println(mapSetter.getName());

	}

}

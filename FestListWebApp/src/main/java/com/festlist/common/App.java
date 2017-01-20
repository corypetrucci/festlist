package com.festlist.common;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) 
	{
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml")){
			HelloWorld obj = (HelloWorld) context.getBean("helloBean");
			obj.printHello();
		}
		catch(Exception e){
			System.err.println("Generic Exception occurred while runniing App.java\nMessage is: " + e.getMessage());
			e.printStackTrace();
		}
	}
}

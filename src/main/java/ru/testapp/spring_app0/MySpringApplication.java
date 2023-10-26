package ru.testapp.spring_app0;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApplication {
	public static void main (String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloBean helloBean = context.getBean("helloBean", HelloBean.class);
		System.out.println(helloBean.getName());
		context.close();
	}

}

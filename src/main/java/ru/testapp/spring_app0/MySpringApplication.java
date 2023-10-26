package ru.testapp.spring_app0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySpringApplication {
	public static void main (String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		HelloBean helloBean = context.getBean(HelloBean.class);
		System.out.println(helloBean.getText());
		context.close();
	}

}

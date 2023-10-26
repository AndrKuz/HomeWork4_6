package ru.testapp.spring_app0;

public class HelloBean {
	private String name;
			
	public HelloBean(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}

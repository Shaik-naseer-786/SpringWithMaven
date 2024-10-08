package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.Student;
import com.resource.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Student std=(Student) context.getBean("stdId");
		System.out.println(std.toString());
	}
}

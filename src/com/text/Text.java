package com.text;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.HelloSpring;

public class Text {

	public static void main(String[] args) {
		//按照以前的写法
//		HelloSpring hello = new HelloSpring();
//		hello.setWho("spring");
//		hello.print();
		
		//使用spring 来操作
		
		//通过实例化spring的上下文来调用配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过getBean方法来获取HelloSpring的实例
		HelloSpring hello = (HelloSpring)context.getBean("helloSpring");
		
		//执行方法
		hello.print();
	}

}

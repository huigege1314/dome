package com.text;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.HelloSpring;

public class Text {

	public static void main(String[] args) {
		//������ǰ��д��
//		HelloSpring hello = new HelloSpring();
//		hello.setWho("spring");
//		hello.print();
		
		//ʹ��spring ������
		
		//ͨ��ʵ����spring�������������������ļ�
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ͨ��getBean��������ȡHelloSpring��ʵ��
		HelloSpring hello = (HelloSpring)context.getBean("helloSpring");
		
		//ִ�з���
		hello.print();
	}

}

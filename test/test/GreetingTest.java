package test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Greeting;

public class GreetingTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Greeting zhangGa = (Greeting) context.getBean("zhangGa");
		Greeting rod = (Greeting) context.getBean("rod");
		zhangGa.sayGreeting();
		rod.sayGreeting();
	}
}

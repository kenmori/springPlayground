package jp.morita.spring.sample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext app;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		app = new ClassPathXmlApplicationContext("bean.xml");
		MyBean bean = (MyBean)app.getBean("mybean1");
		System.out.println(bean);
	}

}

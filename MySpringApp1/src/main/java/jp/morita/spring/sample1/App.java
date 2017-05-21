package jp.morita.spring.sample1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
		MyBean bean = (MyBean)app.getBean("mybean1");
		System.out.println(bean);
	}

}

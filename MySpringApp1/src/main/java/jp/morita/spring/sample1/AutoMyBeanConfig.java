package jp.morita.spring.sample1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoMyBeanConfig {
	@Bean
	public MyBeanInterface myBean(){
		return new MyBean("this is bean from Auto config");
	}
}

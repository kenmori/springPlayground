package jp.morita.spring.websample1;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyBean2 {
	@Autowired
	private Date date;
}

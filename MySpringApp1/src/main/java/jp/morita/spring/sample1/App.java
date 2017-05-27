package jp.morita.spring.sample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	private static ApplicationContext app;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//bean構成ファイルを使わずにインスタンスを取得
		//bean構成クラスを使う。構成クラスはbeanのインスタンスを生成して保持しているファイル。
		//構成ファイル１つにつき1つのインスタンスしか保持できない。
		app = new AnnotationConfigApplicationContext(AutoMyBeanConfig.class);
		//インターフェイスを指定することでそれを実装しているクラスならどれでも使いまわせる。
		MyBeanInterface bean =app.getBean(MyBeanInterface.class);
		//or
		//MyBean bean = app.getBean(MyBean.class);
		System.out.println(bean);
	}

}

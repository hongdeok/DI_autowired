package khd;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Spring 컨테이너를 구동하여 applicationContext.xml을 로딩한다.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.powerOff();
		
		Speaker sp = (Speaker)factory.getBean("apple");
		sp.volumeUp();
		sp.volumeDown();
		
		factory.close();
	}

}

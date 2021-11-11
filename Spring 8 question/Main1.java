package spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("LifeCycle.xml");
		context.registerShutdownHook();
		BeanLifeCycle obj =(BeanLifeCycle) context.getBean("BeanLifeCycle");
		obj.show();

	}

}

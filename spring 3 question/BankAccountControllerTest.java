package spring;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankAccountControllerTest {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Object controller = context.getBean("controller");
		
		assertEquals(controller.getClass().getSimpleName(), "BankAccountController");
	}

}

package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
private static ApplicationContext context;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		context = new ClassPathXmlApplicationContext("bean.xml");
		BankAccount account = (BankAccount)context.getBean("Account");
		System.out.println(account.accountBalance);
		BankAccountController account2 = (BankAccountController)context.getBean("controller");
		System.out.println(account2.getBalance(10));
		

	}

}

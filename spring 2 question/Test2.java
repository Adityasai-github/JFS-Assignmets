package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
	private static ApplicationContext context;
	public static void main(String[] args) {
		 
		context = new ClassPathXmlApplicationContext("beans1.xml");
		Question question = (Question)context.getBean("question");
		
		System.out.println(question.getQuestion() + "\n Ans: " + question.getQuestionMap());
		
		System.out.println(question.getClass().getSimpleName());
	}

	}



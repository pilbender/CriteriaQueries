package net.raescott.criteriaqueries;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Criteria Query Example Project
 */
//@ContextConfiguration(locations = {"classpath:/applicationContext.xml"})
public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		BeanFactory beanFactory = applicationContext;
		PersonDao personDao = (PersonDao) beanFactory.getBean("personDao");
		
		Person person = new Person("scott", 5);
		
		List<Person> personList = personDao.findAll();
		logger.info("Person List: ", personList);
	}
}

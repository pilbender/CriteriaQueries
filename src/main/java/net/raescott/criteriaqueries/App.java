package net.raescott.criteriaqueries;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;

/**
 * Criteria Query Example Project
 */
@ContextConfiguration(locations = {"classpath:/applicationContext.xml"})
public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	
	@PersistenceContext EntityManager em;

	public static void main(String[] args) {
            logger.info("testing....");
		
	}
}

package net.raescott.criteriaqueries;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Richard Scott Smith <scott.smith@isostech.com>
 */
@Repository
public class PersonDao {

	private static final Logger logger = LoggerFactory.getLogger(App.class);
	
	@PersistenceContext EntityManager em;

	public List<Person> findAll() {
		List<Person> personList = (List<Person>) em.createNamedQuery("Person.findAll")
				.getResultList();
		return personList;
	}
}

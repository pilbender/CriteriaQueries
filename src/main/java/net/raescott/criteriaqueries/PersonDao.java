package net.raescott.criteriaqueries;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Richard Scott Smith <scott.smith@isostech.com>
 */
@Repository
public class PersonDao {

	private static final Logger logger = LoggerFactory.getLogger(App.class);
	@PersistenceContext
	EntityManager em;

	@Transactional
	public List<Person> findAll() {
		List<Person> personList = new LinkedList<Person>(); // Null Object Pattern
		try {
			personList = (List<Person>) em.createNamedQuery("Person.findAll")
					.getResultList();
		} catch (NoResultException nre) {
			// This is okay, it means the database was empty.
		}
		return personList;
	}

	@Transactional
	public void persist(Person person) {
		em.persist(person);
	}

	@Transactional
	public Person merge(Person person) {
		em.merge(person);
		return person;
	}
}

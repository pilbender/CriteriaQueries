# CriteriaQueries
Small example of JPA Criteria Queries with Spring, JPA, Maven Shade, Embedded H2

## About
This example code illustrates the use of JPA Criteria Queries.

How to:
 * Manually stand up a Spring Bean Container
 * Use the Bean container outside the web context
 * Maven builds using the Shade plugin to create an executable jar without losing Spring scehema definitions inside the jar
 * Set up Spring Managed Database connection with transactions, an Entity Manager, and all common annotations enabled: 
 @NamedQuery, @Transactional, @Repository, and @PersistenceContext
 * Compare CriteriaQueries with equivalent NamedQueries
 * Hibernate with embedded H2 in memory database configuration
 * Logging with SLF4J
 
 ## Requirements
 Only the JDK and Maven is required to run this project
 
 ## Build Instructions
  * mvn clean install
  * java -jar target/CriteriaQueries-1.0-SNAPSHOT.jar
  * The basic output can easily be viewed and modified by the user to explore JPA more

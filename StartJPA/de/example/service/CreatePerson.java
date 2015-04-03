package de.example.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import de.example.jpa.Person;

public class CreatePerson {
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		Person sven = new Person();
		sven.setId(1);
		sven.setName("sven");
		sven.setJob("unemployed");
		sven.setAge(27);

		entitymanager.persist(sven);
		entitymanager.getTransaction().commit();

		entitymanager.close();
		emfactory.close();
	}
}

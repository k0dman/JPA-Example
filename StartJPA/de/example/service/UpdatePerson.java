package de.example.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import de.example.jpa.Person;

public class UpdatePerson {
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		Person sven = entitymanager.find(Person.class, 1);
		// before update
		System.out.println(sven);
		sven.setJob("Developer");
		entitymanager.getTransaction().commit();
		// after update
		System.out.println(sven);
		entitymanager.close();
		emfactory.close();
	}
}

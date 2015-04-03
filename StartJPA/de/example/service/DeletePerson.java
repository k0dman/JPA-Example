package de.example.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import de.example.jpa.Person;

public class DeletePerson {
	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("Eclipselink_JPA");

		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		Person sven = entitymanager.find(Person.class, 1);
		entitymanager.remove(sven);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}
}

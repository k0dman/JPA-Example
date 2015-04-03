package de.example.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import de.example.jpa.Person;

public class FindPerson {
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		Person sven = entitymanager.find(Person.class, 1);

		System.out.println("Person ID = " + sven.getId());
		System.out.println("Person NAME = " + sven.getName());
		System.out.println("Person JOB = " + sven.getJob());
		System.out.println("Person Age = " + sven.getAge());
	}
}

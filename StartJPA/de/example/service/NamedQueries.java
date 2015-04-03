package de.example.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import de.example.jpa.Person;

public class NamedQueries {
	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("Eclipselink_JPA");

		EntityManager entitymanager = emfactory.createEntityManager();
		Query query = entitymanager.createNamedQuery("find person by id");
		query.setParameter("id", 1);
		List<Person> list = query.getResultList();
		for (Person p : list) {
			System.out.print("Person ID :" + p.getId());
			System.out.println("\t Person Name :" + p.getName());
		}
	}
}

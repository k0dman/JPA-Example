package de.example.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import de.example.jpa.Person;

public class BetweenAndLikeFunctions {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		// Between
		Query query = entitymanager.createQuery("Select p " + "from Person p "
				+ "where p.age " + "Between 25 and 30");
		List<Person> list = (List<Person>) query.getResultList();

		for (Person p : list) {
			System.out.print("Person ID :" + p.getId());
			System.out.println("\t Person salary :" + p.getAge());
		}

		// Like
		Query query1 = entitymanager.createQuery("Select p " + "from Person p "
				+ "where p.name LIKE 'S%'");
		List<Person> list1 = (List<Person>) query1.getResultList();
		for (Person p : list1) {
			System.out.print("Person ID :" + p.getId());
			System.out.println("\t Person name :" + p.getName());
		}
	}
}

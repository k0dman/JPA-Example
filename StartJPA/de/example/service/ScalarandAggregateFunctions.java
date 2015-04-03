package de.example.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ScalarandAggregateFunctions {

	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();

		// Scalar function
		Query query = entitymanager
				.createQuery("SELECT UPPER(p.name) FROM Person p");
		List<String> list = query.getResultList();

		for (String e : list) {
			System.out.println("Person name :" + e);
		}

		// Aggregate function
		Query query1 = entitymanager.createQuery("Select MAX(p.age) from Person p");
		int result = (int) query1.getSingleResult();
		System.out.println("Max Age Person :" + result);
	}
}

package de.example.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import de.example.entities.Profession;
import de.example.entities.Sector;

public class ManyToOne {

	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entityManager = emfactory.createEntityManager();
		entityManager.getTransaction().begin();

		// sector Entität Erstellen
		Sector sector = new Sector();
		sector.setName("IT");
		
		// Store sector
		entityManager.persist(sector);

		// Erstelle professione
		Profession profession = new Profession();
		profession.setName("Developer");
		profession.setSalary(45000);
		profession.setDeg("frontend");
		profession.setSector(sector);

		// Erstelle professione
		Profession profession1 = new Profession();
		profession1.setName("Developer");
		profession1.setSalary(45000);
		profession1.setDeg("frontend");
		profession1.setSector(sector);

		// Erstelle professione
		Profession profession2 = new Profession();
		profession2.setName("Developer");
		profession2.setSalary(45000);
		profession2.setDeg("frontend");
		profession2.setSector(sector);

		// Erstelle professione
		Profession profession3 = new Profession();
		profession3.setName("Developer");
		profession3.setSalary(45000);
		profession3.setDeg("frontend");
		profession3.setSector(sector);

		// Store professione
		entityManager.persist(profession);
		entityManager.persist(profession1);
		entityManager.persist(profession2);
		entityManager.persist(profession3);

		entityManager.getTransaction().commit();
		entityManager.close();
		emfactory.close();

	}

}

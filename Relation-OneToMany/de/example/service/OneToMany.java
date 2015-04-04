package de.example.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import de.example.entities.Brand;
import de.example.entities.ToolType;

public class OneToMany {

	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entityManager = emfactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		// Create ToolType Entity
		ToolType toolType = new ToolType();
		toolType.setName("Television");
		toolType.setPrice(20000.00);
		toolType.setColor("black");
		
		ToolType toolType1 = new ToolType();
		toolType1.setName("Radio");
		toolType1.setPrice(200.00);
		toolType1.setColor("blue");
		
		ToolType toolType2 = new ToolType();
		toolType2.setName("Clock");
		toolType2.setPrice(300.00);
		toolType2.setColor("red");
		
		ToolType toolType3 = new ToolType();
		toolType3.setName("Laptop");
		toolType3.setPrice(4000.00);
		toolType3.setColor("black");
		
		//Store ToolType
		entityManager.persist(toolType);
		entityManager.persist(toolType1);
		entityManager.persist(toolType2);
		entityManager.persist(toolType3);
		
		// Create List
		List<ToolType> toolTypeList = new ArrayList<ToolType>();
		toolTypeList.add(toolType);
		toolTypeList.add(toolType1);
		toolTypeList.add(toolType2);
		toolTypeList.add(toolType3);
		

		// Create Brand Entity
		Brand brand = new Brand();
		brand.setName("LG");
		brand.setToolTypeList(toolTypeList);
		
		// Store Brand
		entityManager.persist(brand);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		emfactory.close();
		
	}

}

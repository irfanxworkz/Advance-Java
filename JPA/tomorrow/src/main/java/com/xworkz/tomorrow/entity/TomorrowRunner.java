package com.xworkz.tomorrow.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TomorrowRunner {

	public static void main(String[] args) {
		TomorrowEntity tn = new TomorrowEntity();
		tn.setId(3);
		tn.setName("Nadeem");
		
		System.out.println(tn);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(tn);
		
		transaction.commit();
		manager.close();
		System.out.println("saving Data");
	}

}

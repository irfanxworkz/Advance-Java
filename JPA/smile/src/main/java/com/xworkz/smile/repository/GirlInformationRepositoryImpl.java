package com.xworkz.smile.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.smile.entity.GirlInformationEntity;

public class GirlInformationRepositoryImpl implements GirlInformationRepository {

	List<GirlInformationEntity> list = new ArrayList<>();

	public GirlInformationRepositoryImpl() {
		System.out.println("Creating no-arg Constructor using GirlInformationRepositoryImpl!!!");
	}

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();

	@Override
	public boolean onSave(GirlInformationEntity entity) {
		System.out.println("Running onSave method in GirlInformationRepositoryImpl...");
		this.transaction.begin();
		this.manager.persist(entity);
		this.transaction.commit();
		this.manager.close();
		return true;
	}

	@Override
	public GirlInformationEntity findById(int id) {
		GirlInformationEntity reference = manager.find(GirlInformationEntity.class, id);
		System.out.println("find by id: " + reference);
		return reference;
	}

	@Override
	public List<GirlInformationEntity> findAll() {
		Query query = manager.createNamedQuery("findAll");
		list = query.getResultList();
		for (GirlInformationEntity girlInformationEntity : list) {
			System.out.println(girlInformationEntity);
		}
		return null;
	}

	@Override
	public boolean update(String name, int id) {

		transaction.begin();
		GirlInformationEntity entity = manager.find(GirlInformationEntity.class, 2);
		entity.setName("Deepika");
		transaction.commit();
		manager.close();

		return true;
	}

}

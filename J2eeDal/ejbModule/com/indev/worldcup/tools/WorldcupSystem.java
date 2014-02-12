package com.indev.worldcup.tools;

import javax.ejb.Singleton;
import javax.naming.Context;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
public class WorldcupSystem {
	@PersistenceContext
	EntityManager entityManager;
	
	public void persist(Object o){
		entityManager.persist(o);
	}
	
	
}

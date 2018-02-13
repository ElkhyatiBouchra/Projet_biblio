package com.firstprojet.business.dao.impl;

import org.springframework.stereotype.Repository;

import com.app.business.bo.Rayon;

import com.firstprojet.business.dao.RayonDao;
import com.firstprojet.dao.impl.GenericDaoImpl;


@Repository

public class RayonDaoImpl extends GenericDaoImpl<Rayon, Long> implements
		RayonDao {

	public RayonDaoImpl() {

		// car on travail sur des objets de la classe Rayon, il y a des méthodes
		// hibernate qui auront besoin de cette information cf. le code de
		// generic dao
		super(Rayon.class);
	}
}

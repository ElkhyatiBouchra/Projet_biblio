package com.firstprojet.business.dao.impl;

import org.springframework.stereotype.Repository;

import com.app.business.bo.Theme;

import com.firstprojet.business.dao.ThemeDao;
import com.firstprojet.dao.impl.GenericDaoImpl;


@Repository

public class ThemeDaoImpl extends GenericDaoImpl<Theme, Long> implements
		ThemeDao {

	public ThemeDaoImpl() {

		// car on travail sur des objets de la classe Theme, il y a des méthodes
		// hibernate qui auront besoin de cette information cf. le code de
		// generic dao
		super(Theme.class);
	}

}

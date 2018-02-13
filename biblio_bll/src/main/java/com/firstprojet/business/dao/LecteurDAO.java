package com.firstprojet.business.dao;

import java.util.List;


import com.app.business.bo.Lecteur;
import com.firstprojet.dao.GenericDao;
import com.firstprojet.dao.exceptions.EntityNotFoundException;

public interface LecteurDAO extends GenericDao<Lecteur, Long> {
	
	public List<Lecteur> getLecteurByName(String pName)  throws EntityNotFoundException;
	
	
	
}

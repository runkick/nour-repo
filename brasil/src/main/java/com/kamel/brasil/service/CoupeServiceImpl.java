package com.kamel.brasil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kamel.brasil.dao.CoupeDAO;
import com.kamel.brasil.model.Groupe;

public class CoupeServiceImpl implements ICoupeService {
	@Autowired     
	private CoupeDAO coupeDAO;

	public List<Groupe> loadGroupe() {
		
		
		return coupeDAO.loadGroupes()	;
	}

}

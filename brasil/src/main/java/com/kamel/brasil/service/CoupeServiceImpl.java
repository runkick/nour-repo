package com.kamel.brasil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kamel.brasil.dao.CoupeDAO;
import com.kamel.brasil.model.Groupes;

@Service("coupeService")
@Transactional
public class CoupeServiceImpl implements ICoupeService {
	@Autowired
	private CoupeDAO coupeDAO;

	public List<Groupes> chargerGroupes() {
		// TODO Auto-generated method stub
		return coupeDAO.chargerGroupes();
	}

	
}

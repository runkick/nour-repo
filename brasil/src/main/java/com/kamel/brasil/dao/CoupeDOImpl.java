package com.kamel.brasil.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.kamel.brasil.model.Groupe;
import com.kamel.brasil.model.Pronostiqueur;

@Repository
public class CoupeDOImpl implements CoupeDAO {

	CoupeDAO coupeDAO;

	@PersistenceContext
	private EntityManager em;

	// TODO: faire requete hql approprié
	public Pronostiqueur find(int id_pronostiqueur) {
		return em.find(Pronostiqueur.class, id_pronostiqueur);
	}

	// HQL

	//
	@Transactional
	public void createPronostiqueur(Pronostiqueur pronostiqueur) {
		em.merge(pronostiqueur);
	}

	public List<Pronostiqueur> chargerPronostiqueur() {
		return null;
	}

	@Transactional
	public Pronostiqueur indentification(Pronostiqueur pronostiqueur) {

		Query q = em
				.createQuery(
						"SELECT p FROM Pronostiqueur p  WHERE p.email = :email AND p.mdp = :password",
						Pronostiqueur.class);

		q.setParameter("email", pronostiqueur.getEmail());
		q.setParameter("password", pronostiqueur.getMdp());

		List<Pronostiqueur> result = q.getResultList();
		if (CollectionUtils.isEmpty(result)) {
			return null;
		} else {
			return result.get(0);
		}

	}

	@Transactional
	public List<Groupe> loadGroupes() {

		Query q = em.createQuery("select g from Groupe g ", Groupe.class);
		List<Groupe> result = q.getResultList();

		return result;
	}
	
	
	public List<Pronostiqueur> loadPronostiqueurs(){
		
		Query q = em.createQuery("select p from Pronostiqueur p", Pronostiqueur.class);
		List<Pronostiqueur> result = q.getResultList();

		return result;
		
		
		
	}
}

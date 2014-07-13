package com.kamel.brasil.dao;

import java.util.List;

import com.kamel.brasil.model.Groupe;
import com.kamel.brasil.model.Groupes;
import com.kamel.brasil.model.Pronostiqueur;

public interface CoupeDAO {
	public void createPronostiqueur(Pronostiqueur pronostiqueur);
	public  Pronostiqueur find(int id_pronostiqueur) ;
	public List<Pronostiqueur> chargerPronostiqueur();
	public Pronostiqueur indentification(Pronostiqueur pronostiqueur);
	public List<Pronostiqueur> loadPronostiqueurs();
	
	public List<Groupes> chargerGroupes();
//public createPronostique(String pronostique, int idPronostiqueur);
//	public updat 
}

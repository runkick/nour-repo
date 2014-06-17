package com.kamel.brasil.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="pays")
public class Pays {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_pays")
	private int id_pays;
	
	@Column(name="nom")
	private String nom;
	
	
	
	protected Pays(){
		
	}

	public Pays(int id_pays, String nom){
		super();
		this.id_pays=id_pays;
		this.nom=nom;
	}

	public int getId_pays() {
		return id_pays;
	}

	public void setId_pays(int id_pays) {
		this.id_pays = id_pays;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}

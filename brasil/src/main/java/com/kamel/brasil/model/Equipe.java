package com.kamel.brasil.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="equipe")

public class Equipe{

	@Id
	@Column(name="id_equipe")
	private int id_equipe;
	
	@Column(name="nom")
	private String nom;
	
	
	
	@Column(name="id_groupe")
	private char id_groupe;
	
	
	protected Equipe(){
		
	}
	
	public Equipe(int id_equipe,String nom,char id_groupe){
		super();
		this.id_equipe=id_equipe;
		this.nom=nom;
		this.id_groupe=id_groupe;
	}

	public int getId_equipe() {
		return id_equipe;
	}

	public void setId_equipe(int id_equipe) {
		this.id_equipe = id_equipe;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	public char getId_groupe() {
		return id_groupe;
	}

	public void setId_groupe(char id_groupe) {
		this.id_groupe = id_groupe;
	}


	
}
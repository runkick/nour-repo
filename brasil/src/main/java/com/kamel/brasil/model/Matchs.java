package com.kamel.brasil.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "matchs")
public class Matchs implements Serializable {

	@Id
	private int id;
	
	
	private String score;
	
	@ManyToOne
	@JoinColumn(name="id_groupe")	   
	private Groupes groupe;
	
	@OneToOne
	@JoinColumn(name="id_equipe1")
	private Equipe equipe1;
	

	@OneToOne
	@JoinColumn(name="id_equipe2")
	private Equipe equipe2;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public Groupes getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupes groupe) {
		this.groupe = groupe;
	}

	public Equipe getEquipe1() {
		return equipe1;
	}

	public void setEquipe1(Equipe equipe1) {
		this.equipe1 = equipe1;
	}

	public Equipe getEquipe2() {
		return equipe2;
	}

	public void setEquipe2(Equipe equipe2) {
		this.equipe2 = equipe2;
	}
	
	

}

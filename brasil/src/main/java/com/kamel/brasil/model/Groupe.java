package com.kamel.brasil.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "groupe")
public class Groupe {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_groupe")
	private int idGroupe;
	
	@Column(name="nom")
	private String nom;

	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_groupe")
	private Set<Match> matchs;

	public Groupe() {

	}

	public int getIdGroupe() {
		return idGroupe;
	}

	public void setIdGroupe(int idGroupe) {
		this.idGroupe = idGroupe;
	}

	public Set<Match> getMatchs() {
		return matchs;
	}

	public void setMatchs(Set<Match> matchs) {
		this.matchs = matchs;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

}
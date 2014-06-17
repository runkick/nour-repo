package com.kamel.brasil.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="groupe")
public class Groupe{
	@Id
	@Column(name="id_groupe")
	private char idGroupe;
	
	
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name="id_groupe") 
	private Set <Match> matchs;
	
	public Groupe(){
		
	}

	public char getIdGroupe() {
		return idGroupe;
	}

	public void setIdGroupe(char idGroupe) {
		this.idGroupe = idGroupe;
	}

	public Set<Match> getMatchs() {
		return matchs;
	}

	public void setMatchs(Set<Match> matchs) {
		this.matchs = matchs;
	}
	
	
	
	
}
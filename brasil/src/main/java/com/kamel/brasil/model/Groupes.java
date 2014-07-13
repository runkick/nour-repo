package com.kamel.brasil.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "groupes")
public class Groupes implements Serializable{

	@Id
	private char id;

	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_groupe")
	//@OneToMany(fetch=FetchType.EAGER, mappedBy="groupe", cascade=CascadeType.ALL)
	private Set<Matchs> matchs;

	public char getId() {
		return id;
	}

	public void setId(char id) {
		this.id = id;
	}

	public Set<Matchs> getMatchs() {
		return matchs;
	}

	public void setMatchs(Set<Matchs> matchs) {
		this.matchs = matchs;
	}

}

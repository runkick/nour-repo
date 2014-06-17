package com.kamel.brasil.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="oppose")
public class Oppose {

	
	@Id
	@Column(name="id_match")
	private int id_match;
	
	
	@Column(name="id_equipe1")
	private int id_equipe1;
	
	
	@Column(name="id_equipe2")
	private int id_equipe2;
	
	@Column(name="pronostique")
	private int pronostique;
	
	@Column(name="score")
	private String score;
	
	
	protected Oppose(){
		
	}
	
	public Oppose(int id_match,int id_equipe1,int id_equipe2,int pronostique,String score){
		super();
		this.id_match=id_match;
		this.id_equipe1=id_equipe1;
		this.id_equipe2=id_equipe2;
		this.pronostique=pronostique;
		this.score=score;
		
	}

	public int getId_match() {
		return id_match;
	}

	public void setId_match(int id_match) {
		this.id_match = id_match;
	}

	public int getId_equipe1() {
		return id_equipe1;
	}

	public void setId_equipe1(int id_equipe1) {
		this.id_equipe1 = id_equipe1;
	}

	public int getId_equipe2() {
		return id_equipe2;
	}

	public void setId_equipe2(int id_equipe2) {
		this.id_equipe2 = id_equipe2;
	}

	public int getPronostique() {
		return pronostique;
	}

	public void setPronostique(int pronostique) {
		this.pronostique = pronostique;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
	

}



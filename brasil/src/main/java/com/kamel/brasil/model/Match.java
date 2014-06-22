package com.kamel.brasil.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "match")
public class Match {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_match")
	private int idMatch;

//	@Column(name = "id_equipe1")
//	private int id_equipe1;
//
//	@Column(name = "id_equipe2")
//	private int id_equipe2;
//
//	@Column(name = "id_pronostique")
//	private int id_pronostique;
//
//	@Column(name = "score")
//	private String score;
//
//	@Column(name = "date_match")
//	private Date date_match;
	
	public Match() {

	}

	public int getIdMatch() {
		return idMatch;
	}

	public void setIdMatch(int idMatch) {
		this.idMatch = idMatch;
	}

//	public Match(int id_match, int id_equipe1, int id_equipe2,
//			int id_pronostique, int pronostique, String score, Date date_match) {
//		super();
//		this.id_match = id_match;
//		this.id_equipe1 = id_equipe1;
//		this.id_equipe2 = id_equipe2;
//		this.id_pronostique = id_pronostique;
//		this.score = score;
//
//		this.date_match = date_match;
//
//	}


	
	//	public Date getDate_match() {
//		return date_match;
//	}
//
//	public void setDate_match(Date date_match) {
//		this.date_match = date_match;
//	}
//
//	public int getId_pronostique() {
//		return id_pronostique;
//	}
//
//	public void setId_pronostique(int id_pronostique) {
//		this.id_pronostique = id_pronostique;
//	}
//
//	public int getId_equipe1() {
//		return id_equipe1;
//	}
//
//	public void setId_equipe1(int id_equipe1) {
//		this.id_equipe1 = id_equipe1;
//	}
//
//	public int getId_equipe2() {
//		return id_equipe2;
//	}
//
//	public void setId_equipe2(int id_equipe2) {
//		this.id_equipe2 = id_equipe2;
//	}
//
//	public String getScore() {
//		return score;
//	}
//
//	public void setScore(String score) {
//		this.score = score;
//	}

}

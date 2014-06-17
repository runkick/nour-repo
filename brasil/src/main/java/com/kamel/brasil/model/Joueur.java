package com.kamel.brasil.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="joueur")

public class Joueur {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="id_joueur")
private int id_joueur;

@Column(name="nom_joueur")
private String nom_joueur;

@Column(name="prenom_joueur")
private String prenom_joueur;

@Column(name="date_naissance")
private Date date_naissance;

@Column(name="club")
private String club;

@Column(name="ville")
private String ville;

protected Joueur(){
	
}

public Joueur(int id_joueur,String nom_joueur,String prenom_joueur,Date date_naissance,String club,String ville){
	
	super();
	this.id_joueur=id_joueur;
	this.nom_joueur=nom_joueur;
	this.prenom_joueur=prenom_joueur;
	
	this.date_naissance=date_naissance;
	this.club=club;
	
	this.ville=ville;
	
}

public int getId_joueur() {
	return id_joueur;
}

public void setId_joueur(int id_joueur) {
	this.id_joueur = id_joueur;
}

public String getNom_joueur() {
	return nom_joueur;
}

public void setNom_joueur(String nom_joueur) {
	this.nom_joueur = nom_joueur;
}

public String getPrenom_joueur() {
	return prenom_joueur;
}

public void setPrenom_joueur(String prenom_joueur) {
	this.prenom_joueur = prenom_joueur;
}

public Date getDate_naissance() {
	return date_naissance;
}

public void setDate_naissance(Date date_naissance) {
	this.date_naissance = date_naissance;
}

public String getClub() {
	return club;
}

public void setClub(String club) {
	this.club = club;
}

public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}



}

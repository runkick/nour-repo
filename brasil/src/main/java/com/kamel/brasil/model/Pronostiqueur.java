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
@Table(name="pronostiqueur")
public class Pronostiqueur {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="id_pronostiqueur")
private int id_pronostiqueur;


@Column(name="nom")
private String nom ;

@Column(name="prenom")
private String prenom ;

@Column(name="email")
private String email;

@Column(name="mdp")
private String mdp ;




@OneToMany(fetch = FetchType.EAGER)
@JoinColumn(name="id_pronostiqueur") 
private Set <Pronostique> pronostique;

public Pronostiqueur(){
	
}

public Pronostiqueur(int id_pronostiqueur, String nom , String prenom ,String email , String mdp,int id_pronostique){
	
	
	super();
	this.id_pronostiqueur=id_pronostiqueur;
	this.nom=nom;
	this.prenom=prenom;
	this.email=email;
	this.mdp=mdp;
}



public int getId_pronostiqueur() {
	return id_pronostiqueur;
}

public void setId_pronostiqueur(int id_pronostiqueur) {
	this.id_pronostiqueur = id_pronostiqueur;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getMdp() {
	return mdp;
}

public void setMdp(String mdp) {
	this.mdp = mdp;
}


}

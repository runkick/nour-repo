package com.kamel.brasil.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ville")
public class Ville {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name="id_ville")
	 private int id_ville;
	 
	 
	 @Column(name="nom_ville")
	 private String nom_ville;
	 
	 
	 protected Ville(){
		 
	 }
	 public Ville(int id_ville, String nom_ville){
		 
		 super();
		 this.id_ville=id_ville;
		 this.nom_ville=nom_ville;
		 
	 }
	public int getId_ville() {
		return id_ville;
	}
	public void setId_ville(int id_ville) {
		this.id_ville = id_ville;
	}
	public String getNom_ville() {
		return nom_ville;
	}
	public void setNom_ville(String nom_ville) {
		this.nom_ville = nom_ville;
	}
	 
}

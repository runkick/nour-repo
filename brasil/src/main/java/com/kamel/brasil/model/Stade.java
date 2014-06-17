package com.kamel.brasil.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stade")
public class Stade {
 @Id
@Column(name="id_stade")
 private int id_stade;
 
 @Column(name="id_ville")
 private int   id_ville;
 
 @Column(name="nom_stade")
 private  String nom_stade;
 
 
 
 protected Stade (){
	 
 }
 
 public Stade(int id_stade,int id_ville, String nom_stade){
	 super();
	 this.id_stade=id_stade;
	 this.id_ville=id_ville;
	 this.nom_stade=nom_stade;
 }

public int getId_stade() {
	return id_stade;
}

public void setId_stade(int id_stade) {
	this.id_stade = id_stade;
}

public int getId_ville() {
	return id_ville;
}

public void setId_ville(int id_ville) {
	this.id_ville = id_ville;
}

public String getNom_stade() {
	return nom_stade;
}

public void setNom_stade(String nom_stade) {
	this.nom_stade = nom_stade;
}
 
 
}

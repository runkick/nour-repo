package com.kamel.brasil.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pronostique")
public class Pronostique {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="id_pronostique")
private int id_pronostique;

@Column (name="pronos")
private String pronos;




public Pronostique(){
	
}
 public Pronostique(int id_pronostique,String pronos,int id_pronostiqueur){
	 
	 super();
	 this.id_pronostique=id_pronostique;
	 this.pronos=pronos;
	 
 }
public int getId_pronostique() {
	return id_pronostique;
}
public void setId_pronostique(int id_pronostique) {
	this.id_pronostique = id_pronostique;
}
public String getPronos() {
	return pronos;
}
public void setPronos(String pronos) {
	this.pronos = pronos;
}

 
 
 

}

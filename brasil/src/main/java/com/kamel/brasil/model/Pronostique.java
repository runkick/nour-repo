package com.kamel.brasil.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="pronostique")
public class Pronostique {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="id_pronostique")
private int id_pronostique;

@Column (name="pronos")
private String pronos;

@Transient
private String pronos1;

@Transient
private String pronos2;






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
	return pronos1 + "-"  + pronos2;
}
public void setPronos(String pronos) {
	this.pronos = pronos;
}
public String getPronos1() {
	return pronos1;
}
public void setPronos1(String pronos1) {
	this.pronos1 = pronos1;
}
public String getPronos2() {
	return pronos2;
}
public void setPronos2(String pronos2) {
	this.pronos2 = pronos2;
}

 
 
 

}

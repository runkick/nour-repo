package com.kamel.brasil.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="phase")
public class Phase {
	@Id
	@Column(name="id_phase")
	private int id_phase;
	
	@Column(name="nom_phase")
	private String nom_phase;
	
	protected Phase(){
		
	}
	public Phase (int id_phase,String nom_phase){
		
		super();
		this.id_phase=id_phase;
		this.nom_phase=nom_phase;
	}
	public int getId_phase() {
		return id_phase;
	}
	public void setId_phase(int id_phase) {
		this.id_phase = id_phase;
	}
	public String getNom_phase() {
		return nom_phase;
	}
	public void setNom_phase(String nom_phase) {
		this.nom_phase = nom_phase;
	}
	

}

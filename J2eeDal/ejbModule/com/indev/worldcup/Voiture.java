package com.indev.worldcup;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

//on met les annotations soit sur les attributs soit sur les getters,pour une meilleure
//pratique c'est sur les getters,ca ne se fait pa sur les deux

@Entity
@Table(name="T_VOITURE")
public class Voiture {
	
	
	private String immatriculation;
	
	//pr�ciser que cette propri�t� ne fait pas parti du mapping
	
	private int score;
	
	private int puissance;
	
	@Id
	@Column(name="PK_VO")
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public int getPuissance() {
		return puissance;
	}
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	@Transient
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}

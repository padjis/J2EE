package com.indev.worldcup.tournament;
/***********************************************************************
 * Module:  Game.java
 * Author:  PADJIS
 * Purpose: Defines the Class Game
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.indev.worldcup.data.Item;

@Entity
public class Game implements Serializable {
	@Id @GeneratedValue
   private int idgame;
   private String datem;
   private String heurem;
   private int statem;
   private String arbitrem;
   private String eqpa;
   private String eqpb;
   private int nbrbuta;
   private int nbrbutb;
   
   //liste des adversaires
   @ManyToMany
   List<Team> teamList=new ArrayList<Team>();
   
   //match events list
   @OneToMany(mappedBy="game")
   List<Matchevents> matcheventsList=new ArrayList<Matchevents>();
   
   //stadium where the match is played
   @ManyToOne
   Stadium stadium;
   
   //item related to the match (ticket)
   @OneToOne(mappedBy="game")
   private Item item;

	public int getIdgame() {
		return idgame;
	}
	
	public void setIdgame(int idgame) {
		this.idgame = idgame;
	}
	
	public String getDatem() {
		return datem;
	}
	
	public void setDatem(String datem) {
		this.datem = datem;
	}
	
	public String getHeurem() {
		return heurem;
	}
	
	public void setHeurem(String heurem) {
		this.heurem = heurem;
	}
	
	public int getStatem() {
		return statem;
	}
	
	public void setStatem(int statem) {
		this.statem = statem;
	}
	
	public String getArbitrem() {
		return arbitrem;
	}
	
	public void setArbitrem(String arbitrem) {
		this.arbitrem = arbitrem;
	}
	
	public String getEqpa() {
		return eqpa;
	}
	
	public void setEqpa(String eqpa) {
		this.eqpa = eqpa;
	}
	
	public String getEqpb() {
		return eqpb;
	}
	
	public void setEqpb(String eqpb) {
		this.eqpb = eqpb;
	}
	
	public int getNbrbuta() {
		return nbrbuta;
	}
	
	public void setNbrbuta(int nbrbuta) {
		this.nbrbuta = nbrbuta;
	}
	
	public int getNbrbutb() {
		return nbrbutb;
	}
	
	public void setNbrbutb(int nbrbutb) {
	this.nbrbutb = nbrbutb;
}

}
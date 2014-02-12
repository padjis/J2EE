package com.indev.worldcup.tournament;
/***********************************************************************
 * Module:  Stadium.java
 * Author:  PADJIS
 * Purpose: Defines the Class Stadium
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Stadium implements Serializable {
   @Id @GeneratedValue
   private int idstadium;
   private String names;
   private String infos;
   private int capacitys;
   
   //liste des matchs � acceuillir
   @OneToMany(mappedBy="stadium")
   List<Game> gameList=new ArrayList<Game>();
   
	public int getIdstadium() {
		return idstadium;
	}
	public void setIdstadium(int idstadium) {
		this.idstadium = idstadium;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public String getInfos() {
		return infos;
	}
	public void setInfos(String infos) {
		this.infos = infos;
	}
	public int getCapacitys() {
		return capacitys;
	}
	public void setCapacitys(int capacitys) {
		this.capacitys = capacitys;
	}

   
   
}
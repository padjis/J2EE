package com.indev.worldcup.tournament;
/***********************************************************************
 * Module:  Team.java
 * Author:  PADJIS
 * Purpose: Defines the Class Team
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.indev.worldcup.user.Users;

@Entity
public class Team implements Serializable{
	@Id
   private String namet;
   private String mininamet;
   private int pointt;
   private String groupt;
   private int patht;
   private int goalmt;
   private int carrt;
   private int carjt;
   private int goalet;
   private int matchjt;
   private int matchgt;
   private int levelt;
   
   //list of players
   @OneToMany(mappedBy="team")
   List<Player> playerList=new ArrayList<Player>();
   
   //list of games
   @ManyToMany(mappedBy="teamList")
   List<Game> gameList=new ArrayList<Game>();
   
   //match events list
   @OneToMany(mappedBy="team")
   List<Matchevents> matcheventsList=new ArrayList<Matchevents>();
   
   //creating user
   @ManyToOne
   Users creator;
   
   public String getNamet() {
	return namet;
}

public String getMininamet() {
	return mininamet;
}

public int getPointt() {
	return pointt;
}

public String getGroupt() {
	return groupt;
}

public int getPatht() {
	return patht;
}

public int getGoalmt() {
	return goalmt;
}

public int getCarrt() {
	return carrt;
}

public int getCarjt() {
	return carjt;
}

public int getGoalet() {
	return goalet;
}

public int getMatchjt() {
	return matchjt;
}

public int getMatchgt() {
	return matchgt;
}

public int getLevelt() {
	return levelt;
}

}
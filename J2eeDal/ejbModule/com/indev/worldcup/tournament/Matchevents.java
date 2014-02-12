package com.indev.worldcup.tournament;
/***********************************************************************
 * Module:  Matchevents.java
 * Author:  PADJIS
 * Purpose: Defines the Class Matchevents
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Matchevents implements Serializable {
	@Id @GeneratedValue
   private int idevents;
   private int typee;
   private int equipee;
   private String textee;
   private int minutee;
   private int secondee;
   
   //related player
   @ManyToOne
   Player player;
   
   //related game
   @ManyToOne
   Game game;
   
   //related team
   @ManyToOne
   Team team;
   
   public int getIdevents() {
	return idevents;
}
public void setIdevents(int idevents) {
	this.idevents = idevents;
}
public int getTypee() {
	return typee;
}
public void setTypee(int typee) {
	this.typee = typee;
}
public int getEquipee() {
	return equipee;
}
public void setEquipee(int equipee) {
	this.equipee = equipee;
}
public String getTextee() {
	return textee;
}
public void setTextee(String textee) {
	this.textee = textee;
}
public int getMinutee() {
	return minutee;
}
public void setMinutee(int minutee) {
	this.minutee = minutee;
}
public int getSecondee() {
	return secondee;
}
public void setSecondee(int secondee) {
	this.secondee = secondee;
}


}
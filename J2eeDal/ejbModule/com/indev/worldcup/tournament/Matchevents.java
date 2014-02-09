package com.indev.worldcup.tournament;
/***********************************************************************
 * Module:  Matchevents.java
 * Author:  PADJIS
 * Purpose: Defines the Class Matchevents
 ***********************************************************************/

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Matchevents {
	@Id
   private int idevents;
   private int typee;
   private int equipee;
   private String textee;
   private int minutee;
   private int secondee;
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
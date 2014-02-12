package com.indev.worldcup.user;
/***********************************************************************
 * Module:  Users.java
 * Author:  PADJIS
 * Purpose: Defines the Class Users
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.indev.worldcup.data.Freelancerequest;
import com.indev.worldcup.data.Media;
import com.indev.worldcup.data.Vente;
import com.indev.worldcup.tournament.Team;

@Entity
public class Users implements Serializable{
	@Id
   private String username;
   private String firstname;
   private String lastname;
   private String password;
   private String privilige;
   private String mail;
   private int numtel;
   private String enterprisename;
   private int enterprisetel;
   private String path;
   private int state;
   
   //liste des equipes cr��es
   @OneToMany(mappedBy="creator")
   List<Team> managedTeams=new ArrayList<Team>();
   
   //envoie de requete
   @OneToOne(mappedBy="sender")
   Freelancerequest sendedRequest;
   
   //traitement de requete
   @OneToMany(mappedBy="receiver")
   List<Freelancerequest> receivedRequests=new ArrayList<Freelancerequest>();
   
   //liste des ventes
   @OneToMany(mappedBy="userBuying")
   private List<Vente> ventesList=new ArrayList<Vente>();
   
   //cr�ateur
   @OneToMany(mappedBy="creator")
   private List<Media> createdMediaList=new ArrayList<Media>();
   
   //medias manag�s
   @ManyToMany
   @JoinTable(name="users_media")
   private List<Media> managedMediaList=new ArrayList<Media>();
   
   
   public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getPrivilige() {
	return privilige;
}

public void setPrivilige(String privilige) {
	this.privilige = privilige;
}

public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}

public int getNumtel() {
	return numtel;
}

public void setNumtel(int numtel) {
	this.numtel = numtel;
}

public String getEnterprisename() {
	return enterprisename;
}

public void setEnterprisename(String enterprisename) {
	this.enterprisename = enterprisename;
}

public int getEnterprisetel() {
	return enterprisetel;
}

public void setEnterprisetel(int enterprisetel) {
	this.enterprisetel = enterprisetel;
}

public String getPath() {
	return path;
}

public void setPath(String path) {
	this.path = path;
}

public int getState() {
	return state;
}

public void setState(int state) {
	this.state = state;
}

public List<Media> getCreatedMediaList() {
	return createdMediaList;
}

public void setCreatedMediaList(List<Media> createdMediaList) {
	this.createdMediaList = createdMediaList;
}

public List<Media> getManagedMediaList() {
	return managedMediaList;
}

public void setManagedMediaList(List<Media> managedMediaList) {
	this.managedMediaList = managedMediaList;
}





}
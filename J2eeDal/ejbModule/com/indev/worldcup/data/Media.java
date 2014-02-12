package com.indev.worldcup.data;
/***********************************************************************
 * Module:  Media.java
 * Author:  PADJIS
 * Purpose: Defines the Class Media
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.indev.worldcup.user.Users;


@Entity
public class Media implements Serializable {

	@Id @GeneratedValue
   private int idmedia;
   private String typem;
   private String pathm;
   private String textem;
   private String datecreationm;
   private int statem;
   
   //utilisateur qui propose la pub, la news ou l'interview
   @ManyToOne
   private Users creator;
   
   @ManyToMany(mappedBy="managedMediaList")
   private List<Users> managerList=new ArrayList<Users>();

   
	public int getIdmedia() {
		return idmedia;
	}
	public void setIdmedia(int idmedia) {
		this.idmedia = idmedia;
	}
	public String getTypem() {
		return typem;
	}
	public void setTypem(String typem) {
		this.typem = typem;
	}
	public String getPathm() {
		return pathm;
	}
	public void setPathm(String pathm) {
		this.pathm = pathm;
	}
	public String getTextem() {
		return textem;
	}
	public void setTextem(String textem) {
		this.textem = textem;
	}
	public String getDatecreationm() {
		return datecreationm;
	}
	public void setDatecreationm(String datecreationm) {
		this.datecreationm = datecreationm;
	}
	public int getStatem() {
		return statem;
	}
	public void setStatem(int statem) {
		this.statem = statem;
	}
	public Users getCreator() {
		return creator;
	}
	public void setCreator(Users creator) {
		this.creator = creator;
	}
	public List<Users> getManagerList() {
		return managerList;
	}
	public void setManagerList(List<Users> managerList) {
		this.managerList = managerList;
	}

	
}
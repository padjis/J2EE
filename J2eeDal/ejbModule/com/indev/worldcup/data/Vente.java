/***********************************************************************
 * Module:  Vente.java
 * Author:  PADJIS
 * Purpose: Defines the Class Vente
 ***********************************************************************/
package com.indev.worldcup.data;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.indev.worldcup.user.Users;

@Entity
public class Vente implements Serializable{
   @Id @GeneratedValue
   private int idvente;
   private String datevente;
   private int quantitevente;
   
   //utilisateur concern� par la vente
   @ManyToOne
   @JoinColumn(name="username")
   private Users userBuying;
   
   //objet concern� par la vente
   @ManyToOne
   @JoinColumn(name="iditem")
   private Item itemSold;
   
   public int getIdvente() {
	   	return idvente;
	}
	
	public void setIdvente(int idvente) {
		this.idvente = idvente;
	}
	
	public String getDatevente() {
		return datevente;
	}
	
	public void setDatevente(String datevente) {
		this.datevente = datevente;
	}
	
	public int getQuantitevente() {
		return quantitevente;
	}
	
	public void setQuantitevente(int quantitevente) {
		this.quantitevente = quantitevente;
	}

}
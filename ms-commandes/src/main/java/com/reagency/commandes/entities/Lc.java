package com.reagency.commandes.entities;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.abdev.annotation.entityintegration.MO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor  @AllArgsConstructor
public class Lc implements Serializable
{ 
	@Id @GeneratedValue
	private Integer id;
//	
//	private Integer qte;
//
//	@MO(uriRessource = "http://localhost:8080/ms-offers/offers",fkey = "idOffer")
//	private Offer offer; 
//	@Transient private Integer idOffer;
}


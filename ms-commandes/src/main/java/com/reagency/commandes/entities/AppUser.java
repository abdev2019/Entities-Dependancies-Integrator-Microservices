package com.reagency.commandes.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Transient;

import com.abdev.annotation.entityintegration.MO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor  @AllArgsConstructor
public class AppUser implements Serializable
{  
	private Integer id;
	private String name; 
	private String username;
	private String password;

	@Transient @MO(uriRessource = "http://localhost:8080/ms-offers/offers/user", fkey = "id")
	List<Offer> offers;
}
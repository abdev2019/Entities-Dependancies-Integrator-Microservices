package com.reagency.commandes.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 
import javax.persistence.Transient;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.abdev.annotation.entityintegration.MO;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore; 

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@CrossOrigin("*")
@Entity @Data @NoArgsConstructor  @AllArgsConstructor
public class Commande implements Serializable
{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Integer id;
	
	@Transient @MO(uriRessource = "http://localhost:8080/ms-offers/offers", fkey="idOffre")
	private Offer offer;
	@JsonIgnore private Integer idOffre;
	
	@Transient @MO(uriRessource = "http://localhost:8080/ms-users/appUsers", fkey="idUser")
	private AppUser user;
	@JsonIgnore private Integer idUser;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dateCommande;  ;
}



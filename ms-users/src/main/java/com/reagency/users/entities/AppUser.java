package com.reagency.users.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.abdev.annotation.entityintegration.MO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@CrossOrigin("*")
@Entity @Data @NoArgsConstructor  @AllArgsConstructor
public class AppUser implements Serializable
{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Integer id;
	private String name; 
	private String username;
	private String password;
	
	@Transient @MO(uriRessource = "http://localhost:8080/ms-offers/offers/user", fkey = "id")
	List<Offer> offers;
}

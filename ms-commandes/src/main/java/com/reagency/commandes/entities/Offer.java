package com.reagency.commandes.entities;

import java.io.Serializable;
 

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor  @AllArgsConstructor
public class Offer implements Serializable
{ 
	private Integer id;
	private String type; 
	private String description;
	private String owner;
}
package com.reagency.offers.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor  @AllArgsConstructor
public class Offer implements Serializable
{ 
	@Id @GeneratedValue
	private Integer id;
	private String type; 
	private String description; 
	
	private Integer owner;
}
package com.estateagency.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@CrossOrigin("*")
@Entity @Data @NoArgsConstructor  @AllArgsConstructor
public class Agence implements Serializable
{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Integer id;
	private String name;
	private String ville;
	private String adresse;
	@Size(max=10) private String tel;
}

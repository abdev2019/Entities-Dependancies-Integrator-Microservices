package com.reagency.commandes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource; 
import org.springframework.web.bind.annotation.CrossOrigin;

import com.reagency.commandes.entities.Commande;
 

@CrossOrigin("*")
@RepositoryRestResource
public interface CommandeRepository  extends JpaRepository<Commande, Integer>{
}

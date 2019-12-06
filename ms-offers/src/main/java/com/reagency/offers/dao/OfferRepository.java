package com.reagency.offers.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource; 
import org.springframework.web.bind.annotation.CrossOrigin;

import com.reagency.offers.entities.Offer;
 
 

@CrossOrigin("*")
@RepositoryRestResource
public interface OfferRepository  extends JpaRepository<Offer, Integer>{
	public List<Offer> findByOwner(Integer owner);
}

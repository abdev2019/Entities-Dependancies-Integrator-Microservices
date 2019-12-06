package com.reagency.offers.web;
  
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
 
import com.reagency.offers.dao.OfferRepository;
import com.reagency.offers.entities.Offer; 


@RestController
public class OfferController 
{
	@Autowired OfferRepository repository;   
	
	@GetMapping(value = "/offers/user/{idUser}")
	public List<Offer> getOffersOfUser(@PathVariable("idUser") Integer idUser) { 
		return repository.findByOwner(idUser);   
	}
	
}

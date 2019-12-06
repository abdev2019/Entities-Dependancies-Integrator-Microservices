package com.reagency.commandes.web;
 
import java.util.ArrayList;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.abdev.annotation.entityintegration.IEntityIntegration;
import com.reagency.commandes.dao.CommandeRepository; 
import com.reagency.commandes.entities.Commande; 


@RestController
public class CommandeController 
{
	@Autowired CommandeRepository repository; 
	@Autowired IEntityIntegration jpaIntegration;
	
	@GetMapping(value = "/commandes/{id}")
	public Commande getCommande(@PathVariable("id") Integer id) 
	{ 
		Commande cmd = repository.findById(id).orElse(null);
		jpaIntegration.process(cmd); 
		return cmd; 
	}
	
	
	@GetMapping(value = "/commandes")
	public List<Commande> getCommandes() 
	{ 
		List<Commande> cmds = repository.findAll(); 
		for(Commande cmd : cmds)  
			jpaIntegration.process(cmd);  
		
		return cmds;
	}
	
}

package com.reagency.users.web;
  
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.abdev.annotation.entityintegration.IEntityIntegration;
import com.reagency.users.dao.AppUserRepository;
import com.reagency.users.entities.AppUser; 


@RestController
public class UserController 
{
	@Autowired AppUserRepository repository; 
	@Autowired IEntityIntegration jpaIntegration;  
	
	@GetMapping(value = "/appUsers")
	public List<AppUser> getUsers() { 
		List<AppUser> users = repository.findAll();
		for(AppUser user : users) jpaIntegration.process(user);
		return users;
	}
	
	@GetMapping(value = "/appUsers/{idUser}")
	public AppUser getUser(@PathVariable("idUser") Integer idUser) { 
		AppUser user = repository.findById(idUser).orElse(null);  
		jpaIntegration.process(user);
		return user;
	}
	
}

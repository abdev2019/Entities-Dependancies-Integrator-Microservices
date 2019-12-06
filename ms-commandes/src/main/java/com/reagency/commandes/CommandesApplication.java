package com.reagency.commandes;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient; 
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.abdev.annotation.entityintegration.EntityIntegration;
import com.abdev.annotation.entityintegration.IEntityIntegration;
import com.reagency.commandes.dao.CommandeRepository; 
import com.reagency.commandes.entities.Commande;
 


@Configuration
@EnableDiscoveryClient 
@SpringBootApplication
public class CommandesApplication extends RepositoryRestConfigurerAdapter implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CommandesApplication.class, args);
	}
	

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Commande.class);
    }
    
    @Bean public IEntityIntegration getEntityIntegration() {
    	return new EntityIntegration();
    }
	 

	@Autowired CommandeRepository repository;
	@Override public void run(String... args) throws Exception {
		repository.save(new Commande(null,null,1, null,1, new Date()));
		repository.save(new Commande(null,null,1, null,2, new Date()));
		repository.save(new Commande(null,null,2, null,3, new Date()));
	} 

}

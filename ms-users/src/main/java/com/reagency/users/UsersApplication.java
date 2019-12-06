package com.reagency.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.abdev.annotation.entityintegration.EntityIntegration;
import com.abdev.annotation.entityintegration.IEntityIntegration;
import com.reagency.users.dao.AppUserRepository;
import com.reagency.users.entities.AppUser;
 
 
 
@EnableDiscoveryClient
@SpringBootApplication
public class UsersApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UsersApplication.class, args);
	}
	

    @Bean public IEntityIntegration getEntityIntegration() {
    	return new EntityIntegration();
    }

	@Autowired AppUserRepository ar;
	@Override public void run(String... args) throws Exception {
		ar.save(new AppUser(null,"Mohamed","simo","simo",null));
		ar.save(new AppUser(null,"Ali","ali","ali",null));
		ar.save(new AppUser(null,"Said","said","said",null));
	}

}

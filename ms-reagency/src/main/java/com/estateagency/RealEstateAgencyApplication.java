package com.estateagency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient; 

import com.estateagency.dao.AgenceRepository;
import com.estateagency.entities.Agence;



@EnableDiscoveryClient
@SpringBootApplication
public class RealEstateAgencyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RealEstateAgencyApplication.class, args);
	}
 

	@Autowired AgenceRepository ar;
	@Override public void run(String... args) throws Exception {
		ar.save(new Agence(null,"Wikalat Mohamed","Agadir","Rue wed ziz","0619237183"));
		ar.save(new Agence(null,"Wikalat Ali","Casablanca","Mostaqbal","0619237183"));
		ar.save(new Agence(null,"Wikalat Said","Casablanca","Mostaqbal","0619237183"));
	}
}

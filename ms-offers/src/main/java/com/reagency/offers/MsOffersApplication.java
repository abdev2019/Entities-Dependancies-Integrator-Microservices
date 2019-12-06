package com.reagency.offers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.reagency.offers.dao.OfferRepository;
import com.reagency.offers.entities.Offer;
 

@EnableDiscoveryClient
@SpringBootApplication
public class MsOffersApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MsOffersApplication.class, args);
	}

	@Autowired OfferRepository rep;
	
	@Override public void run(String... args) throws Exception {
		rep.save(new Offer(null,"type 1","Offre resto", 1));
		rep.save(new Offer(null,"type 2","offre coif", 1));
		rep.save(new Offer(null,"type 3","offre taxi", 1));
	}
}

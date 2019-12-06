package com.estateagency.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.estateagency.entities.Agence;

@CrossOrigin("*")
@RepositoryRestResource
public interface AgenceRepository  extends JpaRepository<Agence, Integer>{
}

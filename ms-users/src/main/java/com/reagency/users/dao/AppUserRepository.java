package com.reagency.users.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.reagency.users.entities.AppUser;
 

@CrossOrigin("*")
@RepositoryRestResource
public interface AppUserRepository  extends JpaRepository<AppUser, Integer>{
}

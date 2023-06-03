package com.coderhouse.deploy.repository;

import com.coderhouse.deploy.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}

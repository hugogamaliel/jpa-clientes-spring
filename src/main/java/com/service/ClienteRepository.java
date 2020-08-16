package com.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> 
{

}

package com.digitalab.springboot.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.digitalab.springboot.backend.apirest.models.entity.Cliente;


public interface IClienteDao extends JpaRepository<Cliente, Long>{

}

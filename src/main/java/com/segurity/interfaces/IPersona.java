package com.segurity.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.segurity.modelo.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{
	
}

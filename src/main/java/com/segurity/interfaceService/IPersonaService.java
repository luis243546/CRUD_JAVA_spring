package com.segurity.interfaceService;

import java.util.List;
import java.util.Optional;

import com.segurity.modelo.Persona;

public interface IPersonaService {
	public List<Persona> listar();
	public Optional<Persona>listaId (int id);
	public int save (Persona p);
	public void delete (int id);
}

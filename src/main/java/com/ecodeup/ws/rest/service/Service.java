package com.ecodeup.ws.rest.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ecodeup.DAO.PersonaDao;
import com.ecodeup.model.Persona;

@Path("/PruebaAlejo")
public class Service {
	
	
	
	@GET
	@Path("/listadoLibros")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public  List<Persona> listadoLibros() {
		PersonaDao personaDao= new PersonaDao();
		
		return personaDao.obtenerPersonas();
	}
	
	
	@POST
	@Path("/registrarPersona")
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	public void registrarPersona(Persona persona) {
	PersonaDao personaDao= new PersonaDao();
	
	 personaDao.guardar(persona);
	}
	
	
	
	
}

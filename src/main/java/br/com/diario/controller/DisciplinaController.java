package br.com.diario.controller;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.diario.dao.DisciplinaDAO;
import br.com.diario.model.Disciplina;

@Path("/disciplina")
public class DisciplinaController {
	
	@Inject
	private DisciplinaDAO disciplinaDAO;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll() {
		return Response.status(200).entity(disciplinaDAO.getAll()).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(Disciplina disciplina) {
		disciplinaDAO.save(disciplina);
		return Response.status(200).build();
	}

}

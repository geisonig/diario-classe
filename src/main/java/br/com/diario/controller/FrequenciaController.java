package br.com.diario.controller;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.diario.dao.FrequenciaDAO;
import br.com.diario.model.Frequencia;

@Path("/frequencia")
public class FrequenciaController {
	
	@Inject
	private FrequenciaDAO frequenciaDAO;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll() {
		return Response.status(200).entity(frequenciaDAO.getAll()).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(Frequencia frequencia) {
		frequenciaDAO.save(frequencia);
		return Response.status(200).build();
	}

}

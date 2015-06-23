package br.com.diario.controller;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.diario.dao.PessoaDAO;
import br.com.diario.model.Pessoa;


@Path("/pessoa")
public class PessoaController {
	
	@Inject
	private PessoaDAO pessoaDAO;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll() {
		return Response.status(200).entity(pessoaDAO.getAll()).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(Pessoa pessoa) {
		pessoaDAO.save(pessoa);
		return Response.status(200).build();
	}
}

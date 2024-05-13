package br.com.fiap.resources;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.beans.Aluno;
import br.com.fiap.bo.AlunoBo;

@Path("/aluno")
public class AlunoResource {

	private AlunoBo alunoBo = new AlunoBo();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response inserirRs(Aluno aluno, @Context UriInfo uriInfo) throws ClassNotFoundException, SQLException {
		alunoBo.inserirBo(aluno);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(aluno.getRm()));
		
		return Response.created(builder.build()).build();
	}
	@PUT
	@Path("{/rm}")
	public Response atualizaRs (Aluno aluno, @PathParam("rm")int rm) throws ClassNotFoundException, SQLException {
		alunoBo.atualizarBo(aluno);
		return Response.ok().build();
	}
	
	@DELETE
	@Path("/{rm}")
	public Response deletarRs( @PathParam("rm") int rm) throws ClassNotFoundException, SQLException {
		alunoBo.deletarBo(rm);
		return Response.ok().build();
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Aluno> selecionarRs() throws ClassNotFoundException, SQLException{
		return (ArrayList<Aluno>) alunoBo.selecionarBo();
	}
}

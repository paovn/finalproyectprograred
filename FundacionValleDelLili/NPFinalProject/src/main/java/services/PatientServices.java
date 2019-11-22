package services;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import db.MySQLConnection;
import model.Patient;

@Stateless
@Path("patients")
public class PatientServices {
	
	@POST
	@Path("insert")
	@Consumes("application/json")
	public String registerPatient(Patient patient) {
		MySQLConnection connection = new MySQLConnection();
		String message = connection.registerPatient(patient);
		connection.close();
		return message;
	}
	
	@GET
	@Path("get/{name}")
	@Produces("application/json")
	public ArrayList searchPatient(@PathParam("name")String name){
//		MySQLConnection connection = new MySQLConnection();
//		ArrayList mymovies = connection.searchActorsMovies(name);
//		connection.close();
//		return mymovies;
		return null;
	}
	
	
	@DELETE
	@Path("delete/{id}")
	@Produces("application/json")
	public String deletePatient(@PathParam("id")String id) {
		MySQLConnection connection = new MySQLConnection();
		String message = connection.deletePatient(Integer.parseInt(id));
		connection.close();
		return message;
	}
	
}

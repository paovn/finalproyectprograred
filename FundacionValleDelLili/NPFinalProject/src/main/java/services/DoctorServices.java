package services;

import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import db.MySQLConnection;
import model.Doctor;

@Stateless
@Path("doctor")
public class DoctorServices {
	@Path("echo")
	@GET
	public String prueba() {
		return "echo";
		
	}
	
	@POST
	@Path("insert")
	@Consumes("application/json")
	public String registerDoctor(Doctor doctor) {
		MySQLConnection connection = new MySQLConnection();
		connection.registerDoctor(doctor);
		connection.close();
		return doctor.getName() + " has been registered to the database";
	}
	
	

}

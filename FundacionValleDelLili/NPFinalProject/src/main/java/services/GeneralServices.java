package services;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import db.MySQLConnection;
import model.Doctor;

@Stateless
@Path("general")
public class GeneralServices {
	
	@GET
	@Path("info")
	@Produces("application/json")
	public ArrayList<Doctor> allinfo() {
		MySQLConnection connection = new MySQLConnection();
		ArrayList<Doctor> allinfo = connection.totalReport();
		connection.close();
		return allinfo;
	}

}

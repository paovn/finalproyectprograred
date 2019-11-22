package model;

import java.util.ArrayList;

public class Doctor {
	
	private int id;
	private String name;
	private String lastname;
	private String cc;
	private ArrayList<Patient> patients;
	
	public Doctor(int id, String name, String lastname, String cc) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.cc = cc;
		patients = new ArrayList<Patient>();
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(String name, String lastname, String cc) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.cc = cc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}	

	
	
}

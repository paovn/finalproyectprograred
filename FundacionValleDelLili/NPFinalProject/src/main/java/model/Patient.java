package model;

public class Patient {
	
	private int id;
	private String name;
	private String lastname;
	private String birthdate;
	private int doctorID;
	
	public Patient(int id, String name, String lastname, String birthdate, int doctorID) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.birthdate = birthdate;
		this.doctorID = doctorID;
	}

	public Patient(String name, String lastname, String birthdate, int doctorID) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.birthdate = birthdate;
		this.doctorID = doctorID;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public int getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}
	
	
	
	

}

package model;

import java.util.ArrayList;

public class Doctor {
	///
	///
	private int id;
	private String name;
	private String lastname;
	private String cc;
	private int age;
	private String phone;
	private String email;
	private String password;
	private ArrayList<Patient> patients;
	
	public Doctor(int id, String name, String lastname, String cc, int age, String phone, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.cc = cc;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.password = password;
		patients = new ArrayList<Patient>();
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(String name, String lastname, String cc, int age, String phone, String email, String password) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.cc = cc;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.password = password;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
}

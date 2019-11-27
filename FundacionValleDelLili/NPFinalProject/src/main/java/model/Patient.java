package model;

public class Patient {
	
	private int id;
	private String name;
	private String lastname;
	private String phone;
	private String email;
	private int age;
	private int doctorID;
	private String cc;
	
	public Patient(int id, String name, String lastname, int doctorID,String phone,String email,int age,String cc) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.phone=phone;
		this.email=email;
		this.age=age;
		this.doctorID = doctorID;
		this.cc=cc;
	}

	public Patient(String name, String lastname,int doctorID,String phone,String email,int age,String cc) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.doctorID = doctorID;
		this.phone=phone;
		this.email=email;
		this.age=age;
		this.doctorID = doctorID;
		this.cc=cc;
		
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


	public int getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}
	
	
	
	

}

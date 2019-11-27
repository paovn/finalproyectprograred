package model;

public class Test {

	private int id;
	private int patientsID;
	private String date;
	
	public Test(int id,int patientsID,String date) {
		this.date=date;
		this.patientsID=patientsID;
		this.id=id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPatientsID() {
		return patientsID;
	}

	public void setPatientsID(int patientsID) {
		this.patientsID = patientsID;
	}
	
	
	
	
}

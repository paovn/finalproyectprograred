package model;

public class TestTapping extends Test {

	private int ascinesia;
	private int bradicinesia;
	public TestTapping(int id, int patientsID, String date, int ascinesia,int bradicinesia) {
		super(id, patientsID, date);
		this.ascinesia=bradicinesia;
		this.ascinesia=ascinesia;
		// TODO Auto-generated constructor stub
	}
	public int getAscinesia() {
		return ascinesia;
	}
	public void setAscinesia(int ascinesia) {
		this.ascinesia = ascinesia;
	}
	public int getBradicinesia() {
		return bradicinesia;
	}
	public void setBradicinesia(int bradicinesia) {
		this.bradicinesia = bradicinesia;
	}



}

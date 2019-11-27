package model;

public class TestEsperial extends Test{

	private String imagen;
	public TestEsperial(int id, int patientsID, String date,String imagen) {
		super(id, patientsID, date);
		this.imagen=imagen;
		// TODO Auto-generated constructor stub
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	
	
	
}

package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Doctor;
import model.Patient;


public class MySQLConnection {
	

	private Connection connection;
	
	private Statement statement;
	
	public static String TABLE_DOCTORS = "doctors";
	public static String TABLE_PATIENTS = "patients";
	public static String DOCTORS_ID = "id";
	public static String DOCTORS_NAME = "name";
	public static String DOCTORS_LASTNAME = "lastname";
	public static String DOCTORS_CC = "cc";
	public static String DOCTORS_AGE = "age";
	public static String DOCTORS_PHONE = "phone";
	public static String DOCTORS_EMAIL = "email";
	public static String DOCTORS_DCPASSWORD = "dcpassword";
	public static String PATIENTS_ID = "id";
	public static String PATIENTS_NAME = "name";
	public static String PATIENTS_LASTNAME = "lastname";
	public static String PATIENTS_BIRTHDATE = "birthdate";
	public static String PATIENTS_DOCTORID = "doctorID";
	
	private ArrayList<Doctor> doctors;

	public MySQLConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/blockbuster");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctorsdb","root","");
			statement = connection.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		doctors = new ArrayList<Doctor>();
	}
	
	public void close() {
		try {
			connection.close();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
	// TODO Auto-generated method stub

	}

	public void registerDoctor(Doctor doctor) {
		//https://zinoui.com/blog/storing-passwords-securely
		String sql="INSERT INTO $TABLE($NAME,$LASTNAME, $CC,$AGE,$PHONE,$EMAIL,$DCPASSWORD) VALUES('$VNAME','$VLASTNAME','$VCC',$VAGE,'$VPHONE','$VEMAIL',ENCODE('$VDCPASSWORD', 'secret'))";
		sql=sql
				.replace("$TABLE", TABLE_DOCTORS)
				.replace("$NAME", DOCTORS_NAME)
				.replace("$LASTNAME", DOCTORS_LASTNAME)
				.replace("$CC", DOCTORS_CC)
				.replace("$AGE", DOCTORS_AGE)
				.replace("$PHONE", DOCTORS_PHONE)
				.replace("$EMAIL", DOCTORS_EMAIL)
				.replace("$DCPASSWORD", DOCTORS_DCPASSWORD)
				.replace("$VNAME", doctor.getName())
				.replace("$VLASTNAME", doctor.getLastname())
				.replace("$VCC", doctor.getCc())
				.replace("$VAGE", doctor.getAge() + "")
				.replace("$VPHONE", doctor.getPhone())
				.replace("$VEMAIL", doctor.getEmail())
				.replace("VDCPASSWORD", doctor.getPassword())
				;

		
		try {
			statement.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String registerPatient(Patient patient) {
		String sql="INSERT INTO $TABLE($NAME,$LASTNAME,$BIRTHDATE,$DOCTORID) VALUES('$VNAME','$VLASTNAME','$VBIRTHDATE',$VDOCTORID)";
		sql=sql
				.replace("$TABLE", TABLE_PATIENTS)
				.replace("$NAME",PATIENTS_NAME)
				.replace("$LASTNAME", PATIENTS_LASTNAME)
				.replace("$BIRTHDATE", PATIENTS_BIRTHDATE)
				.replace("$DOCTORID", PATIENTS_DOCTORID)
				.replace("$VNAME", patient.getName())
				.replace("$VLASTNAME", patient.getLastname())
				.replace("$VBIRTHDATE", patient.getBirthdate())
				.replace("$VDOCTORID", patient.getDoctorID() + "");
		
		try {
			statement.execute(sql);
			return patient.getName() + " has been registered to doctor" + patient.getDoctorID();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Could not register the patient";
		}
		
	}

	public String deletePatient(int id) {
		String sql="DELETE FROM $TABLE WHERE $ID = $VID";
		sql=sql
				.replace("$TABLE", TABLE_PATIENTS)
				.replace("$ID",PATIENTS_ID)
				.replace("$VID", id+ "");
		
		try {
			statement.execute(sql);
			return "The patient " + id + "has been deleted";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "The patient " + id + "has not been deleted";
		}
	}
	
	
	private void getAllDoctors() {
		String sql = "SELECT * FROM $TABLE";
		sql = sql.replace("$TABLE", TABLE_DOCTORS);
		
		try {
			ResultSet resultados = statement.executeQuery(sql);
			
			while(resultados.next()) {
				int id = resultados.getInt(1);
				String name = resultados.getString(2);
				String lastname = resultados.getString(3);
				String cc = resultados.getString(4);
				int age = resultados.getInt(5);
				String phone = resultados.getString(6);
				String email = resultados.getString(7);
				String password = resultados.getString(8);
				doctors.add(new Doctor(id,name,lastname,cc,age,phone,email,password));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Doctor> totalReport(){
		getAllDoctors();
		for (int i = 0; i < doctors.size(); i++) {
			getMyPatients(i+1);
		}
		return doctors;
		
	}

	private void getMyPatients(int doctorid) {
		String sql = "SELECT * FROM $TABLE WHERE $DOCTORID = $VDOCTORID";
		sql = sql.replace("$TABLE", TABLE_PATIENTS)
				.replace("$DOCTORID", PATIENTS_DOCTORID)
				.replace("$VDOCTORID", doctorid + "");
		ArrayList<Patient> patients = new ArrayList<Patient>();
		try {
			ResultSet resultados = statement.executeQuery(sql);
			
			while(resultados.next()) {
				int id = resultados.getInt(1);
				String name = resultados.getString(2);
				String lastname = resultados.getString(3);
				String birthdate = resultados.getString(4);
				int doctorID = resultados.getInt(5);
				patients.add(new Patient(id, name, lastname, birthdate, doctorID));
			}
			doctors.get(doctorid - 1).setPatients(patients);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}

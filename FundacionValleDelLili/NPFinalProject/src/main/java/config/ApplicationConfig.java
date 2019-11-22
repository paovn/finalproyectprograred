package config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import services.DoctorServices;
import services.GeneralServices;
import services.PatientServices;


@ApplicationPath("web")
public class ApplicationConfig extends Application{
	
	@Override
	public Set<Class<?>> getClasses(){
		Set<Class<?>> recursos = new HashSet<Class<?>>();
		recursos.add(DoctorServices.class);
		recursos.add(PatientServices.class);
		recursos.add(GeneralServices.class);
		return recursos;
		
	}
}

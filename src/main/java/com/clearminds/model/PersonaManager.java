package com.clearminds.model;

import com.clearminds.excepcion.InstanceException;
import com.clearminds.impl.ServicioPersonaArchivos;
import com.clearminds.impl.ServicioPersonaBDD;
import com.clearminds.interfaces.ServicioPersona;

public class PersonaManager {
	private ServicioPersona serv;
	
	public PersonaManager() throws InstanceException{
		Class<?> clase;
		try {
			clase = Class.forName("com.clearminds.impl.ServicioPersonaArchivos");
			serv=(ServicioPersona)clase.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		} catch (InstantiationException e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}
		

		//this.serv = new ServicioPersonaArchivos();
	}
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}

	public ServicioPersona getServ() {
		return serv;
	}

	public void setServ(ServicioPersona serv) {
		this.serv = serv;
	}
	
	
}

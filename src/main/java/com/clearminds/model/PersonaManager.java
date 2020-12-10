package com.clearminds.model;

import com.clearminds.impl.ServicioPersonaArchivos;
import com.clearminds.impl.ServicioPersonaBDD;
import com.clearminds.interfaces.ServicioPersona;

public class PersonaManager {
	private ServicioPersona serv;
	
	public PersonaManager(){
		this.serv = new ServicioPersonaArchivos();
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

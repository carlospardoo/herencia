package com.clearminds.test;

import com.clearminds.excepcion.InstanceException;
import com.clearminds.impl.ServicioPersonaBDD;
import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;
import com.clearminds.model.PersonaManager;

public class TestManager {

	public static void main(String[] args) {
		PersonaManager pm;
		try {
			pm = new PersonaManager();
			pm.insertarPersona(new Persona("Carlos", "Pardo", "A202064889"));
		} catch (InstanceException e) {
			e.printStackTrace();
		}
		

	}

}

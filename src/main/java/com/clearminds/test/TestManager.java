package com.clearminds.test;

import com.clearminds.impl.ServicioPersonaBDD;
import com.clearminds.model.Persona;
import com.clearminds.model.PersonaManager;

public class TestManager {

	public static void main(String[] args) {
		ServicioPersonaBDD spb = new ServicioPersonaBDD();
		PersonaManager pm = new PersonaManager(spb);
		pm.insertarPersona(new Persona("Carlos", "Pardo", "A202064889"));

	}

}

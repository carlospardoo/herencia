package com.clearminds.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.clearminds.excepcion.InstanceException;
import com.clearminds.impl.ServicioPersonaArchivos;
import com.clearminds.impl.ServicioPersonaBDD;
import com.clearminds.interfaces.ServicioPersona;

public class PersonaManager {
	private ServicioPersona serv;
	
	public PersonaManager() throws InstanceException{
		String implementa = leerPropiedad("dir");
		Class<?> clase;
		try {
			clase = Class.forName(implementa);
			serv=(ServicioPersona)clase.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}
		

		//this.serv = new ServicioPersonaArchivos();
	}
	
	public static String leerPropiedad(String nombrePropiedad) {
		String valorPropiedad = null;

		Properties p = new Properties();
		try {
			File f=new File(System.getProperty("user.dir")
			+ "//src//main//java//com//clearminds//propiedades//implementacion.properties");
			//System.out.println("ruta:"+f.getAbsoluteFile());
			
			p.load(new FileReader(f));
			/*System.getProperty("user.dir")
			+ "//src//main//java//com//clearminds//cdpo//middleware//conexion.properties"*/
			
			valorPropiedad = p.getProperty(nombrePropiedad);
		} catch (FileNotFoundException e) {
			System.out.println("Error: Archivo no Encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Error al capturar archivo");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error: ");
			e.printStackTrace();
		} finally {
			p.clear();
		}

		return valorPropiedad;
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

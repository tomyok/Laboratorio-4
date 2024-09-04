package ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

import ejercicio1.DniInvalido;

public class Persona implements Comparable<Persona>{

	private String nombre;
	private String apellido;
	private String dni;

	public Persona() {

	}

	public Persona(String nombre, String apellido, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public static boolean verificarDniInvalido (String dni) throws DniInvalido
	{		
		boolean valido = true;
	    for(int i=0; i< dni.length() ; i++)
	    {
		    if (!Character.isDigit(dni.charAt(i))) {
	            valido= false; 
		    }
	    }
	    if(!valido) {
		    throw new DniInvalido();
	    }
	    return true;		   
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "Persona Nombre:" + nombre + ", Apellido:" + apellido + ", DNI:" + dni;
	}

	@Override
	public int compareTo(Persona otraPersona) {
		return this.apellido.compareTo(otraPersona.apellido);
	}

	public static TreeSet<Persona> leerPersonas(Archivo archi){
		TreeSet<Persona> personas= new TreeSet<Persona>();
		
		try {
			FileReader entrada= new FileReader(archi.getRuta());
			BufferedReader bufferedReader = new BufferedReader(entrada);
			
			String linea= bufferedReader.readLine();
			while(linea != null) {
				String[] datos= linea.split("-");
				if(datos.length==3) {
					try {
						String nombre=datos[0].trim();
						String apellido=datos[1].trim();
						String dni=datos[2].trim();
						
						if(Persona.verificarDniInvalido(dni)) {
							Persona persona = new Persona(nombre, apellido, dni);
							personas.add(persona);
							}
							
						}catch (DniInvalido e) {
						e.getMessage();
					}
				}
				linea = bufferedReader.readLine();
			}
		bufferedReader.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	
		return personas;
	}
}

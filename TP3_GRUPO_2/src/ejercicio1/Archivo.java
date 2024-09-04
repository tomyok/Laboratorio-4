package ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {

	private String ruta;
	
	public boolean existe(){
		File archivo = new File(ruta);
		if(archivo.exists()) {
			return true;
		}
		return false;
	}
	
	public boolean CrearArchivo() {
		FileWriter escritura;
		try {
			escritura = new FileWriter(ruta, true);
			escritura.write("");
			escritura.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void Escribir(String frase) {
		try {
			FileWriter entrada = new FileWriter(ruta, true);
			BufferedWriter buffer = new BufferedWriter(entrada);
			buffer.write(frase);
			buffer.close();
			entrada.close();
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public void Leer() {
		FileReader entrada;
		try {
			entrada = new FileReader(ruta);
			BufferedReader buffer = new BufferedReader(entrada);
			
			String linea = "";
			while(linea != null) {
				System.out.println(linea);
				linea = buffer.readLine();
			}
			
			entrada.close();
			buffer.close();
		}
		catch (IOException e){
			System.out.println("No se encontro el archivo");
		}
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
}

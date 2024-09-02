package ejercicio1;

import java.io.File;
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
}

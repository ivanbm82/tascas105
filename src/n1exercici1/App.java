package n1exercici1;

import java.io.File;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		File archivos = new File(args[0]);
		String[] lista = archivos.list();
		if (lista != null) {
			Arrays.sort(lista);
			for(int i = 0; i < lista.length; i++){
				System.out.println(lista[i]);
			}	
		} else
			System.out.println("La ruta no existe");
	}
}

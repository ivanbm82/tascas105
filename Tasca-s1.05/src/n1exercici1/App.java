package n1exercici1;

import java.io.File;

public class App {

	public static void main(String[] navi) {
		// TODO Auto-generated method stub

		lista("/Users/navi/Desktop/");
	}

	public static void lista(String ubicacion) {

		File directorio = new File(ubicacion);

		if (directorio.exists()) {
			String[] archivosDirectorio = directorio.list();
			for (String file : archivosDirectorio) {

				System.out.println(file);
			}
		} else {
			System.out.println("El directorio no existe");
		}

	}

}

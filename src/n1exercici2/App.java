package n1exercici2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {

	public static void main(String[] arg) {
		// TODO Auto-generated method stub

		listaArbol(new File("C:\\Users\\formacio\\Desktop\\tascas105-main")); 
	}

	public static void listaArbol(File directorio) {
		

		File listaDirectorio[] = directorio.listFiles();

		if (listaDirectorio != null) {

			for (int i = 0; i < listaDirectorio.length; i++) {

				if (listaDirectorio[i].isDirectory()) {

					System.out.println(
							listaDirectorio[i].getName() + " - D - " + formato(listaDirectorio[i].lastModified()));
					listaArbol(listaDirectorio[i]);

				} else {
					System.out.println(
							listaDirectorio[i].getName() + " - F - " + formato(listaDirectorio[i].lastModified()));
				}
			}
		} else
			System.out.println("El directorio no existe");

	}

	public static String formato(long date) {

		return new SimpleDateFormat("dd-MM-yyyy").format(new Date(date));
	}

}
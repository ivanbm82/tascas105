package n1exercici2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		listarArbol(new File(args[0]));
	}

	public static void listarArbol(File archivos) {
		File[] listaDirectorio = archivos.listFiles();

		if (listaDirectorio != null) {
			Arrays.sort(listaDirectorio);

			for (File file : listaDirectorio)

				if (file.isFile()) {

					System.out.println(file.getName() + " - F - " + formato(file.lastModified()));

				} else if (file.isDirectory()) {
					System.out.println(file.getName() + " - D - " + formato(file.lastModified()));
					listarArbol(file);
				}

		} else {
			System.out.println("La ruta no es correcta");
		}

	}

	public static String formato(long date) {

		return new SimpleDateFormat("dd-MM-yyyy").format(new Date(date));
	}
}

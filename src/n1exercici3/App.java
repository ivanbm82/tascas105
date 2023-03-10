package n1exercici3;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		listaArbol(new File(args[0]));

	}

	public static void listaArbol(File archivos) {

		File[] listaDirectorios = archivos.listFiles();

		SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

		if (listaDirectorios != null) {
			Arrays.sort(listaDirectorios);
			for (File archivo : listaDirectorios)

				if (archivo.isFile()) {
					String archiescrito = archivo.getName() + " " + "F" + " " + fecha.format(archivo.lastModified());

					createFile(archiescrito);

				} else if (archivo.isDirectory()) {

					String archiescrito = archivo.getName() + " " + "D" + " " + fecha.format(archivo.lastModified());

					createFile(archiescrito);

					listaArbol(archivo);
				}

		} else {

			System.out.println("La ruta no es correcta");
		}
	}

	public static String formato(long fecha) {

		return new SimpleDateFormat("dd-MM-yyyy").format(new Date(fecha));
	}

	public static void createFile(String archiescrito) {

		try {
			File creacionArchivo = new File("listaDirectorios.txt");
			FileWriter fw = new FileWriter(creacionArchivo);
			fw.write(archiescrito + "\n");
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

package n1exercici4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class App {

	public static void main(String[] arg) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList<String> lista=new ArrayList<>();
		createFile(listaArbol(new File("C:\\Users\\formacio\\Desktop\\tascas105-main"),lista));
		leerFile("C:\\Users\\formacio\\Desktop\\tascas105-main\\listaDirectorios.txt");

	}

	public static ArrayList<String> listaArbol(File dirrectorio, ArrayList<String> lista) {

		File listaDirectorio[] = dirrectorio.listFiles();
		String informacionDirectorio;

		if (listaDirectorio != null) {

			for (int i = 0; i < listaDirectorio.length; i++) {

				if (listaDirectorio[i].isDirectory()) {

					informacionDirectorio = listaDirectorio[i].getName() + " - D - "
							+ formato(listaDirectorio[i].lastModified());
					lista.add(informacionDirectorio);
					listaArbol(listaDirectorio[i],lista);

				} else {
					informacionDirectorio = listaDirectorio[i].getName() + " - F - "
							+ formato(listaDirectorio[i].lastModified());
					lista.add(informacionDirectorio);

				}
			}
		} else {
			System.out.println("El directorio no existe");

		}
		return lista;

	}

	public static String formato(long fecha) {

		return new SimpleDateFormat("dd-MM-yyyy").format(new Date(fecha));
	}

	public static void createFile(ArrayList<String> lista) {

		File creacionArchivo = new File("C:\\Users\\formacio\\Desktop\\tascas105-main\\listaDirectorios.txt");
		try {
			FileWriter fw = new FileWriter(creacionArchivo);
			BufferedWriter bw = new BufferedWriter(fw);
			for (String string : lista) {
				bw.write(string + "\n");
			}
			bw.close();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void leerFile(String nombreArchivo) {

		try {
			File archivo = new File(nombreArchivo);

			Scanner input = new Scanner(archivo);

			while (input.hasNextLine()) {

				String data = input.nextLine();

				System.out.println(data);

			}

			input.close();

		} catch (FileNotFoundException e) {

			System.out.println("Error");

			e.printStackTrace();

		}

	}

}
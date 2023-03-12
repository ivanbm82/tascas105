package n1exercici5;

import java.io.*;

public class App {

	public static void main(String[] args) {

		Vehiculo coche = new Vehiculo("Seat", "Ibiza");
		
		serializeAnObject(coche);

		deserializeAnObject();

	}

	public static void serializeAnObject(Vehiculo coche) {

		try {

			ObjectOutputStream object = new ObjectOutputStream(new FileOutputStream("fichero.ser"));
			object.writeObject(coche);
			object.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void deserializeAnObject() {

		try {

			ObjectInputStream object = new ObjectInputStream(new FileInputStream("fichero.ser"));
			System.out.println(object.readObject());
			object.close();

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
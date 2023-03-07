package n1exercici5;

import java.io.*;

public class App {

	public static void main(String[] navi) {

		Vehiculo[] coche = new Vehiculo[2];
		coche[0] = new Vehiculo("Seat", "Ibiza");
		coche[1] = new Vehiculo("Peugeot", "206");

		serializeAnObject(coche);

		deserializeAnObject();

	}

	public static void serializeAnObject(Vehiculo[] coche) {

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
			Vehiculo[] vehiculoDes = (Vehiculo[]) object.readObject();
			object.close();

			for (Vehiculo coche : vehiculoDes) {

				System.out.println(coche);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
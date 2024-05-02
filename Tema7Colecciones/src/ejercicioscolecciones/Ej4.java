package ejercicioscolecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nombre = "";

		ArrayList<String> lista = new ArrayList<String>();

		while (lista.size() < 5) {
			System.out.println("Introduce el nombre");
			nombre = sc.nextLine();
			if (lista.contains(nombre)) {
				System.out.println("Ese nombre ya existe");
			} else {
				System.out.println("Nombre añadido");
				lista.add(nombre);
			}
		}
		System.out.println(lista);
		Collections.reverse(lista);
		System.out.println(lista);
		sc.close();
	}
}

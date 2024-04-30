package ejercicioscolecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ej1 {
	public static void main(String[] args) {

		ArrayList<Integer> array1 = new ArrayList<Integer>();
		for (int i = 1; i < 11; i++) {
			array1.add(i);
		}
		System.out.println(array1);
		
		Collections.shuffle(array1);
		
		System.out.println(array1);
	}
}
package ejercicioscolecciones;

import java.util.LinkedHashSet;
import java.util.Random;

public class Ej2 {
	public static void main(String[] args) {

		int i=0;
		Random r = new Random();
		
		LinkedHashSet<Integer> array = new LinkedHashSet<Integer>();
		
		 while(array.size()<10){
			array.add(r.nextInt(1,21));	
			i++;
		}
		
		
		System.out.println(array);
	}
}
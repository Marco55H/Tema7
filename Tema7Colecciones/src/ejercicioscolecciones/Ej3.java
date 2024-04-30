package ejercicioscolecciones;

import java.util.TreeMap;

public class Ej3 {
	public static void main(String[] args) {

		String texto = "en un agujero en el suelo, vivia un hobbit. " + "no un agujero humedo, sucio, repugnante, "
				+ "con restos de gusanos y olor a fango, " + "ni tampoco un agujero, seco, desnudo y arenoso, "
				+ "sin nada en que sentarse o que comer: " + "era un agujero-hobbit, y eso significa comodidad";

		TreeMap<Character, Integer> letras = new TreeMap<Character, Integer>();
		
		
		
		for(int i=0; i<texto.length(); i++) {
			char charAtTexto = texto.charAt(i);
			if (charAtTexto>='a' && charAtTexto<='z') {
				if (!letras.containsKey(charAtTexto)) {
					letras.put(charAtTexto,1);
				}else {
					letras.put(charAtTexto, letras.get(charAtTexto)+1);
				}
			}
		}
		System.out.println(letras);
	}
}
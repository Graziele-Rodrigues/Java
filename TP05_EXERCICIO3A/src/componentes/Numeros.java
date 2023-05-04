package componentes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Numeros {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		
		while (numeros.size()< 50) { 
		    int numero = new Random().nextInt(0, 100); 
		    numeros.add(numero); 
		 }
		
		//maior numero
		System.out.println("Maior numero: " + Collections.max(numeros));
		
		//frequencia menor numero
		System.out.println("O menor numero apareceu: " + Collections.frequency(numeros, Collections.min(numeros)) +  " vezes");
				
		//ordenando
		Collections.sort(numeros);
		System.out.println("Numeros ordenados: " + numeros);
	}
}

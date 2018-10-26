package es.js.semanal;

import java.util.Scanner;

public class Semanal3 {
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {


	
		int entero;
		do {
			System.out.println("Nº: ");
		    entero = entrada.nextInt();
		} while (entero < 0);
		int suma = 0;
		for (int i = 1; i < entero; i++) {
			if (entero%i==0) 
				suma += i;
		}
		if (suma > entero)
			System.out.println("Es abundante");
		else if (suma < entero)
			System.out.println("No es abundante");
		
		
		
		

		

	}

}

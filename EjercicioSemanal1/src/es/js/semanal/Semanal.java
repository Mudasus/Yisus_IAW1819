package es.js.semanal;

import java.util.Scanner;

public class Semanal {
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// (09/10/18) Se solicita leer un número entero positivo y determinar si es un número de 1,2,3 o 4 cifras.

		System.out.println("Entre un numero entero positivo: ");
		int num = entrada.nextInt();
		if (num > 0 ) {
			if (num > 0 && num<10 )
				System.out.println("Tiene 1 cifra");
			else if (num>=10 && num < 100)
				System.out.println("Tiene 2 cifras");
			else if (num>=100 && num < 1000)
				System.out.println("Tiene 3 cifras");
			else if (num>=1000 && num<10000)
				System.out.println("Tiene 4 cifras");
			else if (num >=10000)
				System.out.println("Es un numero demasiado grande");
		}
		else
			System.out.println("No es un numero correcto, no debe ser 0 ni un numero negativo");
	}

}

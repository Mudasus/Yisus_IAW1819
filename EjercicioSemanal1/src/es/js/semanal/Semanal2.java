package es.js.semanal;

import java.util.Scanner;

public class Semanal2 {
	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		//(09/10/18) Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
		//Si trabaja 40 horas o menos se le paga 16€ por hora 
		//Si trabaja más de 40 horas se le paga 16€ por cada una de las primeras 40 horas y 20€ por cada hora extra.

		System.out.println("¿Cuantas horas trabaja el obrero a la semana?: ");
		int hora = entrada.nextInt();
		int valor_a = 16;
		int valor_b = 20;
		int cobro;
		if (hora>0) {
			if (hora <= 40) {
				cobro = (hora*valor_a);
				System.out.println("El obrero por "+ hora + " horas trabajadas, cobraria " + cobro + " Euros");
			}
			else {
				cobro = (40*valor_a+(hora-40)*valor_b);
				System.out.println("El obrero por "+ hora + " horas trabajadas, cobraria " + cobro + " Euros");
			}	
		}
		else
			System.out.println("No ha trabajado");

	}

}

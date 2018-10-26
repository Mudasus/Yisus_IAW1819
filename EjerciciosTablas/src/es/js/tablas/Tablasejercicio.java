package es.js.tablas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tablasejercicio {
//3
//	private static int [] numeros;
//	private static int [] pares;
//	private static int [] impares;
//	private static int contPares=0;
//	private static int contImpar=0;
	
	//5
	private static int [] numeros1;
	
	
	
	
	
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		//Leer n números enteros, guardarlos en la tabla y mostrar la media de los positivos, media negativos y el número de ceros
//		System.out.println("Dame una cantidad");
//		int cantidad = entrada.nextInt();
//		
//		int numeros[] = new int [cantidad];
//		
//		double sumaP = 0, sumaN = 0, contP = 0, contN = 0, contC = 0;
//		for (int i = 0; i < cantidad; i++) {
//			
//			System.out.println("Nº "+ (i+1) + " :");
//			numeros[i] = entrada.nextInt();
//			if (numeros[i]<0) {
//				contN ++;
//				sumaN += numeros[i];
//			}	
//			else if (numeros[i]>0) {
//				contP++;
//				sumaP += numeros[i];
//			}
//			else
//				contC++;
//		}
//
//	System.out.println("La media de los positivos es: " + sumaP/contP + " La media de los negativos es: " + sumaN/contN + " Y la cantidad de ceros son: " + contC);
//		
	
	
	
	
	
	//Leer tabla de n números y guardar en otra tabla los pares y en otra tabla los impares

//		
//	int tamano;
//	do {
//		System.out.println("Nº de elementos: ");
//		tamano = entrada.nextInt();
//	} while (tamano<=0);
//	
//	
//	
//	numeros = new int [tamano];
//	pares = new int [tamano];
//	impares = new int [tamano];
//	
//	inicializarTablaNumeros();
//	
//	dividirParesImpares();
//	
//	mostrarResultado();
//	
	
	//Crear una tabla de n números y desplazarla una posición hacia abajo, es decir, 
	//el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. El último pasa a ser el primero

	
	
	int tamano;
	do {
		System.out.println("Nº de elementos: ");
		tamano = entrada.nextInt();
	} while (tamano<=0);
	
	
	numeros1 = new int [tamano];
	
	iniciar();
	
	mostrar();

	desplazar();
	
	mostrar();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	private static void desplazar() {
		// TODO Auto-generated method stub
		int aux = numeros1[numeros1.length - 1];
		
		for (int i = numeros1.length - 1; i > 0; i--) {
			numeros1[i] = numeros1[i-1];
		}
		numeros1[0] = aux;
	}
	private static void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(numeros1));
		
	}
	private static void iniciar() {
		// TODO Auto-generated method stub
		for (int i = 0; i < numeros1.length; i++) {
		numeros1[i] = new Random().nextInt(50) + 1;
	}
		
		
	}
//	private static void mostrarResultado() {
//		// TODO Auto-generated method stub
//		System.out.println( Arrays.toString(numeros));
//		
//
//		String cadPares = "", cadImpares = "";
//		
//		for (int i = 0; i < numeros.length; i++) {
//			if (i < contPares) {
//				cadPares += pares[i] + " ";
//			}
//			if (i < contImpar)
//				cadImpares += impares[i] + " "; 
//		}
//		System.out.println(cadPares);
//		System.out.println(cadImpares);
//		
////		for (int i = 0; i < contPares; i++) {
////			System.out.print(pares[i] + " ");
////		}		
////		System.out.println();
////		for (int i = 0; i < contImpar; i++) {
////			System.out.print(impares[i] + " ");
////		}
////		
//	}
//	private static void dividirParesImpares() {
//		// TODO Auto-generated method stub
//		for (int i = 0; i < numeros.length; i++) {
//			if (numeros[i]%2==0) {
//				pares[contPares] = numeros[i];
//				contPares ++;
//			}
//			else {
//				impares[contImpar] = numeros[i];
//				contImpar ++;
//			}
//		}
//	}
//	private static void inicializarTablaNumeros() {
//		// TODO Auto-generated method stub
//		for (int i = 0; i < numeros.length; i++) {
//			numeros[i] = new Random().nextInt(50) + 1;
//		}
//		
//	}
}

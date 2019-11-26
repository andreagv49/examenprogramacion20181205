package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio5 {

	/* 
	 * 2,5 puntos
	 * 
	 * Escribe en el método 'main' un programa que obtenga el desglose en billetes
	 * y monedas de una cantidad exacta de euros que el usuario introducirá por teclado.
	 * Hay billetes de 500, 200, 100, 50, 20, 10 y 5 euros y monedas de 1 y 2 euros.
	 * Por ejemplo, si deseamos conocer el desglose de 434 euros, el programa mostrará
	 * por pantalla el siguiente resultado:
	 * 
	 * 		2 billetes de 200 euros.
	 * 		1 billete de 20 euros.
	 * 		1 billete de 10 euros.
	 * 		2 monedas de 2 euros.
	 * 
	 * Una vez ejecutado el programa, el usuario podrá realizar tantos desgloses como
	 * desee hasta que decida finalizar su ejecución. 
	 * El programa comprobará que la cantidad introducida sea una cantidad positiva
	 * mayor que 0. En caso contrario mostrará un mensaje de error y volverá a pedirla.
	 */
	
	public static void main(String[] args) {
	
	int cantidad;
	Scanner input = new Scanner(System.in);
	System.out.print("Introduce la cantidad de euros: ");
	cantidad =input.nextInt();
	while (cantidad > 1){
		
		if(cantidad >=500) {
		System.out.printf("%d billetes de 500\n", cantidad / 500);
		cantidad = cantidad % 500;
		}
		
		if(cantidad >=200) {
			System.out.printf("%d billetes de 200\n", cantidad / 200);
			cantidad = cantidad % 200;
			}

		if(cantidad >=100) {
			System.out.printf("%d billetes de 100\n", cantidad / 100);
			cantidad = cantidad % 100;
			}

		if(cantidad >=50) {
			System.out.printf("%d billetes de 50\n", cantidad / 50);
			cantidad = cantidad % 50;
			}

		if(cantidad >=20) {
			System.out.printf("%d billetes de 20\n", cantidad / 20);
			cantidad = cantidad % 20;
			}
	
	
		if(cantidad >=10) {
			System.out.printf("%d billetes de 10\n", cantidad / 10);
			cantidad = cantidad % 10;
			}
	
		if(cantidad >=5) {
			System.out.printf("%d billetes de 5\n", cantidad / 5);
			cantidad = cantidad % 5;
			}
	
		if(cantidad >=2) {
			System.out.printf("%d monedas de 2\n", cantidad / 2);
			cantidad = cantidad % 2;
			}
	
		} // acabo el while
	
		if (cantidad == 1) {
		
		System.out.println("1 moneda de 1 euro");

		}
	}
}

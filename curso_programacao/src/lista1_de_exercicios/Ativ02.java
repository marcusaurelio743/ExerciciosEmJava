/*Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea deste c�rculo com quatro 
casas decimais conforme exemplos.
F�rmula da �rea: area = pi . raio2
Considere o valor de pi = 3.14159*/
package lista1_de_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ativ02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		double raio,area;
		
		System.out.println("Informe o valor do raio");
		raio = sc.nextDouble();
		
		area = pi*(raio * raio);
		
		System.out.printf("O valor da Area �: %.2f",area);
		
		sc.close();

	}

}

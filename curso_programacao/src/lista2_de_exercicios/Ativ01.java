/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/
package lista2_de_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ativ01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int valor;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro!!!");
		valor = sc.nextInt();
		
		if(valor>=0) {
			System.out.printf("O numero %d é positivo!! ",valor);
		}else {
			System.out.printf("O numero %d é negativo!!",valor);
		}
		
		sc.close();
	}

}

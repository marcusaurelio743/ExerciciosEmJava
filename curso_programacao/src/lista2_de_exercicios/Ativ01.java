/*Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.*/
package lista2_de_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ativ01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int valor;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro!!!");
		valor = sc.nextInt();
		
		if(valor>=0) {
			System.out.printf("O numero %d � positivo!! ",valor);
		}else {
			System.out.printf("O numero %d � negativo!!",valor);
		}
		
		sc.close();
	}

}

/*Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em 
ordem crescente ou decrescente.*/
package lista2_de_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ativ03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o Valor de A");
		a = sc.nextInt();
		System.out.println("Informe o Valor de B");
		b = sc.nextInt();
		
		if(a % b == 0 || b % a ==0 ) {
			System.out.println("s�o multiplos");
		}else {
			System.out.println("N�o s�o multiplos");
		}
		
		sc.close();

	}

}

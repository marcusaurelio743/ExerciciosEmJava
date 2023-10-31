/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
mensagem explicativa, conforme exemplos.*/
package lista1_de_exercicios;

import java.util.Scanner;

public class Ativ01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma,A,B;
		
		System.out.println("Informe o valor de A");
		A = sc.nextInt();
		
		System.out.println("Informe O Valor de B");
		B = sc.nextInt();
		
		soma = A + B;
		
		System.out.printf(" a soma de %d e %d é igual a %d",A,B,soma);
		
		sc.close();
	}

}

/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
package lista1_de_exercicios;

import java.util.Scanner;

public class Ativ03 {

	public static void main(String[] args) {
		int a,b,c,d;
		float diferenca = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe os Valores de A B C D");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		diferenca = ((a*b) - (c*d));
		System.out.printf("resultado é %.2f",diferenca);
		
		sc.close();
		

	}

}

/*Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por 
hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas 
decimais*/
package lista1_de_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ativ04 {

	public static void main(String[] args) {
		int numero,horas;
		Locale.setDefault(Locale.US);
		double ValorHora,salario;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o numero do funcionario");
		numero = sc.nextInt();
		System.out.println("Informe o total de horas");
		horas = sc.nextInt();
		System.out.println("Informe o valor da Hora");
		ValorHora = sc.nextDouble();
		
		salario = ValorHora*horas;
		
		System.out.println("Numero do funcionario: "+numero);
		System.out.printf("Salario U$ %.2f",salario);
		
		sc.close();

	}

}

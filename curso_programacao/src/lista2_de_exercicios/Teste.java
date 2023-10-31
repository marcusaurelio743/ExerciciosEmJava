package lista2_de_exercicios;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		String nome,endereco;
		Scanner sc = new Scanner(System.in);
		int idade;
		System.out.println("Informe sua idade");
		idade = sc.nextInt();
		sc.nextLine();
		System.out.println("Infome seu nome");
		nome = sc.nextLine();
		System.out.println("informe seu endereco");
		endereco = sc.nextLine();
		
		System.out.printf("dados informados: nome %s, endereco %s, idade %d",nome,endereco,idade);
	}

}

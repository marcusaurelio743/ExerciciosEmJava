package lista2_de_exercicios;
/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.*/
import java.util.Locale;
import java.util.Scanner;

public class Ativ02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int valor;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor inteiro!!");
		valor = sc.nextInt();
		
		if(valor % 2 == 0) {
			System.out.printf("O numero %d é par",valor);
		}else {
			System.out.printf("O numero %d é impar",valor);
		}
		
		sc.close();

	}

}

package lista2_de_exercicios;
/*Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.*/
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
			System.out.printf("O numero %d � par",valor);
		}else {
			System.out.printf("O numero %d � impar",valor);
		}
		
		sc.close();

	}

}

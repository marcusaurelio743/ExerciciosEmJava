package lista2_de_exercicios;
/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
seguir, calcule e mostre o valor da conta a pagar.*/
import java.util.Locale;
import java.util.Scanner;

public class Ativ05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int item,quantidade;
		double total = 0;
		
		System.out.println("Informe o Valor do item!!");
		item = sc.nextInt();
		System.out.println("Informe a quantidade");
		quantidade = sc.nextInt();
		
		if(item == 1) {
			total = 4.00 * quantidade;
		}else if (item == 2) {
			total = 4.50 * quantidade;
		}else if (item == 3) {
			total = 5.00 * quantidade;
		}else if (item == 4) {
			total = 2.00 * quantidade;
		}else if (item == 5) {
			total = 1.50 * quantidade;
		}
		
		
		
		System.out.printf("Total a Pagar é %.2f R$",total);
		
		sc.close();

	}

}

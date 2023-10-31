/*leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/
package lista2_de_exercicios;

import java.util.Scanner;

public class Ativ04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horaInicial,horaFinal,duracao;
		
		System.out.println("Informe a Hora Inicial");
		horaInicial = sc.nextInt();
		System.out.println("Informe a Hora Final");
		horaFinal = sc.nextInt();
		
		if(horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}else {
			duracao = 24 - horaInicial+horaFinal;
		}
		
		System.out.printf("O Jogo durou %d Horas",duracao);
		sc.close();
	}

}

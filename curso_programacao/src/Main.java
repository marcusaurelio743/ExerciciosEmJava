import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String nome = "Maria";
		int idade = 31;
		double renda = 45.000;
	
		int y = 32;
		double x = 10.278567;
		
		System.out.println(y);
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",x);
		
		System.out.println("Resultado "+x+" metros");
		System.out.printf("Resultado %.2f metros",x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais",nome,idade,renda);
	
	}

}

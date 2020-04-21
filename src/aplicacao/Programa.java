package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import servicos.ServicoJuros;
import servicos.ServicoJurosBrasil;
import servicos.ServicoJurosEUA;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor: ");
		Double valor = sc.nextDouble();
		System.out.print("Meses: ");
		Integer meses = sc.nextInt();
		
		ServicoJuros sjb = new ServicoJurosBrasil(2.0);
		ServicoJuros sje = new ServicoJurosEUA(1.0);
		
		System.out.println();
		System.out.println("Juros Brasil:");
		System.out.println("Pagamento após " + meses + " meses:");
		System.out.printf("%.2f\n", sjb.pagamento(valor, meses));
		
		System.out.println();		
		System.out.println("-------------------------");
		
		System.out.println();
		System.out.println("Juros EUA");
		System.out.println("Pagamento após " + meses + " meses:");
		System.out.printf("%.2f", sje.pagamento(valor, meses));
		
		
		sc.close();
	}

}

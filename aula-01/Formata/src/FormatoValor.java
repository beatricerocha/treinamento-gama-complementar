import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class FormatoValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dval;
				Scanner teclado = new Scanner(System.in);
				System.out.println("Entre com o valor desejado");
				dval = teclado.nextDouble();
				System.out.println("Valor da Variavel "+dval);
				String format="0.00";
				NumberFormat formatter = new DecimalFormat(format);
				String newDval = formatter.format(dval);
				System.out.println("Novo valor formatado "+newDval);
				
				
				
	}
}

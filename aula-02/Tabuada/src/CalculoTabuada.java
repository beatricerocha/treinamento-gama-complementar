import java.util.Scanner;

public class CalculoTabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valor_tabuada;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com o valor da tabuada");
		valor_tabuada = teclado.nextInt();
		/*for (int contador=1; contador<=10; contador++) {
			System.out.println(contador+"x"+valor_tabuada+" = "+(contador*valor_tabuada));
		}*/
		
		int contador=1;
		do {
			System.out.println(contador+"x"+valor_tabuada+" = "+(contador*valor_tabuada));
			contador++;
		}
		while(contador<=10);
	}

}

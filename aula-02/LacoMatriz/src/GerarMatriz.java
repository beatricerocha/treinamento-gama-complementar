import java.util.Scanner;

public class GerarMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Criando a vari�vel da nossa matriz
		//String[] nomefuncionario = {"Ana","F�bio","Alexandre","Andr�","Ant�nio","Bia"};
		String[] nomefuncionario = new String[5];
		
		//Criando o nosso la�o de repeti��o For
		for (int contador=0; contador<=4; contador++) {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Entre com o funcion�rio "+contador+ " �: ");
			nomefuncionario[contador]=teclado.next();
			
			//System.out.println(contador+" - "+nomefuncionario[contador]);
			
		}
	}

}

import java.util.Scanner;

public class ExemploCaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int funcoes;
		Scanner teclado = new Scanner(System.in);
		System.out.println("======================================");
		System.out.println("Op��es aritim�tica apresentadas  ");
		System.out.println("1 - Adi��o");
		System.out.println("2 - Subtra��o");
		System.out.println("3 - Divis�o");
		System.out.println("4 - Multiplica��o");
		System.out.println("5 - Sair");
		System.out.println("======================================");
		System.out.println("Escolha e op��o aritim�tica desejada:  ");
		funcoes =teclado.nextInt();
		
		// criando os tipos de casos
		switch(funcoes) {
		case 1:
			System.out.println("Adi��o");
			break;
		case 2:
			System.out.println("Subtra��o");
			break;
		case 3:
			System.out.println("Divis�o");
			break;
		case 4:
			System.out.println("Multiplica��o");
			break;
		default:
			System.out.println("Sair");
		
		}
	}

}

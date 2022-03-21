import java.util.Scanner;

public class ExemploCaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int funcoes;
		Scanner teclado = new Scanner(System.in);
		System.out.println("======================================");
		System.out.println("Opções aritimética apresentadas  ");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Divisão");
		System.out.println("4 - Multiplicação");
		System.out.println("5 - Sair");
		System.out.println("======================================");
		System.out.println("Escolha e opção aritimética desejada:  ");
		funcoes =teclado.nextInt();
		
		// criando os tipos de casos
		switch(funcoes) {
		case 1:
			System.out.println("Adição");
			break;
		case 2:
			System.out.println("Subtração");
			break;
		case 3:
			System.out.println("Divisão");
			break;
		case 4:
			System.out.println("Multiplicação");
			break;
		default:
			System.out.println("Sair");
		
		}
	}

}

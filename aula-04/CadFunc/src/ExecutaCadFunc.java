import java.util.Scanner;

public class ExecutaCadFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		String email;
		int idade;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com o Funcionario");
		nome=teclado.nextLine();
		System.out.println("Entre com o Email");
		email=teclado.nextLine();
		System.out.println("Entre com a Idade");
		idade=teclado.nextInt();
		
		// Executando a chamada da classe e fazendo a passagem de parâmetro ao seu método
		ProcParametrosRecebido executar = new ProcParametrosRecebido();
		executar.Mensagem(nome, email, idade);
	
		// Executando a chamada da classe com o método para saber o ano de nascimento
		ProcParametrosRecebido processa = new ProcParametrosRecebido();
		processa.AnoNasc(nome, idade);
	}

}

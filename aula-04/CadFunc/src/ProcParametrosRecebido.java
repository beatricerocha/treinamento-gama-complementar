
public class ProcParametrosRecebido {

	// criando um método dentro desta classe
	public void Mensagem (String nome, String email, int idade) {
		System.out.println("o nome do funcionário é "+nome+", contem a idade, "+idade+ " e o email fornecido é "+email );
	}
	
	
	public void AnoNasc(String nome, int idade) {
		System.out.println("O nome do funcionário é "+nome+" e ele nasceu no ano de "+(idade-2022));
	}
}

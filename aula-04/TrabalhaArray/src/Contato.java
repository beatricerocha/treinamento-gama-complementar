
public class Contato {

	// Declaração das variáveis privadas
	private String nome;
	private String email;
	
	// criação do método para leitura das variáveis
	public Contato(String nome, String email) {
		this.nome=nome;
		this.email=email;
	}

	// inserindo getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	


	
}

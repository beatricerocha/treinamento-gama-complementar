import java.util.ArrayList;

public class ExecutaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Contato> contatos = new ArrayList();
		
		/*ArrayList<String> contatos = new ArrayList();
		
		contatos.add("Ricardo");
		contatos.add("Pedro");
		
		for (String nome: contatos) {
			System.out.println(nome);
		}*/
		
		Contato contato = new Contato("Ricardo Alexandre","ricardo@gama.com.br");
		Contato contato1 = new Contato("Marcos Alexandre","marcos@gama.com.br");
		Contato contato2 = new Contato("Luciana","luciada@gama.com.br");
		
		contatos.add(contato);
		contatos.add(contato1);
		contatos.add(contato2);
		
		for(Contato c: contatos) {
			//System.out.println(c);
			//System.out.println(c.getNome()+c.getEmail());
				
		}
		System.out.println("Total de itens "+contatos.size());
	}

}

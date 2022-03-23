import java.util.ArrayList;

public class ExecutaLista {

	public static void main(String[] args) {

		/* Montando um Array List Simples
		
		ArrayList <String>contatos = new ArrayList();
		
		contatos.add("Ricardo");
		contatos.add("Pedro");
		contatos.add("Marcos");
		contatos.add("Ana");
		contatos.add("Fabio");
		contatos.add("Rosana");
		contatos.add("Luan");
		
		for(String nome:contatos) {
			System.out.println(nome);
		} */
		
		ArrayList<Contato> contatos = new ArrayList();
		
		Contato contato1 = new Contato ("Ricardo Alexandre","ricardo@gamaacademy.com");
		Contato contato2 = new Contato ("Marcos Alexandre","marcos@gamaacademy.com");
		Contato contato3 = new Contato ("João","joão@gamaacademy.com");
		Contato contato4 = new Contato ("Nicole","nicole@gamaacademy.com");
		Contato contato5 = new Contato ("Alexandre","alexandre@gamaacademy.com");
		Contato contato6 = new Contato ("Cristina","cristina@gamaacademy.com");
		
		contatos.add(contato1);
		contatos.add(contato2);
		contatos.add(contato3);
		contatos.add(contato4);
		contatos.add(contato5);
		contatos.add(contato6);
		
		// visualizando o conteúdo do nosso ArrayList

		for(Contato c:contatos) {
			//System.out.println(c);
			System.out.println(c.getNome()+"-"+c.getEmail());
		}
		
		// Apagando registros
		contatos.remove(contato3);
		
		// Mostramos a quantidade de registros dentro do nosso list
		System.out.println("Total de itens: "+contatos.size());
		
		// Eu mostro o conteúdo do registro que está dentro do array
		System.out.println(contatos.get(2).getNome());
		
		// Aqui eu verifico se existe um registro nesta posição con contato
		System.out.println(contatos.contains(contato3));
		
		

	}
}

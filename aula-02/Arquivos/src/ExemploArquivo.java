import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExemploArquivo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String[] nomes= {"Marcos","Pedro","Rog�rio","Regina"};
		
		FileWriter arquivo = new FileWriter("c:\\funcionarios.txt");
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		
		gravarArquivo.printf("Registros dos Funcion�rios%n");
		gravarArquivo.printf("Nome Funcion�rios"+"%n");
		
		for(int contador=0; contador<4; contador++) {
			gravarArquivo.printf(nomes[contador]+"%n");
		}
		arquivo.close();
		System.out.println("O arquivo est� sendo gravado na unidade c:\funcionarios.txt");
	}

}
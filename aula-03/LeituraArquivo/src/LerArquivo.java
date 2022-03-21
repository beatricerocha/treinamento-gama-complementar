import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class LerArquivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mostra="";
		String nomeArq="c:\\funcionarios.txt"; 
		String linha="";
		File arq = new File(nomeArq);
		
		// Uma an�lise para verificar se o arquivo existe
		if(arq.exists()) {
			mostra="Arquivo - "+arq+",aberto com sucesso";
			// System.out.println(mostra);
			//System.out.println("Arquivo - "+nomeArq+", aberto com sucesso");
			mostra="Tamanho do Arquivo - "+Long.toString(arq.length())+" Bytes \n";
			// System.out.println(mostra);
			
		// Processo de tentativa de leitura das informa��es contidas no arquivo
			try {
			FileReader reader = new FileReader(nomeArq);
			// Ler todo o arquivo e armazenar no Buffer de mem�ria 
			BufferedReader leitor = new BufferedReader(reader);
			while(true) {
				linha=leitor.readLine();
				System.out.println(linha);
			if(linha==null)
				break;
			mostra+=linha+"\n";
			}
			}
			catch(Exception erro) {}
			//System.out.println("conte�do existente");
			JOptionPane.showMessageDialog(null, mostra, "Arquivo...",1);
		}
		else
			//System.out.println("Arquivo Inesistente");
			JOptionPane.showMessageDialog(null, "Arquivo Inexistente","Erro",0);
			}
		
	}




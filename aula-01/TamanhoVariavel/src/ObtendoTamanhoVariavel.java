import java.util.Scanner;

public class ObtendoTamanhoVariavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String senha;
		String senha_valida="gama@2022";
		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com a senha");
		senha = teclado.next();
		// System.out.println("A quantidade de digitos da senha ? "+senha.length());
		if(senha.length()<=4) {
			System.out.println("A senha ? inv?lida, pois deve conter no m?nimo 6 digitos");
			
		}else if(senha.equals(senha_valida)) {
			System.out.println("A senha est? correta");
		}else {
			System.out.println("A senha digitada ? inv?lida");
		}
	}

}

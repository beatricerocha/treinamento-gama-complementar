import java.util.Scanner;

public class ExecutaCalculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int opcao;
        double num1, num2, total;

        do{
            System.out.println("====================");
            System.out.println("OP??ES DO MENU");
            System.out.println("====================");
            System.out.println("1 - ADI??O");
            System.out.println("2 - SUBTRA??O");
            System.out.println("3 - MULTIPLICA??O");
            System.out.println("4 - DIVIS?O");
            System.out.println("5 - SAIR");
            opcao = sc.nextInt();

            if(opcao==5) {
            	
            }else {
            	
            }
            
            switch(opcao) {
                case 1:
                    System.out.println("Digite o primeiro n?mero: ");
                    num1 = sc.nextDouble();
                    System.out.println("Digite o segundo n?mero: ");
                    num2 = sc.nextDouble();
                    total = num1 + num2;
                    System.out.println("O Resultado de "+num1+" + "+num2+" = "+total);
                    opcao=6;
                    break;

               
                case 5:
                    System.out.println("Sair");
                    break;
                    
                default:
                	System.out.println("Op??o escolhida inv?lida");
            }
        }
        while (opcao < 5 || opcao == 0 || opcao > 5);

	}
}

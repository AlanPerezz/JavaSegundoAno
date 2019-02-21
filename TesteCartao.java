import java.util.Scanner;

public class TesteCartao{
	public static void main(String args[]){
		int numeroCartaoEscolhido;
		int numeroOperacao;
		int numeroMaquinaEscolhida;
		float valorEscolhido;
		
		Cartao c1 = new Cartao();
		Cartao c2 = new Cartao();
		Cartao c3 = new Cartao();
		Cartao cartaoEscolhido = null;
		
		MaquinaCartao m1 = new MaquinaCartao();
		MaquinaCartao m2 = new MaquinaCartao();
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("CARTAO 1\n");
		System.out.printf("NOME DO TITULAR: ");
		c1.titular = s.nextLine();
		System.out.printf("============\n\n");

		System.out.printf("CARTAO 2\n");
		System.out.printf("NOME DO TITULAR: ");
		c2.titular = s.nextLine();
		System.out.printf("============\n\n");
		
		System.out.printf("CARTAO 3\n");
		System.out.printf("NOME DO TITULAR: ");
		c3.titular = s.nextLine();
		System.out.printf("============\n\n");
		
		System.out.printf("ESCOLHA O CARTAO\n");
		System.out.printf("(1) TITULAR: %s\n", c1.titular);
		System.out.printf("(2) TITULAR: %s\n", c2.titular);
		System.out.printf("(3) TITULAR: %s\n", c3.titular);
		System.out.printf("(4) SAIR\n");
		System.out.printf("SELECIONE UMA OPCAO: ");
		
		numeroCartaoEscolhido = s.nextInt();
		s.nextLine();
		
		switch (numeroCartaoEscolhido) {
			case 1:
				cartaoEscolhido = c1;
				break;
			case 2:
				cartaoEscolhido = c2;
				break;
			case 3:
				cartaoEscolhido = c3;
				break;
		}
		 
		System.out.printf("ESCOLHAR A OPERACAO\n");
		System.out.printf("(1) COLOCAR SALDO\n");
		System.out.printf("(2) PASSAR\n");
		
		numeroOperacao = s.nextInt();
		s.nextLine();
		
		switch (numeroOperacao) {
			case 1:
			System.out.printf("QUAL VALOR: ");
			
			valorEscolhido = s.nextFloat();
		    s.nextLine();
		    
		    if (cartaoEscolhido != null) {
				cartaoEscolhido.creditar(valorEscolhido);
			} else {
				System.out.printf("NENHUM CARTAO ESCOLHIDO");
			}
			
			break;
		}
		
		System.out.printf("Cartao do %s, saldo: %.2f\n" , c1.titular, c1.saldo);
		System.out.printf("Cartao do %s, saldo: %.2f\n" , c2.titular, c2.saldo);
		System.out.printf("Cartao do %s, saldo: %.2f\n" , c3.titular, c3.saldo);		
	}
}

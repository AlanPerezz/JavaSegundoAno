public class TesteCartao{
	public static void main(String args[]){
		Cartao c1 = new Cartao ();
		MaquinaCartao m1 = new MaquinaCartao();
		
		c1.titular = "Joao";
		
		System.out.printf("Cartao do %s, saldo: %.2f\n" , c1.titular, c1.saldo);
		System.out.printf("Valor reecbido:%.2f\n", m1.valorRecebido);
		
		c1.creditar(10);

        System.out.printf("Cartao do %s, saldo: %.2f\n" , c1.titular, c1.saldo);
		System.out.printf("Valor reecbido:%.2f\n", m1.valorRecebido);
		
		m1.passar(c1, 8);
		
		System.out.printf("Cartao do %s, saldo: %.2f\n" , c1.titular, c1.saldo);
		System.out.printf("Valor reecbido:%.2f\n", m1.valorRecebido);
		
        m1.passar(c1, 8);
        
        System.out.printf("Cartao do %s, saldo: %.2f\n" , c1.titular, c1.saldo);
		System.out.printf("Valor reecbido:%.2f\n", m1.valorRecebido);
	}
}

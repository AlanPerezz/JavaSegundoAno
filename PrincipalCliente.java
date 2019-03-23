public class PrincipalCliente {
	public static void main(String args[]) {
		Cliente c1 = new Cliente("Leonardo");
		Cliente c2 = new Cliente("Leonardo", "123.456.789-44");
		Cliente c3 = new Cliente("Leonardo", "123.456.789-44", "22.2334.322-3");
		System.out.printf("NOME: %s - CPF: %s - RG: %s\n", c1.getNome(), c1.getCpf(), c1.getRg());
		System.out.printf("NOME: %s - CPF: %s - RG: %s\n", c2.getNome(), c2.getCpf(), c2.getRg());
		System.out.printf("NOME: %s - CPF: %s - RG: %s\n", c3.getNome(), c3.getCpf(), c3.getRg());
		System.out.printf("%d\n", Cliente.getNumero());
	}
}

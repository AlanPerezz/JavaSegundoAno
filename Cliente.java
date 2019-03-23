public class Cliente {
	private String nome;
	private String cpf;
	private String rg;
	private String endereco;
	
	private static int numero;
	
	public static int getNumero() {
		return numero;
	}
	
	public Cliente(String n) {
		nome = n;
		Cliente.numero++;
	}
	
	public Cliente(String n, String c) {
		this(n);
		cpf = c;
	}
	
	public Cliente(String n, String c, String r) {
		this(n, c);
		rg = r;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}

public class Pessoa{
	private String nome;
	private int idade;
	private String cpf;
	private String rg;
	private String endereco;

	public void setNome(String n){nome = n;}
	public void setIdade(int i){idade = i;}
	public void setCpf(String c){cpf = c;}
	public void setRg(String r){rg = r;}
	public void setEndereco(String end){endereco = end;}
	
	public String getNome(){return nome;}
	public int    getIdade(){return idade;}
	public String getCPF(){return cpf;}
	public String getRG(){return rg;}
	public String getEnd(){return endereco;}
}

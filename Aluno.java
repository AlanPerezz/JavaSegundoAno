public class Aluno extends Pessoa{
	private String nome;
	private int	idade;

	private String ra;
	private String dataMatricula;	


    public void setRa(String r) {
 		 ra = r;
    }
    public void setDataMatricula(String d) {
		 dataMatricula = d;			
    }
    

	public String getRa() {
		 return ra;
	}
	public String getDataMatricula() {
		 return dataMatricula;
	}
}

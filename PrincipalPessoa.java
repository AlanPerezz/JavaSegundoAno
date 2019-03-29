public class PrincipalPessoa{
	
	public static void main(String args[]){
		
		Aluno a = new Aluno();
		
		a.setNome("Joao");
		a.setIdade(20);
		a.setCpf("233.233.233.22");
		a.setRg("13.131.131.31");
		a.setEndereco("Rua X"); 	
		a.setRa("578886");
		a.setDataMatricula("01/01/2018");
		
		Professor p = new Professor();
		p.setNome("Alan");
		p.setIdade(35);
		p.setCpf("545.445.545.54");
		p.setRg("33.333.333-33");
		p.setEndereco("Rua Y");
		p.setTitulacao("Dr.");
		p.setAreaAtuacao("Segurança");
 
  


     System.out.printf("Aluno %s, %d anos, %s, %s, %s, %s, %s\n",a.getNome(),a.getIdade(),a.getCPF(),a.getRG(),a.getEnd(),a.getRa(),a.getDataMatricula());
     
     System.out.printf("Professor %s, %d anos, %s, %s, %s, %s, %s\n",p.getNome(),p.getIdade(),p.getCPF(),p.getRG(),p.getEnd(),p.getTitulacao(),p.getAreaAtuacao());
  }

}

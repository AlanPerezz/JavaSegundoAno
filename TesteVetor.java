 public class TesteVetor {
	public static void main(String args[]){
                          
  int vet[] = new int [30];
  
  for(int i=0;i<vet.length;i++){	  
	  vet[i]=vet.length - i;
	  
     }
     
     for(int i=vet.length -1;i>=0;i--){
		System.out.printf("vet[%d] : %d\n", i , vet[i]); 
	  }
	 for(int aux:vet){
		 
		 System.out.printf("%d ",aux);
		 
		 
	 }
	 	 
		 
		 
	   }
	 }

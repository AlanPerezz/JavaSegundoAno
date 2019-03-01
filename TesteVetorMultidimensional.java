public class TesteVetorMultidimensional {
	public static void main(String args[]){
		
      int m[][] = new int [3][];
      
      m[0]= new int[5];
      m[1]= new int[3];
      m[2]= new int[6];
      
      for(int i=0;i<m.length;i++){
        for(int j=0;j<m[i].length;j++){ 
      
              System.out.printf("%d ",m[i][j]);
              
          }           
          System.out.printf("\n");
         
        }
       }     
      }


public class Main {    
    public static void main(String[] args) {        
                
        int A[]= new int [] {10, 20, 30, 40, 50};     
         
        int B[] = new int[A.length];    
       
        for (int i = 0; i < A.length; i++) {     
            B[i] = A[i];     
        }      

        System.out.println("Elements of array A: ");    
        for (int i = 0; i < A.length; i++) {     
           System.out.print(A[i] + " ");    
        }     
            
        System.out.println();    
      
        System.out.println("Elements of array B are following");    
        for (int i = 0; i < B.length; i++) {     
           System.out.print(B[i] + " ");    
        }     
    }    
}    

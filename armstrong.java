
import java.util.Scanner;

public class HelloWorld{
        
    // write Logics    
     // Print all armstrong numbers for a given range  
     public static int[] printArmstrongs(int l){
           
           int[] res = new int[l];
           int k = 0;
           
           for(int i=1; i<=l; i++){
                
               int n = i;
               int m = n;
               int sum = 0;
                
                while(n>0){
                    
                    int r = n%10;
                    int c = r*r*r;
                    
                    // sum = sum + c; 
                    sum += c;
                    
                    // n = n/10;
                    n /= 10;
                }
                
                if(m == sum){
                    res[k] = m;
                    k++;
                }
                
                    // System.out.print(m + " ");
           }
           
           res[k] = -1;
           
           return res;
     }
     
    
    
    
    
    
    
    
    
     
     
     
     
     
     
    //Driver Function
    // Input and Output
     public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
     
         int num = sc.nextInt();
         
         int[] ans = printArmstrongs(num);
         
         
         for(int i=0; ans[i] != -1; i++){
             
             System.out.print(ans[i] + " ");
             
         }
         
     }
        
}














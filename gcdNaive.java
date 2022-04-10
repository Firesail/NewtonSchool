

public class HelloWorld{

     public static void main(String []args){
        
        int x = 12, y = 6;
        
        int gcd = 1;
        int small;
        
        if(x < y)
            small = x;
        else
            small = y;
        
        for(int i = 1; i<=small; i++){
            
            if(x%i == 0 && y%i == 0)
                gcd = i;
                
        }
        
        
        System.out.println(gcd);
        
     }
     
}



import java.util.Scanner;

// Addition of 2 Matrix
public class HelloWorld{

     public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        
        int r, c;
        System.out.println("Enter row limit: ");
        r = sc.nextInt();
        
        System.out.println("Enter column limit: ");
        c = sc.nextInt();
        
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int sum[][] = new int[r][c];
        
        System.out.println("Enter " + r*c + " values for Matrix 1: ");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                a[i][j] = sc.nextInt();
                
        System.out.println("Enter " + r*c + " values for Matrix 2: ");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                b[i][j] = sc.nextInt();
                
                
        System.out.println("Matrix 1 is: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                System.out.print(a[i][j] + " ");
            
            System.out.println();
        }
        
        System.out.println("Matrix 2 is: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                System.out.print(b[i][j] + " ");
            
            System.out.println();
        }
        
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                sum[i][j] = a[i][j] + b[i][j];
        
        
        
        System.out.println("Sum of Matrix 1 & 2 is: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                System.out.print(sum[i][j] + " ");
            
            System.out.println();
        }
        
     }
     
}


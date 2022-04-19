import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] a = new int[n][m];

        System.out.print("Enter " + n*m + " values: ");
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Matrix is: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }

}

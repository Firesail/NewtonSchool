import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        // Your code here
		Scanner sc = new Scanner(System.in);
		int i, j, n;

		n = sc.nextInt();

		int[][] a = new int[n][n];

		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				a[i][j] = sc.nextInt();

		//90
		for(j=0; j<n; j++){
			for(i=n-1; i>=0; i--)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}

		System.out.println();

		//180
		for(i=n-1;i>=0;i--){
			for(j=n-1;j>=0;j--)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}

	}
}
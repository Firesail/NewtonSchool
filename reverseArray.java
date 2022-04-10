
public class Main
{
    // Reverse Array
    public static void main(String[] args) {
		
		int a[] = {10, 5, 30, 17, 1};
		int n = a.length;
		
		System.out.print("Array A: ");
		for(int i=0; i<n; i++)
		    System.out.print(a[i] + " ");
		
		int b[] = new int[n];
		//Copy in B in reverse dir.
		for(int i=0, j=n-1; i<n; i++, j--){   // i = 5   j = -1
		    b[j] = a[i];
		}
		
		System.out.print("\nArray B: ");
		for(int i=0; i<n; i++)
		    System.out.print(b[i] + " ");
		    
		//Copy Values from B to A in same order
		for(int i=0; i<n; i++)
		    a[i] = b[i];
		
		System.out.print("\nArray A: ");
		for(int i=0; i<n; i++)
		    System.out.print(a[i] + " ");
		
	}
}

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {


	public static long funGCD(long x, long y){

        if(x == y)
            return x;

        if(x > y)
            return funGCD(x -y, y);
        else
            return funGCD(x, y - x);
    }


	public static void main (String[] args) {
                      // Your code here

		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();
		long y = sc.nextLong();

		System.out.println(funGCD(x, y));
		
	}
}
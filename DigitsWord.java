

public class Main
{
    // Input => 1024
    // Output => one zero two four

	public static void main(String[] args) {

        int num = 23517;
        int n = num;
        
        int count = 0; //number of digits
        
        // count the digits
        while(n > 0){
            n = n/10;
            count++;
        } 
        
        int a[] = new int[count];
        
        // fill the array with digits in reverse order
        n = num;
        int i = 0;
        while(n > 0){
            int r = n%10; //remainder
            n = n/10;
            
            a[i] = r;
            i++;
        } 
        
        
        System.out.println("\nNo. of digits: " + count);
        //Array has digits in reverse order
        for(i=0;i<count;i++)
            System.out.print(a[i] + " ");
        
        System.out.println();
        //Print Array in right required order
        for(i=count-1;i>=0;i--){
            System.out.print(a[i] + " ");
        }
        
        System.out.println();
        // Convert digits into words
        for(i=count-1;i>=0;i--){
            
            switch(a[i]){
                case 0:
                    System.out.print("zero ");
                    break;
                case 1:
                    System.out.print("one ");
                    break;
                case 2:
                    System.out.print("two ");
                    break;
                case 3:
                    System.out.print("three ");
                    break;
                case 4:
                    System.out.print("four ");
                    break;
                case 5:
                    System.out.print("five ");
                    break;
                case 6:
                    System.out.print("six ");
                    break;
                case 7:
                    System.out.print("seven ");
                    break;
                case 8:
                    System.out.print("eight ");
                    break;
                case 9:
                    System.out.print("nine ");
                    break;
            }
            
        }
        
        
	}
}

import java.util.Scanner;

public class RecursionMultiply {

    public static int  Multiply_by_recursion(int M, int N)
    {

        if(N == 0 || M == 0){
            return 0;
        }

        if(N == 1){
            return M;
        }

        return M + Multiply_by_recursion(M, N - 1);

    }


















    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++){
            int M = sc.nextInt();
            int N = sc.nextInt();

            int res = Multiply_by_recursion(M, N);

            System.out.println(res);
        }

    }

}

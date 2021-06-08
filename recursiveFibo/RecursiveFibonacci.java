import java.util.Scanner;

public class RecursiveFibonacci {
    
    static int Fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static void main(String[] args) {

        int n; 

        Scanner scanner = new Scanner (System.in);


        System.out.print("Kaçıncı Fibonacci Sayisini istiyorsunuz : ");
        n=scanner.nextInt();

        System.out.println(n+". Fibonacci Sayisi : " + Fibonacci(n));
        
    }
}

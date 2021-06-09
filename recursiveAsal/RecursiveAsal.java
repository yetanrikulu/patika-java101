import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class RecursiveAsal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n;

        System.out.print("Sayıyı Giriniz : ");
        n = scanner.nextInt();

        if (isPrime(n, 2))
            System.out.print (n + " sayısı ASALDIR !");
        else
            System.out.println(n + " sayısı ASAL değildir !");
        


    }

    static boolean isPrime(int n, int i)
    {
        if (n<=2)
            return true;
        if (i==n-1)
            return true;
        if (n%i==0)
            return false;

        return isPrime(n, i+1);
    }
    
}

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int n,num1=0,num2=1 ; 
        Scanner scanner = new Scanner (System.in);

        System.out.print("Eleman Sayısını Giriniz : ");
        n=scanner.nextInt();

        System.out.print(n + " Elemanlı Fibonacci Serisi : ");

        for (int i = 1 ; i<=n; i++)
        {
            System.out.print(num1 + " ");

            int sumPrevTwo = num1+num2;
            num1=num2;
            num2=sumPrevTwo;
        }


    }
    
}

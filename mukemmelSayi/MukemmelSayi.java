import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        int n, bolenlerToplami=0;
        Scanner scanner = new Scanner (System.in);

        System.out.print("Bir sayı giriniz : ");
        n=scanner.nextInt();


        for (int i = n-1 ; i>=1; i--)
        {
            if (n%i==0)
            {
                bolenlerToplami+=i;
            }
        }

        if (bolenlerToplami ==n)
        {
            System.out.println(n+ " Mükemmel sayıdır");
        }
        else
        {
            System.out.println(n+ " Mükemmel sayı değildir");
        }
        


    }
    
}

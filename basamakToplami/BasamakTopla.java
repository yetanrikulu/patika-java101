import java.util.Scanner;

public class BasamakTopla {
    public static void main(String[] args) 
    {
        int n,number,basamaklarinToplami=0;

        Scanner scanner = new Scanner (System.in);

        System.out.print("Basamakları toplanacak sayıyı giriniz : ");
        number =scanner.nextInt();
        n=number;
        while (n>0)
        {
            basamaklarinToplami += n%10;
            n/=10;
        }

        System.out.println(number+ " sayisinin basamaklari toplami : " + basamaklarinToplami);

        
    }
    
}

import java.util.Scanner;

public class ArtikYilHesap {

    public static void main(String[] args) 
    {
        int year;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        year = scanner.nextInt();

        //4e
        if (year%4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year %400 ==0)
                {
                    System.out.println(year + " bir artık yıldır !");
                }
                else
                {
                    System.out.println(year + " bir artık yıldır değildir !");
                }                
            }
            else
            {
                System.out.println(year + " bir artık yıldır !");
            }

        }
        else
        {
            System.out.println(year + " bir artık yıldır değildir !");
        }

    }

    
}

import java.util.Scanner;

public class UceVeDordeBolunenOrtalama {
    public static void main(String[] args) {

        int n,sum=0,count=0;
        double average;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaça kadar hesaplanacağını giriniz : ");
        n = scanner.nextInt();

        for (int i=1 ; i<n;i++)
        {
            if (i%3==0 && i%4==0)
            {
                sum+=i;
                count+=1;
            }
        }
        if (count!=0)
        {
            average = sum/count;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması : " + average);
        }
        else
        {
            System.out.println("3 ve 4'e tam bölünen hiç bir sayı yok");
        }
        


    }
    
}

import java.util.Scanner;
public class DortVeBesinKuvvetleri {

    public static void main(String[] args) 
    {
        int n;

        Scanner scanner = new Scanner (System.in);
        System.out.print("Bir Sayı Giriniz : ");
        n = scanner.nextInt();

        for (int i = 1 ; i<n ; i*=4 )
        {
            System.out.println(i);
        }

        System.out.println("--------");
        
        
        for (int i = 1 ; i<n ; i*=5 )
        {
            System.out.println(i);
        }
    }
    
}

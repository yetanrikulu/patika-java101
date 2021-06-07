import java.util.Scanner;

public class YildizElmas {
    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner (System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = scanner.nextInt();

        for (int i = 1; i <= n ; i++) 
        {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i= n-1 ; i>0;i--)
        { // i = 2 j = 0 n-i = 1
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            //2i-1 = 3
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
    
}

import java.util.Scanner;

public class RecursiveDesen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int n;

        System.out.print("Sayıyı Giriniz : ");
        n = scanner.nextInt();

        System.out.println(desen(n,false,0));


    }

    static String desen(int n, boolean isIncreasing, int howMany)
    {

        if (isIncreasing)
        {
            if (howMany == 0 )
                return "";
            else
                return n + " " + desen(n+5,true,howMany-1);
        }
        else
        {
            if (n<=0)
            {
                return n + " " + desen(n+5,true,howMany);                
            }
            else
                return n + " " + desen(n-5,false,howMany+1);
        }

    }
    
}

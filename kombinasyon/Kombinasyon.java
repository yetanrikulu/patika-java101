import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) 
    {
        int n,r,combination;
        int nFactorial=1,rFactorial=1, nMinusRFactorial=1;


        Scanner scanner = new Scanner (System.in);

        System.out.print("N'i Giriniz : ");
        n = scanner.nextInt();

        System.out.print("r'yi Giriniz : ");
        r = scanner.nextInt();


        for (int i =1 ;i<=n ;i++)
        {
            nFactorial*=i;
        }
        for(int i =1;i<=r;i++)
        {
            rFactorial*=i;
        }
        for(int i = 1; i<=(n-r);i++)
        {
            nMinusRFactorial*=i;
        }

        combination = nFactorial/ (rFactorial* nMinusRFactorial);

        System.out.println("C("+n+","+r+") = " +combination);
        
    }
    
}

import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        
        int n1,n2,ebob=1,ekok;
  
        Scanner scanner = new Scanner (System.in);

        System.out.print("1. Sayıyı giriniz : ");
        n1=scanner.nextInt();
        System.out.print("2. Sayıyı giriniz : ");
        n2=scanner.nextInt();


        if (n2<n1)
        {
            int temp = n2;
            n2=n1;
            n1=temp;
        }

        int i = n1;
        while(i>=1){
            if (n1%i==0 && n2%i ==0)
            {
                ebob = i;
                break;
            }
            i--;
        }

        ekok=n1*n2/ebob;


        System.out.println("EBOB("+ n1 + ","+ n2 +") = " + ebob);
        System.out.println("EKOK("+ n1 + ","+ n2 +") = " + ekok );

    }

    private static int Ebob(int n1, int n2)
    {
        if (n2<n1)
        {
            int temp = n2;
            n2=n1;
            n1=temp;
        }
        int i = n1;
        while(i>=1){
            if (n1%i==0 && n2%i ==0)
            {
                return i;
            }

            i--;
        }


        return 0;
    }

    private static int Ekok(int n1, int n2)
    {
        return n1*n2/Ebob(n1,n2);
    }
}

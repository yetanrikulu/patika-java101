import java.util.Scanner;

public class RecursiveUsluSayi {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        int base, exponent;

        System.out.print("Tabanı giriniz : ");
        base=scanner.nextInt();
        System.out.print("Üssü giriniz : ");
        exponent=scanner.nextInt();


        System.out.println(CalculatePower(base,exponent));        

    }

    static int CalculatePower(int base, int exponent){

        if(exponent==0)
        {
            return 1;
        }

        return base * CalculatePower(base,exponent-1);
    }
    
}

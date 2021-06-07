import java.util.Scanner;

public class CiftVeDordunKati {

    public static void main(String[] args)
    {
        int n,total=0;

        Scanner scanner = new Scanner (System.in);

        do{
            System.out.print("Bir Sayı Giriniz : ");
            n =scanner.nextInt();

            if(n%4==0){
                total+=n;
            }

        }while(n%2==0);
        
    }
    
}

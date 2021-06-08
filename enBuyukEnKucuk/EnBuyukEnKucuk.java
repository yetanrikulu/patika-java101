import java.util.Scanner;
public class EnBuyukEnKucuk {

    public static void main(String[] args) {

        int n,temp,enBuyuk = Integer.MIN_VALUE,enKucuk = Integer.MAX_VALUE;
        Scanner scanner = new Scanner (System.in);

        System.out.print("Kaç tane sayı gireceksiniz : ");
        n = scanner.nextInt();

        for (int i = 1 ; i<=n;i++)
        {
            System.out.print(i + " . Sayıyı giriniz : ");
            temp = scanner.nextInt();

            if (temp < enKucuk)
            {
                enKucuk = temp;
            }
            if (temp>enBuyuk)
            {
                enBuyuk=temp;
            }
        }


        System.out.println("En büyük sayı : " +enBuyuk);
        System.out.println("En küçük sayı : " +enKucuk);



    }
    
}

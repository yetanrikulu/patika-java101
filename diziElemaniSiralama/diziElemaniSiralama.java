import java.util.Arrays;
import java.util.Scanner;

public class diziElemaniSiralama {

    public static void main(String[] args) {
        
        int n;

        Scanner scanner = new Scanner (System.in);

        System.out.print("Dizinin boyutu n : " );
        n = scanner.nextInt();
        int[] dizi = new int[n];
        System.out.println("Dizinin elemanlarını giriniz : " );

        for (int i = 0;i<n ;i++)
        {
            System.out.print((i+1)+". Elemanı : " );
            dizi[i] = scanner.nextInt();
        }

        Arrays.sort(dizi);

        System.out.println();
        System.out.print("Sıralama : ");

        for (int i : dizi )
        {
            System.out.print(i+ " ");
        }



    }
    
}

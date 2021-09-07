import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {

        float tutar , kdvOrani, kdvTutarı;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Tutarı Giriniz : ");
        tutar = scanner.nextInt();

        kdvOrani = tutar>0 && tutar<1000 ? 0.18f:0.08f;

        kdvTutarı = tutar * kdvOrani;

        System.out.println("KDV Tutarı : " + kdvTutarı );


    }
}
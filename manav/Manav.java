import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {

        float armutPricePerKg =2.14f, elmaPricePerKg =3.67f,
                domatesPricePerKg=1.11f,muzPricePerKg = 0.95f,
                patlicanPricePerKg = 5f , total=0f;

        float armutKg,elmaKg,domatesKg,muzKg,patlicanKg;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armutKg = scanner.nextFloat();
        total+=armutKg*armutPricePerKg;

        System.out.print("Elma Kaç Kilo ? : ");
        elmaKg = scanner.nextFloat();
        total+=elmaKg*elmaPricePerKg;

        System.out.print("Domates Kaç Kilo ? : ");
        domatesKg = scanner.nextFloat();
        total+=domatesKg*domatesPricePerKg;

        System.out.print("Muz Kaç Kilo ? : ");
        muzKg = scanner.nextFloat();
        total+=muzKg*muzPricePerKg;

        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKg = scanner.nextFloat();
        total+=patlicanKg*patlicanPricePerKg;

        System.out.print("Toplam Tutar : " + total +" TL");
    }
}
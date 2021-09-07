import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        float km, pricePerKm = 2.2f, totalPrice;
        int startingPrice = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç KM gidildiğini giriniz : ");
        km = scanner.nextFloat();

        totalPrice = startingPrice + km*pricePerKm;
        totalPrice = totalPrice<20 ? 20:totalPrice;

        System.out.print("Taksimetre Tutarı : " + totalPrice);

    }



}
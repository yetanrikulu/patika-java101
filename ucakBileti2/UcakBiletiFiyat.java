import java.util.Scanner;

public class UcakBiletiFiyat {
    public static void main(String[] args) {

        double travellingDistance, pricePerKilometer=0.1;
        int passengerAge, travelType;

        double ticketPrice;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yolculuğun mesafesini kilometre cinsinden giriniz :  ");
        travellingDistance = scanner.nextInt();
        System.out.print("Yaşınızı giriniz :  ");
        passengerAge = scanner.nextInt();
        System.out.print("Tek yön için 1, Gidiş-dönüş için 2 giriniz ");
        travelType = scanner.nextInt();

        ticketPrice = travellingDistance* pricePerKilometer;

        if (travellingDistance<0 || passengerAge<0 || !(travelType==1 || travelType == 2))
        {
            System.out.println("Hatalı veri girdiniz !");
        }
        else
        {
            if (passengerAge <12)
            {
                ticketPrice/=2;
            }
            else if (passengerAge<24)
            {
                ticketPrice*=0.9;
            }
            else if (passengerAge >65)
            {
                ticketPrice *=0.7;
            }

            if (travelType == 2 ){
                ticketPrice *=0.8;
                ticketPrice*=2;
            }

            System.out.println("Toplam Tutar = " + ticketPrice + " TL");

        }





    }
}
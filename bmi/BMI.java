import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {

        float boy,kilo,bmi;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy =scanner.nextFloat();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = scanner.nextFloat();

        bmi = kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz : " + bmi);
    }
}
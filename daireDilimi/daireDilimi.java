import java.util.Scanner;

public class daireDilimi {
    public static void main(String[] args) {

        double r, alfa, area, pi=3.14;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz : ");
        r = scanner.nextDouble();
        System.out.print("Açıyı giriniz : ");
        alfa = scanner.nextDouble();

        area = (pi*r*r*alfa)/360;

        System.out.println("Daire diliminin alanı : " + area);
    }
}
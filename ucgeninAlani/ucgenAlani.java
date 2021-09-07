import java.util.Scanner;

public class ucgenAlani {
    public static void main(String[] args) {

        float a,b,c,cevre ,u;
        double alan;

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Kenarı Giriniz : ");
        a=scanner.nextFloat();
        System.out.print("2. Kenarı Giriniz : ");
        b=scanner.nextFloat();
        System.out.print("3. Kenarı Giriniz : ");
        c=scanner.nextFloat();

        cevre = a+b+c;
        u = cevre/2;

        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Alanı : " + alan);


    }

}
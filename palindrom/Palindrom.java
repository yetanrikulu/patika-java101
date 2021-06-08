import java.util.Scanner;

public class Palindrom {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastDigit;
        
        while (temp != 0) {
            lastDigit = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            temp /= 10;
        }
        return number == reverseNumber;
    }

    public static void main(String[] args) {
        
        int n;
        Scanner scanner = new Scanner (System.in);

        System.out.print("Bir sayı giriniz : ");
        n=scanner.nextInt();

        System.out.println(isPalindrom(n));
    }
}
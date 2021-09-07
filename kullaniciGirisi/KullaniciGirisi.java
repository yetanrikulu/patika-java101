import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        String userName, password,newPassword;
        int secim;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = scanner.nextLine();

        System.out.print("Şifreniz : ");
        password = scanner.nextLine();

        if (!userName.equals("patika")){
            System.out.println("Şifresiniz sıfırlamak istiyorsanız 1 değilse 2");
            secim = scanner.nextInt();

            if (secim == 1)
            {
                System.out.print("Yeni şifrenizi giriniz : ");
                scanner.nextLine();
                newPassword = scanner.nextLine();

                if (newPassword.equals(password) || newPassword.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else{
                    System.out.println("Şifre oluşturuldu");
                }

            }


        }


    }
}
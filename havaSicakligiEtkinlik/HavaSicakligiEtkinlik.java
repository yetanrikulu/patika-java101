import java.util.Scanner;

public class HavaSicakligiEtkinlik {
    public static void main(String[] args) {

        int temperature;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sıcaklık Giriniz : ");
        temperature = scanner.nextInt();

        if(temperature>25)
        {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
        else if (temperature>=5)
        {
            if (temperature>=10)
            {
                System.out.println("Pikniğe gidebilirsiniz.");
            }
            if (temperature<15)
            {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
        }
        else
        {
            System.out.println("Kayağa gidebilirsiniz.");
        }





    }
    
}

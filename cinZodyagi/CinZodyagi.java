import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) 
    {
        int birthYear,reminderOfBirthYear;
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz : " );
        birthYear = scanner.nextInt();

        reminderOfBirthYear = birthYear%12;

        if (reminderOfBirthYear == 0)
        {
            System.out.println("Çin Zodyağı Burcunuz : Maymun");
        }
        else if (reminderOfBirthYear == 1)
        {
            System.out.println("Çin Zodyağı Burcunuz : Horoz");
        }
        else if (reminderOfBirthYear == 2)
        {
            System.out.println("Çin Zodyağı Burcunuz : Köpek");
        }
        else if (reminderOfBirthYear == 3)
        {
            System.out.println("Çin Zodyağı Burcunuz : Domuz");
        }
        else if (reminderOfBirthYear == 4)
        {
            System.out.println("Çin Zodyağı Burcunuz : Fare");
        }
        else if (reminderOfBirthYear == 5)
        {
            System.out.println("Çin Zodyağı Burcunuz : Öküz");
        }
        else if (reminderOfBirthYear == 6)
        {
            System.out.println("Çin Zodyağı Burcunuz : Kaplan");
        }
        else if (reminderOfBirthYear == 7)
        {
            System.out.println("Çin Zodyağı Burcunuz : Tavşan");
        }
        else if (reminderOfBirthYear == 8)
        {
            System.out.println("Çin Zodyağı Burcunuz : Ejderha");
        }
        else if (reminderOfBirthYear == 9)
        {
            System.out.println("Çin Zodyağı Burcunuz : Yılan");
        }
        else if (reminderOfBirthYear == 10)
        {
            System.out.println("Çin Zodyağı Burcunuz : At");
        }
        else if (reminderOfBirthYear == 11)
        {
            System.out.println("Çin Zodyağı Burcunuz : Koyun");
        }


    }
    
}

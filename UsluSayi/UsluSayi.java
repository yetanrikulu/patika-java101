import java.util.Scanner;
public class UsluSayi {
    
public static void main(String[] args) 
{
    int n,r,result=1;

    Scanner scanner = new Scanner (System.in);

    System.out.print("Write the base number : ");
    n=scanner.nextInt();

    System.out.print("Write the power numner : ");
    r=scanner.nextInt();

    for (int i =1;i<=r;i++)
    {
        result*=n;
    }

    System.out.println("Result : " + result);

    
}
    
}

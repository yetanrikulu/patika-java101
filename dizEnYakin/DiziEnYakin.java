import java.util.Scanner;

public class DiziEnYakin {

   
        public static void main(String[] args) {
            int[] list = {15,12,788,1,-1,-778,2,0};

            Scanner scanner = new Scanner (System.in);

            System.out.print("Aranan değeri giriniz : ");
            int value = scanner.nextInt();
          

            int smallerDifference = Integer.MAX_VALUE;
            int largerDifference = Integer.MAX_VALUE;

            int smaller=list[0];
            int larger=list[0];
    
            for (int i : list) {

                if (i<value) 
                {
                    if ((value - i) <smallerDifference){
                        smallerDifference = value-i;
                        smaller = i;
                    }
                }

                if (i>value) 
                {
                    if ((i-value) < largerDifference)
                    {
                        largerDifference = i-value;
                        larger = i ; 
                    }    
                }
            }
    
            System.out.println("Girilen sayıdan küçük en yakın sayı : " + smaller);
            System.out.println("Girilen sayıdan büyük en yakın sayı : " + larger);
    
        }
    
    
    
}

import java.util.Arrays;

public class DiziElemaniFrekans {

    static boolean isDahaOnceYazildi(int arr[], int a)
    {

        for (int i : arr){
            if (i==a)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        
        int[] dizi = {10,20,20,10,10,20,5,20};
        

        int []  dahaOnceYazildi = new int[dizi.length];
        int[] kacKere = new int[dizi.length];
        int dahaOnceYazildiSayac=0;


        for (int i= 0 ; i<dizi.length;i++)
        {
            int sayac = 1;
            for (int j = i+1; j<dizi.length; j++)
            {
                if (isDahaOnceYazildi(dahaOnceYazildi, dizi[i]))
                {
                    break;
                }
                else
                {
                    if (dizi[i] == dizi[j])
                        sayac++;

                }
            }

            if (!isDahaOnceYazildi(dahaOnceYazildi, dizi[i]))
            {
                dahaOnceYazildi[dahaOnceYazildiSayac] = dizi[i];
                kacKere[dahaOnceYazildiSayac] = sayac;
    
                dahaOnceYazildiSayac++;
            }
            
            
        }

        for (int i = 0 ; i<dahaOnceYazildi.length ;i++ )
        {
            if (dahaOnceYazildi[i]!=0)
            {
                System.out.println(dahaOnceYazildi[i] + " sayısı " + kacKere[i] + " kere tekrar edildi.");
            }
        }


    }
    
}

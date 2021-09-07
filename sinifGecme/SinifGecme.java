import java.util.Scanner;

public class SinifGecme {

    public static void main(String[] args) {

        int mat, fizik,kimya,turkce,tarih, muzik;
        double total=0,average;


        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();
        if (mat<=100 && mat>=0){
            total+=mat;
        }

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();
        if (fizik<=100 && fizik>=0){
            total+=fizik;
        }

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();
        if (kimya<=100 && kimya>=0){
            total+=kimya;
        }

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();
        if (turkce<=100 && turkce>=0){
            total+=turkce;
        }

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();
        if (tarih<=100 && tarih>=0){
            total+=tarih;
        }

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();
        if (muzik<=100 && muzik>=0){
            total+=muzik;
        }

        average = total/6;

        if (average>=55){
            System.out.println("Sınıfı Geçtiniz. Ortalamanız : " + average);
        }
        else {
            System.out.println("Sınıfta Kaldınız. Ortalamanız : " +average);
        }


    }
}
public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat,int matSozluNotu, int fizik, int fizikSozluNotu, int kimya, int kimyaSozluNotu) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
            this.mat.sozluNotu = matSozluNotu;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
            this.fizik.sozluNotu = fizikSozluNotu;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
            this.kimya.sozluNotu = kimyaSozluNotu;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.fizik.sozluNotu * this.fizik.sozluNotuYuzdesi/100) + (this.fizik.note * (1-(this.fizik.sozluNotuYuzdesi/100)))    
                        + (this.kimya.sozluNotu * this.kimya.sozluNotuYuzdesi/100) + (this.kimya.note * (1-(this.kimya.sozluNotuYuzdesi/100)))   
                        + (this.mat.sozluNotu * this.mat.sozluNotuYuzdesi/100) + (this.mat.note * (1-(this.mat.sozluNotuYuzdesi/100 ))) ) 
                        / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}

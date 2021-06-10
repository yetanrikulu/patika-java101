import javax.lang.model.util.ElementScanner14;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if (this.salary<1000)
            return 0;
        else
            return this.salary*0.03; 
    }

    int bonus(){
        return workHours*30;
    }
    
    double raiseSalary(){
        int howManyYears = 2021 - this.hireYear;

        if (howManyYears>=20){
            return this.salary*0.15;
        }
        else if (howManyYears>=10)
        {
            return this.salary*0.1;
        }
        else
        {
            return this.salary*0.05;
        }
        
    }
    
    void printInfo()
    {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergiler ve Bonuslar ile birlikte maaş : " + (this.salary+bonus()-tax()));
        System.out.println("Toplam Maaş : " + (this.salary + raiseSalary()));

        
    }

}

package Week3.TeknikAnaliz2.MaasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    double tax;
    double bonus;
    double raiseSalary;
    Employee(String name , double salary , int workHours , int hireYear){

        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
        this.workHours = workHours;
    }

    void Tax(){
        if(salary < 1000){
            tax = 0;

        }
        else{
            tax = salary * 0.3;

        }
    }

    void bonus(){
        if (this.workHours>40)
        {
            this.bonus = (this.workHours - 40) * 30;
        }
        else
        {
            this.bonus=0;
        }

    }
    void raiseSalary(){
        if (2021-this.hireYear<10)
        {
            this.raiseSalary=this.salary*0.05;
        }
        else if(2021-this.hireYear<20)
        {
            this.raiseSalary=this.salary*0.10;
        }
        else
            this.raiseSalary=this.salary*0.15;


    }

    public void calculatesalary(){

        Tax();
        bonus();
        raiseSalary();




    }

    public void print(){
        System.out.println("--------------------------------");
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + this.tax);
        System.out.println("Bonus: " + this.bonus);
        System.out.println("Maaş Artışı: " + this.raiseSalary);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :" + (this.salary+this.bonus-this.tax));
        System.out.println("Toplam Maaş: " + (this.salary+this.bonus+this.raiseSalary-this.tax));



    }
}

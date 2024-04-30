package Week3.TeknikAnaliz2.MaasHesaplayici;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Employee e1 = new Employee("Alpay",4999,45,1990);

        e1.calculatesalary();
        e1.print();


    }
}

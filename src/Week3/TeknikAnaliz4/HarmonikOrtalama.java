package Week3.TeknikAnaliz4;
import java.util.Scanner;
import java.util.Random;

public class HarmonikOrtalama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("0'dan büyük bir tam sayı giriniz: ");
        int n = scanner.nextInt();
        int[] myArray = randomArray(n);
        printArray(myArray);

        System.out.println(" ");
        double sum = findHarmonicSeries(myArray);

        double result = findAvarge(sum , n);
        System.out.println(result);


    }
    //Random array oluşturma n tane
    static  int[] randomArray(int n){
        Random r=new Random();
        int[] myArray = new int[n];
        for(int i = 0 ; i< n ; i++){

            myArray[i] = r.nextInt(150);
        }
        return  myArray;
    }
    //harmonik seri ortalaması alma
    static  double findAvarge(double sum , int n){

        return n / sum;
    }
    //harmonik seri hesaplama
    static  double findHarmonicSeries(int[] myArray){
        double sum = 0.0;
        for (int j : myArray) {
            sum += (1.05 / j);
        }
        return  sum;

    }
    //Array yazdırma
    static  void printArray(int[] myArray){
        for(int i :myArray){
            System.out.print(i + " ");
        }

    }

}

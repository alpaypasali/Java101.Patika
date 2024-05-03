package Week3.TeknikAnaliz4;

import java.util.Random;
import java.util.Scanner;

public class EnYakinSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("0'dan büyük bir tam sayı giriniz: ");
        int n = scanner.nextInt();
        int[] myArray = randomArray(n);
        printArray(myArray);
        System.out.println("Bir sayı giriniz : ");
        int number = scanner.nextInt();
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for(int i : myArray){

           if(i < number && i > min)
               min = i;
           if(i > number && i < max)
               max = i;

        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min );
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max );





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
    //Array yazdırma
    static  void printArray(int[] myArray){
        for(int i :myArray){
            System.out.print(i + " ");
        }
        System.out.println("");

    }

}

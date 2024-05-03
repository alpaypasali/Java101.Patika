package Week3.TeknikAnaliz4;

import java.util.Random;
import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("0'dan büyük bir tam sayı giriniz: ");
        int n = scanner.nextInt();
        int[] myArray = randomArray(n);
        printArray(myArray);
        int[] arr= bubbleSort(myArray);
        printArray(arr);
    }
    static int[] bubbleSort(int arr[]){
        int temp = 0 ;
        for(int i = 0 ; i<arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j - 1] > arr[j]) {

                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return  arr;
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

package Week3.TeknikAnaliz4;

import java.util.Random;
import java.util.Scanner;

public class Frekans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer greater than 0: ");
        int n = scanner.nextInt();
        int[] myArray = generateRandomArray(n);
        printArray(myArray);

        int[] frequencies = new int[myArray.length];

        // Calculate frequencies of elements
        for (int i = 0; i < myArray.length; i++) {
            if (frequencies[i] == -1)
                continue;

            int frequency = 1;
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    frequency++;
                    frequencies[j] = -1;
                }
            }
            frequencies[i] = frequency;
        }

        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > 0) {
                System.out.println(i + " sayısı " + frequencies[i] + " kere tekrar edildi.");
            }
        }
    }

    // Generate a random array with n elements
    static int[] generateRandomArray(int n) {
        Random r = new Random();
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            myArray[i] = r.nextInt(15);
        }
        return myArray;
    }

    // Print the array
    static void printArray(int[] myArray) {
        for (int i : myArray) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
package Week3.TeknikAnaliz1;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi = scanner.nextInt();

        if (isPalindrom(sayi)) {
            System.out.println(sayi + " bir palindromdur.");
        } else {
            System.out.println(sayi + " bir palindrom değildir.");
        }
    }

    static boolean isPalindrom(int sayi) {
        int tersSayi = 0, geciciSayi = sayi;

        while (geciciSayi != 0) {
            int basamak = geciciSayi % 10;
            tersSayi = tersSayi * 10 + basamak;
            geciciSayi /= 10;
        }

        return sayi == tersSayi;
    }
}


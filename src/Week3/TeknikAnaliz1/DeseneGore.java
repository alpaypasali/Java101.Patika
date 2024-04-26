package Week3.TeknikAnaliz1;

import java.util.Scanner;

public class DeseneGore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen n değerini girin: ");
        int kullaniciGirdisi = input.nextInt();
        int islemDegeri = recursiveIslemEksi(kullaniciGirdisi);
        recursiveIslemArti(islemDegeri, kullaniciGirdisi);
    }


    public static int recursiveIslemEksi(int islemDegeri){
        if(islemDegeri <=0) return islemDegeri;
        System.out.print(islemDegeri +" ");
        return recursiveIslemEksi(islemDegeri-5);
    }


    public static void recursiveIslemArti(int islemDegeri, int userInput){
        if (userInput>=islemDegeri) {
            System.out.print(islemDegeri + " ");
            recursiveIslemArti(islemDegeri + 5, userInput);
        }
    }
}

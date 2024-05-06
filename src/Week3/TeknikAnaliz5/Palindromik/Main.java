package Week3.TeknikAnaliz5.Palindromik;

public class Main {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }
    static boolean isPalindrome3(String str) {
        //StringBuilder döner
        StringBuilder reversed = new StringBuilder(str).reverse();
        //Dönen StringBuilder daha sonra string atanır.
        String reversedString = reversed.toString();
        return str.equals(reversedString);
    }
    static boolean isPalindrome4(String str) {
        //Collectors.joining() kullanır ve direkt olarak string bir değer döner
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome4("abba"));
    }
}

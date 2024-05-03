package Week3.TeknikAnaliz4;

public class TekrarEden {

    static boolean isFind(int[] arr , int value){
        for(int i : arr) {
            if ((i == value))
                return true;
        }
        return  false;
    }
    public static void main(String[] args) {

        int[] list = {5,12,5,29,28,12,16,58,7,9,16,22};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for(int i = 0 ; i < list.length ;i++){
            for(int j = 0 ; j < list.length; j++){
                if((i != j ) && (list[i] == list[j]) && (list[i] % 2 == 0)){
                    if(!isFind(duplicate , list[i])){


                        duplicate[startIndex++] = list[i];
                    }


                }


            }

        }

        for(int value : duplicate){
            if(value != 0)
            System.out.print(value + " ");

        }


    }
}

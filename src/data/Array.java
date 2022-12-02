package data;

public class Array {

    public static void arr(String[] args) {
        String array1[] = {"2", "3", "4", "5"};
        String array2[] = {"1", "3", "5", "7"};
        String array3 = "";

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0 ; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    array3 += array2[j];
                   
                } 

            }
            
        }
        System.out.println(array3);
        System.out.println("\n==========================");

    }
}

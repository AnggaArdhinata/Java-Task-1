package data;

import java.util.Arrays;

public class Sorting {
    public static void srt(String[] args) {

        int array[] = {3,2,4,1,5};
        System.out.println("Original array: ");
        for (int num : array) {
            System.out.println(num+" ");

        }
        Arrays.sort(array);
        System.out.println("\nArray sorted: ");
        for (int num : array) {
            System.out.println(num+" ");
        }
        
    }
}

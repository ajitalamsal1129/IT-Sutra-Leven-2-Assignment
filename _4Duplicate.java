package src.Level2;

import java.util.Scanner;

//Find the duplicate number from the array.
public class _4Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 1, 1, 3, 8};
        System.out.println("Duplicates are:");
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {


                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }

        }
    }
}









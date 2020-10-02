package src.Level2;

import java.util.Scanner;

//Reverse a string
public class _5Reverse {
    public static void main(String[] args) {
        String name = "Sandesh";
        char[] reverse= name.toCharArray();

        for (int i =reverse.length-1;i>=0;i--) {
            System.out.print(reverse[i]);

        }
    }
}
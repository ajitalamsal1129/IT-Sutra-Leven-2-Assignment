package src.Level2;
//Reverse an integer
public class _6ReverseInt {
    public static void main(String[] args) {//Array to print namews in reverse order
        int[] num = {1, 3, 5, 6, 8, 9};
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] +" ");
        }
    }
}

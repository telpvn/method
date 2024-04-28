import java.util.Scanner;

public class Main {
   static int[] array = {1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Введите число");
        int input = new Scanner(System.in).nextInt();
        array[2] = input;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

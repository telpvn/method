import java.util.Scanner;

public class Main {
    static int[] array = {1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        printArray();


        array[2] = inputNum();

        printArray();
    }

    public static void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int inputNum() {
        System.out.println("Введите число");
        return new Scanner(System.in).nextInt();
    }
}

import java.util.Scanner;

public class Main {
    static int x = 0;
    static int y = 0;

    public static void main(String[] args) {
        while (true) {
            int command = inputCommand();
            if (command == 1) {
                y -= inputSteps();
            } else if (command == 2) {
                y += inputSteps();
            } else if (command == 3) {
                x += inputSteps();
            } else if (command == 4) {
                x -= inputSteps();
            } else if (command == 5) {
                print();
            } else {
                errorInput();
            }
        }
    }

    private static void errorInput() {
        System.out.println("Команда не верна!");
    }

    private static void print() {
        System.out.println("Координаты: x " + x + ", y " + y);
    }

    private static int inputSteps() {
        System.out.println("Ведите кол-во шагов: ");
        return new Scanner(System.in).nextInt();
    }

    private static int inputCommand() {
        System.out.println("Введите команду:\n1-пойти вниз\n2-пойти вверх\n3-пойти направо\n4-пойти налево\n5-печать координат робота:");
        return new Scanner(System.in).nextInt();
    }
}
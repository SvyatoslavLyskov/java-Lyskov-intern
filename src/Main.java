import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMenu();
            try {
                int userInput = scanner.nextInt();
                switch (userInput) {
                    case 1:
                        System.out.println("Введите число:");
                        int number = scanner.nextInt();
                        if (number > 7) {
                            System.out.println("Привет");
                        }
                        break;
                    case 2:
                        System.out.println("Введите имя:");
                        scanner.nextLine();
                        String nameInput = scanner.nextLine();
                        if (nameInput.equals("Вячеслав")) {
                            System.out.println("Привет, " + nameInput);
                        } else {
                            System.out.println("Нет такого имени");
                        }
                        break;
                    case 3:
                        System.out.print("Введите размер массива: ");
                        int size = scanner.nextInt();
                        int[] numbers = new int[size];
                        System.out.println("Введите элементы массива:");
                        for (int i = 0; i < size; i++) {
                            System.out.print("Элемент " + (i + 1) + ": ");
                            numbers[i] = scanner.nextInt();
                        }
                        System.out.println("Элементы массива, кратные 3:");
                        for (int n : numbers) {
                            if (n % 3 == 0) {
                                System.out.print(n + ", ");
                            }
                        }
                        break;
                    case 0:
                        System.out.println("Программа завершена.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Неверный ввод команды");
                }
            } catch (InputMismatchException e) {
                System.out.println("Введите корректное значение.");
                scanner.nextLine();
            }
        }
    }

    public static void printMenu() {
        System.out.println("Введите номер задания: ");
        System.out.println("1. Составить алгоритм: если введенное число больше 7, то вывести “Привет”");
        System.out.println("2. Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, " +
                "Вячеслав”, если нет, то вывести \"Нет такого имени\"");
        System.out.println("3. Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы" +
                " массива кратные 3");
        System.out.println("0. Выход из программы");
    }
}
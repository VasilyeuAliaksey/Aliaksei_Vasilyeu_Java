package test;

import java.util.Random;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Задание №1: \n Введите число: ");

        if (scanner.hasNextDouble()) {
            double numberEnter = scanner.nextDouble();
            if (numberEnter == 7) {
                System.out.println("Ответ №1: \n Числа равны.");
            } else if (numberEnter > 7) {
                System.out.println("Ответ №1: \n Привет.");
            } else {
                System.out.println("Ответ №1: \n Число меньше 7.");
            }
        } else {
            System.out.println("Вы ввели не число");
        }

        System.out.println("Задание №2: \n Введите имя: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        if (name.equals("Вячеслав")) {
            System.out.println("Ответ №2: \n Привет, Вячеслав");
        } else {
            System.out.println("Ответ №2: \n Нет такого имени");
        }

        System.out.print("Задание №3: \n Введите размер массива: ");

        if (scanner.hasNextInt()) {
            int arrayLength = scanner.nextInt();
            Random random = new Random();
            int[] arrays = new int[arrayLength];
            System.out.println("Ответ №3: \nМассив:");

            for (int i = 0; i <= arrayLength - 1; i++) {
                arrays[i] = random.nextInt(50);
                System.out.print(arrays[i] + ". ");
            }

            System.out.println("\nЧисла из массива кратные 3: ");
            for (int element : arrays) {
                if (element % 3 == 0) {
                    System.out.print(element + ". ");
                }
            }
        } else {
            System.out.println("Введите целое число");
        }
        scanner.close();
        /* Ответ на 4 задание:
             [((())()(()))]
             Убрать 1 "]" закрывающую и поставить ")" закрывающую в конце
         */
    }

}

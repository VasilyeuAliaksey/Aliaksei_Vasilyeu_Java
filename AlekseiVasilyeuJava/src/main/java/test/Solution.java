package test;

import java.util.Random;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Задание 1: \n Введите число: ");
        double numberEnter = scanner.nextDouble();
        System.out.print("Задание 2: \n Введите имя: ");
        String name = scanner.next();
        System.out.print("Задание 3: \n Введите размер массива: ");
        int arrayLength = scanner.nextInt();
        scanner.close();

        if (numberEnter == 7) {
            System.out.println("Ответ 1: \n Привет");
        } else {
            System.out.println("Ответ 1: \n Условие не выполнено");
        }

        if (name.equals("Вячеслав")) {
            System.out.println("Ответ 2: \n Привет, Вячеслав");
        } else {
            System.out.println("Ответ 2: \n Нет такого имени");
        }

        Random random = new Random();
        int[] arrays = new int[arrayLength];
        System.out.println("Ответ 3: \nМассив");

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
        /* Ответ на 4 задание:
             [((())()(()))]
             Убрать 1 "]" закрывающую и поставить ")" закрывающую в конце
         */
    }
}

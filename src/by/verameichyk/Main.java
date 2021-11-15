package by.verameichyk;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество чисел для сравнения");
        int n = scan.nextInt();
        int[] mass = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Введите " + (i + 1) + " число");
            while (!scan.hasNextInt()) {
                System.out.println("Неверно введен символ! Введите число " + (i + 1));
                scan.next();
            }
            mass[i] = scan.nextInt();
        }
        int min = mass[0];
        int max = mass[0];
        int maxLenght = 0;
        int minLenght = CountsOfDigits(mass[0]);
        int maxLenghtVar = mass[0];
        int minLenghtVar = mass[0];

        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
            }
            if (max < mass[i]) {
                max = mass[i];
            }
            if (maxLenght < CountsOfDigits(mass[i])) {
                maxLenght = CountsOfDigits(mass[i]);
                maxLenghtVar = mass[i];
            }
            if (minLenght > CountsOfDigits(mass[i])) {
                minLenght = CountsOfDigits(mass[i]);
                minLenghtVar = mass[i];
            }
        }

        System.out.println("Максимальное  и минимальное число из введенных: " + max + " и " + min);
        System.out.println("Число " + maxLenghtVar + " имеет максимальное количество символов равное " + maxLenght);
        System.out.println("Число " + minLenghtVar + " имеет минимальное количество символов равное " + minLenght);
    }

    public static int CountsOfDigits(int num) {
        return String.valueOf(Math.abs(num)).length();
    }
}

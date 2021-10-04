package ru.itis.lessons;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        /*// переворот массива в один цикл
        System.out.println("Enter arr length");
        int n = src.nextInt();
        int[] arr = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            System.out.println("Enter next element");
            arr[i] = src.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        //стандартное решение
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        System.out.println(Arrays.toString(arr));*/


        System.out.println("Enter n");
        int n = src.nextInt();

        System.out.println("Enter x");
        double x = src.nextDouble();

        double result = (x * x * x) / 2;

        for (int i = 2; i <= n; i++) {
            result += (pow(x, i + 2) * factorial(i))/ (2 * factorial(i));
        }

        System.out.println(result);
    }

    private static double pow(double base, int exponent) {
        double result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }

    private static long factorial(int elem) {
        long result = 1;

        for (int i = 2; i <= elem; i++) {
            result *= i;
        }

        return result;
    }
}

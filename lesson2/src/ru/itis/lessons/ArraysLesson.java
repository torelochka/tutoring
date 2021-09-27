package ru.itis.lessons;

import java.util.Arrays;

public class ArraysLesson {

    public static void main(String[] args) {
        // объявление одномерноых массивов
        int[] intArray = new int[4];
        int intArrayC[] = new int[2];

        // объявление двумерных массивов
        int[][] intMatrix = new int[4][2];
        int[][] intMatrixWithoutColumns = new int[4][];

        // Объявление и инициализация одномерных массивов
        int[] intArrayInit = new int[]{1, 2, 3, 4, 5};
        double[] doubleArray = new double[1];
        boolean[] booleanArray = new boolean[2];

        // Объявление и инициализация двумерных массивов
        double[][] doubleMatrix = new double[][]{{1.5, 0, 1.6, 2.1}, {4.6, 63.11}};

        // Обращения к одномерному массиву
        intArray[0] = 2;
        intArray[2] = 5;
        intArray[0] = 3;

        // Обращения к двумерному массиву
        double elem = doubleMatrix[0][2];

        // Перебор одномерного массива
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("index " + i + " " + intArray[i]);
        }

        System.out.println("\n\n");

        // Перебор двумерного массива
        for (int rows = 0; rows < doubleMatrix.length; rows++) {
            for (int columns = 0; columns < doubleMatrix[rows].length; columns++) {
                System.out.print(doubleMatrix[rows][columns] + " ");
            }
            System.out.println("");
        }


        //гетерогенный контейнер

        Object[] objects = new Object[]{2, 4.5, 3f, "sstt"};
        //System.out.println(ArraysLesson.toString(objects));
    }
}


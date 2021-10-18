package ru.itis;

import java.util.Scanner;

public class Task1New {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int n = src.nextInt();
        int m = src.nextInt();

        int[][] result = new int[n][m];

        String direction = "right";

        int rightOffsetColumn = 0;
        int leftOffsetColumn = 0;
        int rowOffset = 0;

        int iter = 1;

        for (int i = 0; i < result.length - rowOffset;) {
            if (direction == "right") {
                for (int j = leftOffsetColumn; j < result[i].length - rightOffsetColumn; j++) {
                    result[i][j] = iter++;
                }
                i++;
            } else if (direction == "down") {
                for (int l = i; l < result.length - rowOffset; l++) {
                    result[l][result[l].length - rightOffsetColumn - 1] = iter++;
                }
                rightOffsetColumn++;
            } else if (direction == "left") {
                for (int j = result[i].length - 1 - rightOffsetColumn; j >= leftOffsetColumn; j--) {
                    result[result.length - rowOffset - 1][j] = iter++;
                }
                rowOffset++;
            } else if (direction == "up") {
                for (int l = result.length - 1 - rowOffset; l >= i; l--) {
                    result[l][leftOffsetColumn] = iter++;
                }
                leftOffsetColumn++;
            }

            direction = changeDirection(direction);
        }

        printResult(result);
    }

    private static void printResult(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static String changeDirection(String direction) {
        switch (direction) {
            case "right":
                direction = "down";
                break;
            case "down":
                direction = "left";
                break;
            case "left":
                direction = "up";
                break;
            case "up":
                direction = "right";
                break;
        }
        return direction;
    }
}

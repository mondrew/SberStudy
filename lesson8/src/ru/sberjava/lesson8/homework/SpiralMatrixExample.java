/*
 * SpiralMatrix program - Iterator for spiral matrix traversing
 * The 8th homework on Sber Java Developer Syllabus.
 * @author: Andrei Beseda
 * @version: 1.0 02/06/2021
 * @nickname: mondrew
 */
package ru.sberjava.lesson8.homework;

public class SpiralMatrixExample {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 20, 19, 18, 17, 16},
                {2, 21, 32, 31, 30, 15},
                {3, 22, 33, 36, 29, 14},
                {4, 23, 34, 35, 28, 13},
                {5, 24, 25, 26, 27, 12},
                {6, 7,  8,  9,  10, 11}
        };
        SpiralMatrix spiralMatrix = new SpiralMatrix(matrix, 6, 6);
        for (Integer i : spiralMatrix) {
            System.out.print(i + " ");
        }
    }
}

/*
 * SpiralMatrix program - Iterator for spiral matrix traversing
 * The 8th homework on Sber Java Developer Syllabus.
 * @author: Andrei Beseda
 * @version: 1.0 02/06/2021
 * @nickname: mondrew
 */
package ru.sberjava.lesson8.homework;

import java.util.Iterator;

public class SpiralMatrix implements Iterable<Integer> {

    int[][] matrix;
    int     rows;
    int     cols;

    public SpiralMatrix() {
        matrix = null;
        rows = 0;
        cols = 0;
    }

    public SpiralMatrix(int[][] matrix, int rows, int cols) {
        this.matrix = matrix;
        this.rows = rows;
        this.cols = cols;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    @Override
    public Iterator<Integer> iterator() {
        return (new SpiralMatrixIterator());
    }

    public class SpiralMatrixIterator implements Iterator<Integer> {
        int iRow = 0;
        int jCol = 0;
        int firstRow = 0;
        int firstCol = 0;
        int lastRow = rows - 1;
        int lastCol = cols - 1;
        int size = rows * cols;
        int pos = 0;
        boolean moveBorder = false;

        public boolean hasNext() {

            if (pos == 0 && size != 0) {
                pos++;
                return (true);
            }
            if (pos + 1 <= size) {
                if (iRow == firstRow && jCol == firstCol) {
                    iRow++;
                    if (pos != 1)
                        moveBorder = true;
                }
                else if (jCol == firstCol && iRow < lastRow) {
                    if (moveBorder) {
                        firstRow++;
                        moveBorder = false;
                    }
                    iRow++;
                }
                else if (iRow == lastRow && jCol == firstCol) {
                    jCol++;
                    moveBorder = true;
                }
                else if (iRow == lastRow && jCol < lastCol) {
                    if (moveBorder) {
                        firstCol++;
                        moveBorder = false;
                    }
                    jCol++;
                }
                else if (iRow == lastRow && jCol == lastCol) {
                    iRow--;
                    moveBorder = true;
                }
                else if (jCol == lastCol && iRow > firstRow) {
                    if (moveBorder) {
                        lastRow--;
                        moveBorder = false;
                    }
                    iRow--;
                }
                else if (iRow == firstRow && jCol == lastCol) {
                    jCol--;
                    moveBorder = true;
                }
                else if (iRow == firstRow && jCol > firstCol) {
                    if (moveBorder) {
                        lastCol--;
                        moveBorder = false;
                    }
                    jCol--;
                }
                pos++;
                return true;
            }
            return false;
        }

        public Integer next() {
            return matrix[iRow][jCol];
        }
    }
}

/*
 * Tree program - naive Linux 'tree' util implementation
 * The 12th (bonus) homework on Sber Java Developer Syllabus.
 * @author: Andrei Beseda
 * @version: 1.0 07/06/2021
 * @nickname: mondrew
 */

package ru.sberjava.lesson12.homework.tree;

import java.io.File;

public class TreeUtil {

    private static int filesCounter = 0;
    private static int dirCounter = 0;
    private static int counter = 0;

    public static void printTree(File[] filesList, int depth) {

        if (depth == 0) {
            System.out.println(".");
            depth++;
        }
        if (filesList == null)
            return ;
        for (File f : filesList) {
            int tmpDepth = depth;
            while (tmpDepth > 1) {
                System.out.print("|\t");
                tmpDepth--;
            }
            System.out.print("|--");
            System.out.println(f.getName());
            if (f.isDirectory()) {
                printTree(f.listFiles(), depth + 1);
                dirCounter++;
            }
            else
                filesCounter++;
        }
    }

    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        File[] filesList = new File(currentDir).listFiles();

        printTree(filesList, 0);
        System.out.println(dirCounter + " directories, " + filesCounter + " files");
        System.out.println(counter);
    }
}

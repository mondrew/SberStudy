/*
 * SimpleFileWork program - testing Java I/O streams (work with files)
 * The 12th (part 1) homework on Sber Java Developer Syllabus.
 * @author: Andrei Beseda
 * @version: 1.0 07/06/2021
 * @nickname: mondrew
 */

package ru.sberjava.lesson12.homework;

import java.io.File;

public class SimpleFileWork {
    public static void main(String[] args) {
        File filename = new File("C:\\Users\\Администратор\\IdeaProjects\\Sber\\lesson12\\src\\ru\\sberjava\\lesson12\\homework\\test");
        System.out.println(filename.exists());

        String absPath = filename.getAbsolutePath();
        String parentPath = filename.getParent();

        System.out.println("Absolute path: " + absPath);
        System.out.println("Parent path: " + parentPath);

        File parent = new File(parentPath);
        File[] parentDir = parent.listFiles();

        for (File f : parentDir) {
            System.out.println(f.getName());
        }
    }
}

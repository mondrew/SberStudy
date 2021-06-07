/*
 * LovaJava program - testing Java I/O streams (work with files)
 * The 12th (part 3) homework on Sber Java Developer Syllabus.
 * @author: Andrei Beseda
 * @version: 1.0 07/06/2021
 * @nickname: mondrew
 */

package ru.sberjava.lesson12.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class LoveJava {
    public static void main(String[] args) throws IOException {
        String currentDir = System.getProperty("user.dir");
        File newFile = new File(currentDir, "loveJava");
        newFile.createNewFile();

        try (Writer writer = new BufferedWriter(new FileWriter(newFile))) {
            writer.write("Люблю Java!");
        }
    }
}

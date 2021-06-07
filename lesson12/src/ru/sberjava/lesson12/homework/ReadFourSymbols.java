/*
 * ReadFourSymbols program - testing Java I/O streams (work with files)
 * The 12th (part 2) homework on Sber Java Developer Syllabus.
 * @author: Andrei Beseda
 * @version: 1.0 07/06/2021
 * @nickname: mondrew
 */

package ru.sberjava.lesson12.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFourSymbols {
    public static void main(String[] args) throws IOException {
        File filename = new File("C:\\Users\\Администратор\\IdeaProjects" +
                "\\Sber\\lesson12\\src\\ru\\sberjava\\lesson12\\homework\\test");
        try (InputStream is = new FileInputStream(filename)) {
            String str = "";
            is.skip(2);
            for (int i = 0; i < 4; i++) {
                str += (char) is.read();
            }
            System.out.println(str);
        }
    }
}

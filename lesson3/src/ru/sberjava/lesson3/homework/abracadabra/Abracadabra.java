package ru.sbrf.school.java.homework.abracadabra;
import java.util.Scanner;

public class Abracadabra {

    public static void  printFrame(long width, long height, String str) {

        String  resStr = "";
        long    i = 0;
        long    j = 0;

        while (j < height) {
            i = 0;
            // The first or the last string
            if (j == 0 || j == height - 1) {
                while (i < width) {
                    resStr += "*";
                    i++;
                }
                resStr += "\n";
            }
            // Text string
            else if ((j == (height - 2) / 2) || (j == 1 && height == 3)) {
                resStr += "*";
                i++;
                while (i <= (width - str.length() - 2) / 2) {
                    resStr += " ";
                    i++;
                }
                resStr += str;
                i += str.length();
                while (i < width - 1) {
                    resStr += " ";
                    i++;
                }
                resStr += "*\n";
            }
            // Empty string
            else {
                resStr += "*";
                while (i < width - 2) {
                    resStr += " ";
                    i++;
                }
                resStr += "*\n";
            }
            j++;
        }
        System.out.print(resStr);
    }

    public static void main(String[] args) {

        Scanner     scanner = new Scanner(System.in);

        System.out.print("Please, enter the frame height: ");
        long        height = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Please, enter the frame width: ");
        long        width = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Please, enter the text: ");
        String      str = scanner.nextLine();

        if (height < 0 || width < 0) {
            System.out.println("Error: wrong arguments");
            return ;
        }
        else if ((height == 0 || width == 0) && str.isEmpty())
            return ;
        else if (str.length() != 0 && str.length() > width - 2 ||
                            (str.length() != 0 && height < 3)) {
            System.out.println("Error: can't fit the text into the frame ");
            return ;
        }
        printFrame(width, height, str);
    }
}

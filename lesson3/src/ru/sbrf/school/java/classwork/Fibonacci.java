package ru.sbrf.school.java.classwork;
import java.util.Scanner;

public class Fibonacci {

    public static long getFibonacci(int n) {
        if (n == 0)
            return (0);
        else if (n == 1 || n == 2)
            return (1);
        else
            return (getFibonacci(n - 1) + getFibonacci(n - 2));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int     n = scanner.nextInt();
        System.out.print("Enter position of Fibonacci sequence: ");
        System.out.print("Fibonacci " + n + " number is: ");
        System.out.println(getFibonacci(n));
    }
}

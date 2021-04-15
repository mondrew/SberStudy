package ru.sbrf.school.java.classwork;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber_lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int     num = rand.nextInt(10);
        int     user_num;
        int     attempt = 5;
        do {
            System.out.print("Guess the number [0; 10): ");
            user_num = scanner.nextInt();
            if (user_num == num)
                System.out.println("You are right!");
            else if (attempt > 0){
                System.out.println("No, try again");
                attempt--;
            }
            else {
                System.out.println("You lose");
            }
        } while (user_num != num);
    }
}

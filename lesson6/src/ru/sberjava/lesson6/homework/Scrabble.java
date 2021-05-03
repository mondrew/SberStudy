/*
 * Scrabble game program - game "Balda"
 * The 6th homework on Sber Java Developer Syllabus.
 * @author: Andrei Beseda
 * @version: 1.0 22/04/2021
 * @nickname: mondrew
 */

package ru.sberjava.lesson6.homework;

import java.util.*;

public class Scrabble {

    private static boolean isCorrectUserWord(String userWord, Set<Character> alphabet) {

        for (Character c : userWord.toLowerCase().toCharArray()) {
            if (!alphabet.contains(c))
                return (false);
        }
        return (true);
    }

    private static void createAlphabet(String baseWord, Set<Character> alphabet) {

        for (Character c : baseWord.toLowerCase().toCharArray())
            alphabet.add(c);
    }

    public static void main(String[] args) {

        Scanner         scanner = new Scanner(System.in);
        Set<Character>  alphabet = new HashSet<Character>();
        List<User>      userSet = new ArrayList<>();
        int             numberOfUsers;
        int             i = 0;
        String          userWord = "A";

        System.out.println("[=====--- Welcome to the Scrabble game! ---=====]");

        System.out.print("Please, enter number of users: ");
        numberOfUsers = scanner.nextInt();
        scanner.nextLine();
        if (numberOfUsers <= 0) {
            System.out.println("Error: invalid number of users. Goodbye!");
            return;
        }
        for (int k = 0; k < numberOfUsers; k++) {
            System.out.print("Please, enter name of player number " + k + ": ");
            String name = scanner.nextLine();
            if (name.isBlank()) {
                System.out.println("Player name can't be blank. Try again.");
                i--;
            }
            else
                userSet.add(new User(name));
        }

        System.out.print("Please, enter any base word to start a game: ");
        String baseWord = scanner.nextLine();
        if (baseWord.isBlank()) {
            System.out.println("Goodbye!");
            return;
        }
        createAlphabet(baseWord, alphabet);
        System.out.println("This game alphabet: " + alphabet);
        System.out.println("The game starts now! To give up enter empty string.");
        System.out.println("Enter the new word made of these letters \""
                                                            + alphabet + "\"");
        while (!userWord.isEmpty() || !userWord.isBlank()) {
            if (numberOfUsers == 0)
                break ;
            while (!userSet.get(i).isActive()) {
                i++;
                if (i == userSet.size())
                    i = 0;
            }
            System.out.print("Player [ " + userSet.get(i).getName() + " ] try: ");
            userWord = scanner.nextLine();
            if (userWord.isEmpty()) {
                System.out.println(userSet.get(i).getName() + " is out.");
                userSet.get(i).setActive(false);
                numberOfUsers--;
                continue ;
            }
            if (isCorrectUserWord(userWord, alphabet)) {
                int j = 0;
                for (User user : userSet) {
                    if (user.getWordsSet().contains(userWord.toLowerCase()))
                        break ;
                    j++;
                }
                if (j == userSet.size()) {
                    userSet.get(i).addWord(userWord.toLowerCase());
                    System.out.println("Correct! Well done!");
                }
                else {
                    System.err.println("Wrong! We already have this word.");
                    System.out.println(userSet.get(i).getName() + " is out.");
                    userSet.get(i).setActive(false);
                    numberOfUsers--;
                }
            }
            else {
                System.err.println("Wrong! Only base word letters are allowed.");
                System.out.println(userSet.get(i).getName() + " is out.");
                userSet.get(i).setActive(false);
                numberOfUsers--;
            }
            i++;
            if (i == userSet.size())
                i = 0;
        }

        System.out.println("The game is over! Results:");
        System.out.println("Guessed words: ");
        for (var user : userSet) {
            System.out.println("=====-----> Player [ " + user.getName() + " ] <-----=====");
            System.out.println("Total score: " + user.getName());
            System.out.println("Words: ");
            user.printWords();
        }
    }
}

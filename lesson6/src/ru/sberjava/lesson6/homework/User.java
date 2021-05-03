package ru.sberjava.lesson6.homework;

import java.util.LinkedHashSet;
import java.util.Set;

public class User {

    private final String        name;
    private int                 numberOfWords;
    private boolean             active;
    private final Set<String>   wordsSet = new LinkedHashSet<String>(); // LinkedHashSet, т.к. нужен порядок

    public User() {
        this.name = "Player";
        this.numberOfWords = 0;
        this.active = true;
    }

    public User(String name) {
        if (name.isBlank())
            this.name = "Player";
        else
            this.name = name;
        this.numberOfWords = 0;
        this.active = true;
    }

    // Getters
    public int getNumberOfWords() {
        return (this.numberOfWords);
    }
    public String getName() {
        return (this.name);
    }
    public Set<String> getWordsSet() {
        return (this.wordsSet);
    }
    public boolean      isActive() {
        return (this.active);
    }

    // Setters
    public void setNumberOfWords(int numberOfWords) {
        this.numberOfWords = numberOfWords;
    }

    public void addWord(String word) {
        this.wordsSet.add(word);
        this.numberOfWords++;
    }
    public void setActive(boolean value) {
        this.active = value;
    }

    public void printWords() {
        for (String word : this.wordsSet)
            System.out.println(word);
    }
}

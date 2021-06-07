package com.zoo.animal;

import com.zoo.exception.NegativeNumberException;
import com.zoo.interfaces.Swim;
import com.zoo.interfaces.Hunt;
import com.zoo.interfaces.Sing;
import com.zoo.interfaces.Count;

import com.zoo.exception.TooBigNumberException;
import com.zoo.exception.WrongTypeException;

public class Dolphin extends Animal implements Swim, Hunt, Sing, Count {

    public Dolphin() { super(); };
    public Dolphin(String name, Integer age, String color, String type)
                        throws NegativeNumberException, WrongTypeException {
        super(name, age, color, type);
    }
    public void say() {
        System.out.println(this.name + ": \"Ki-ki-ki-ki-ki-ki-ki!\"");
    }
    public void eat() {
        System.out.println(this.name + " eats fish: \"Om-nom-nom-nom\"");
    }
    public void makeFun() {
        System.out.println(this.name + ": *jumps out of the water*");
    }
    public void swim() {
        System.out.println(this.name + " is swimming in the sea");
    }
    public void hunt() {
        System.out.println(this.name + " is hunting for fish");
    }
    public int addNumbers(int a, int b) throws NegativeNumberException, TooBigNumberException {
        if (a < 0 || b < 0)
            throw (new NegativeNumberException("Animal doesn't know negative numbers"));
        else if ((a + b) > 5)
            throw (new TooBigNumberException("Dolphin can count only to 5"));
        return (a + b);
    }
    public void sing() {
        System.out.println(this.name + " sings:\n" +
                "\"Kiki, do you love me? Are you riding?\n" +
                "Say you'll never ever leave from beside me\n" +
                "'Cause I want ya, and I need ya\n" +
                "And I'm down for you always\"");
    }
}

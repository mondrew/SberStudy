package com.zoo.animal;

import com.zoo.exception.NegativeNumberException;
import com.zoo.exception.TooBigNumberException;
import com.zoo.exception.WrongTypeException;
import com.zoo.interfaces.Walk;
import com.zoo.interfaces.Run;

public class Elephant extends Animal implements Run, Walk {

    public Elephant() { super(); };
    public Elephant(String name, Integer age, String color, String type)
                        throws NegativeNumberException, WrongTypeException {
        super(name, age, color, type);
    }
    public void say() {
        System.out.println(this.name + ": \"Pawoo!\"");
    }
    public void eat() {
        System.out.println(this.name + " eats watermelon: \"Om-nom-nom-nom\"");
    }
    public void makeFun() {
        System.out.println(this.name + " plays with the ball");
    }
    public void run(int speed) {
        System.out.println(this.name + " runs with speed " + speed + " mph");
    }
    public void walk(float length) {
        System.out.println(this.name + " walks " + length + " meters");
    }
    public int addNumbers(int a, int b) throws NegativeNumberException, TooBigNumberException {
        if (a < 0 || b < 0)
            throw (new NegativeNumberException("Animal doesn't know negative numbers"));
        else if ((a + b) > 3)
            throw (new TooBigNumberException("Elephant can count only to 3"));
        return (a + b);
    }
}

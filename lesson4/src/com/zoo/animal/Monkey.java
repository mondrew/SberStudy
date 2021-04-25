package com.zoo.animal;

import com.zoo.exception.NegativeNumberException;
import com.zoo.exception.TooBigNumberException;
import com.zoo.exception.WrongTypeException;
import com.zoo.interfaces.Jump;
import com.zoo.interfaces.Run;
import com.zoo.interfaces.Walk;
import com.zoo.interfaces.Swim;
import com.zoo.interfaces.Climb;
import com.zoo.interfaces.Count;

public class Monkey extends Animal implements Jump, Run, Swim, Walk, Climb, Count {

    public Monkey() { super(); }
    public Monkey(String name, Integer age, String color, String type)
                        throws NegativeNumberException, WrongTypeException {
        super(name, age, color, type);
    }
    public void say() {
        System.out.println(this.name + ": \"Uh-uh-uh-ah-ah-ah!\"");
    }
    public void eat() {
        System.out.println(this.name + " eats banana: \"Om-nom-nom-nom\"");
    }
    public void makeFun() {
        System.out.println(this.name + ": *is swinging through the trees*");
    }
    public void jump(float height) {
        System.out.println(this.name + " jumps " + height + " meters high");
    }
    public void run(int speed) {
        System.out.println(this.name + " runs with speed " + speed + " mph");
    }
    public void walk(float length) {
        System.out.println(this.name + " walk " + length + " meters");
    }
    public void swim() {
        System.out.println(this.name + " is swimming across the river");
    }
    public void climb(String place) {
        System.out.println(this.name + " climbs on the " + place);
    }
    public int addNumbers(int a, int b) throws NegativeNumberException, TooBigNumberException {
        if (a < 0 || b < 0)
            throw (new NegativeNumberException("Animal doesn't know negative numbers"));
        else if ((a + b) > 10)
            throw (new TooBigNumberException("Monkey can count only to 10"));
        return (a + b);
    }
}

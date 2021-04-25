package com.zoo.animal;

import com.zoo.exception.NegativeNumberException;
import com.zoo.exception.WrongTypeException;
import com.zoo.interfaces.Fly;
import com.zoo.interfaces.Hunt;
import com.zoo.interfaces.Walk;
import com.zoo.interfaces.Jump;
import com.zoo.interfaces.Run;

public class Eagle extends Animal implements Fly, Hunt, Walk, Jump, Run {

    public Eagle() { super(); };
    public Eagle(String name, Integer age, String color, String type)
                        throws NegativeNumberException, WrongTypeException {
        super(name, age, color, type);
    }
    public void say() {
        System.out.println(this.name + ": \"A-a-a-a-a-a-hr!\"");
    }
    public void eat() {
        System.out.println(this.name + " eats a hare: \"Om-nom-nom-nom\"");
    }
    public void makeFun() {
        System.out.println(this.name + " flies high and chilling");
    }
    public void fly() {
        System.out.println(this.name + " is floating in the sky");
    }
    public void hunt() {
        System.out.println(this.name + " is hunting for hares");
    }
    public void walk(float length) {
        System.out.println(this.name + " walk " + length + " meters");
    }
    public void run(int speed) {
        System.out.println(this.name + " runs with speed " + speed + " mph");
    }
    public void jump(float height) {
        System.out.println(this.name + " jumps " + height + " meters high");
    }
}

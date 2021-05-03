package com.zoo.animal;

import com.zoo.exception.NegativeNumberException;
import com.zoo.exception.WrongTypeException;
import com.zoo.interfaces.Jump;
import com.zoo.interfaces.Run;
import com.zoo.interfaces.Walk;
import com.zoo.interfaces.Swim;

public class Zebra extends Animal implements Jump, Run, Walk, Swim {

    public Zebra() { super(); };
    public Zebra(String name, Integer age, String color, String type)
                        throws NegativeNumberException, WrongTypeException {
        super(name, age, color, type);
    }
    public void say() {
        System.out.println(this.name + ": \"Zeeeeeebraaaaaaaaa\"");
    }
    public void eat() {
        System.out.println(this.name + " eats fish: \"Om-nom-nom-nom\"");
    }
    public void makeFun() {
        System.out.println(this.name + ": *running an jumping*");
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
}

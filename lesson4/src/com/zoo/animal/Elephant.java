package com.zoo.animal;

import com.zoo.interfaces.Walk;
import com.zoo.interfaces.Run;

public class Elephant extends Animal implements Run, Walk {

    public Elephant() {};
    public Elephant(String name, Integer age, String color, String type) {
        super(name, age, color, type);
    }
    public void say() {
        System.out.println("Pawoo!");
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
}

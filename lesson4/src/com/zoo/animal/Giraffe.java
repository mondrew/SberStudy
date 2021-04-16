package com.zoo.animal;

import com.zoo.interfaces.Jump;
import com.zoo.interfaces.Run;
import com.zoo.interfaces.Walk;

public class Giraffe extends Animal implements Jump, Run, Walk {

    public Giraffe() {};
    public Giraffe(String name, Integer age, String color, String type) {
        super(name, age, color, type);
    }
    public void say() {
        System.out.println("Hey, I am giraffe!");
    }
    public void eat() {
        System.out.println(this.name + " eats leaves: \"Om-nom-nom-nom\"");
    }
    public void makeFun() {
        System.out.println(this.name + " is dancing and waving head");
    }
    public void jump(float height) {
        System.out.println(this.name + " jumps " + height + " meters high");
    }
    public void run(int speed) {
        System.out.println(this.name + " runs with speed " + speed + " mph");
    }
    public void walk(float length) {
        System.out.println(this.name + " walks " + length + " meters");
    }
}

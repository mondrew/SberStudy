package com.zoo.animal;

import com.zoo.interfaces.Hunt;
import com.zoo.interfaces.Jump;
import com.zoo.interfaces.Run;
import com.zoo.interfaces.Walk;
import com.zoo.interfaces.Swim;
import com.zoo.interfaces.Climb;

public class Lion extends Animal implements Hunt, Jump, Run, Walk, Swim, Climb {

    public Lion() {};
    public Lion(String name, Integer age, String color, String type) {
        super(name, age, color, type);
    }
    public void say() {
        System.out.println("Roar!");
    }
    public void eat() {
        System.out.println(this.name + " eats Zerba: \"Om-nom-nom-nom\"");
    }
    public void makeFun() {
        System.out.println(this.name + " is playing catch-up with tiger");
    }
    public void hunt() {
        System.out.println(this.name + " is hunting for Zebra");
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
}

package com.zoo.animal;

import com.zoo.interfaces.Swim;
import com.zoo.interfaces.Hunt;
import com.zoo.interfaces.Sing;

public class Dolphin extends Animal implements Swim, Hunt, Sing {

    public Dolphin() {};
    public Dolphin(String name, Integer age, String color, String type) {
        super(name, age, color, type);
    }
    public void say() {
        System.out.println("Ki-ki-ki-ki-ki-ki-ki!");
    }
    public void eat() {
        System.out.println(this.name + " eats fish: \"Om-nom-nom-nom\"");
    }
    public void makeFun() {
        System.out.println(this.name + ": jumps out of the water");
    }
    public void swim() {
        System.out.println(this.name + " is swimming in the sea");
    }
    public void hunt() {
        System.out.println(this.name + " is hunting for fish");
    }
    public void sing() {
        System.out.println(this.name +
                ": Kiki, do you love me? Are you riding?\n" +
                "Say you'll never ever leave from beside me\n" +
                "'Cause I want ya, and I need ya\n" +
                "And I'm down for you always");
    }
}

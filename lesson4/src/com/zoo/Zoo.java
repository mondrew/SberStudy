package com.zoo;

import com.zoo.animal.*;

public class Zoo {

    public static void main(String[] args) {

        Dolphin dolphin = new Dolphin("Dolphin Jack", 3, "grey", "carnivore");
        Eagle eagle = new Eagle("Eagle Bob", 2, "brown", "carnivore");
        Elephant elephant = new Elephant("Elephant Lucy", 5, "grey", "herbivore");
        Giraffe giraffe = new Giraffe("Giraffe Kevin", 4, "yellow", "herbivore");
        Lion lion = new Lion("Lion Simba", 6, "yellow", "carnivore");
        Monkey monkey = new Monkey("Monkey Kong", 1, "black", "herbivore");
        Zebra zebra = new Zebra("Zebra Sam", 3, "stripped", "herbivore");

        dolphin.introduce();
        dolphin.say();
        dolphin.hunt();
        dolphin.eat();
        dolphin.sing();
        dolphin.makeFun();
        dolphin.swim();

        eagle.introduce();
        eagle.say();
        dolphin.hunt();
        eagle.sleep();
        eagle.makeFun();
        eagle.fly();

        elephant.introduce();
        elephant.say();
        elephant.eat();
        elephant.makeFun();
        elephant.walk(5);

        giraffe.introduce();
        giraffe.say();
        giraffe.jump(0.1f);
        giraffe.makeFun();
        giraffe.run(15);

        lion.introduce();
        lion.say();
        lion.hunt();
        lion.run(20);
        lion.climb("rock");

        monkey.introduce();
        monkey.say();
        monkey.makeFun();
        monkey.climb("coconut tree");

        zebra.introduce();
        zebra.say();
        zebra.eat();
        zebra.makeFun();
        zebra.run(30);
    }
}

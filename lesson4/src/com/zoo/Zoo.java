/*
 * Zoo program - printing string in the frame
 * The 4-5th homework on Sber Java Developer Syllabus.
 * @author: Andrei Beseda
 * @version: 1.0 15/04/2021
 * @nickname: mondrew
 */

package com.zoo;

import com.zoo.animal.*;
import com.zoo.exception.*;

public class Zoo {

    public static void main(String[] args) {
        createAnimals();
        createOneAviary();
        createFewAviaries();
    }

    public static void createAnimals() {
        // PART I & II - Create Animals and handle all Exceptions
        Dolphin dolphin;
        Eagle eagle;
        Elephant elephant;
        Giraffe giraffe;
        Lion lion;
        Monkey monkey;
        Zebra zebra;
        // Note: Simple Dolphin dolphin = new Dolphin(...) in 'try' block
        // doesn't works 'cause dolphin was created inside the 'try' block
        // and is invisible from the outside!
        System.out.println("========================== [ Welcome to the Zoo ] =================================");
        try {
            System.out.println("--------------Animals creation start-------------");
            dolphin = new Dolphin("Dolphin Jack", 3, "grey", "carnivore");
            eagle = new Eagle("Eagle Bob", 2, "brown", "carnivore");
            elephant = new Elephant("Elephant Lucy", 5, "grey", "herbivore");
            giraffe = new Giraffe("Giraffe Kevin", 4, "yellow", "herbivore");
            lion = new Lion("Lion Simba", 6, "yellow", "carnivore");
            monkey = new Monkey("Monkey Kong", 1, "black", "herbivore");
            zebra = new Zebra("Zebra Sam", 3, "stripped", "herbivore");
            System.out.println("----------All animals have been created----------");
        }
        catch (NegativeNumberException | WrongTypeException e) {
            System.err.println("Error while creating an Animal: " + e.getMessage());
            return ;
        }
        System.out.println();

        System.out.println("<<<<<<<<<<<<<<<<<<<< Dolphin >>>>>>>>>>>>>>>>>>>>");
        dolphin.introduce();
        dolphin.say();
        dolphin.hunt();
        dolphin.eat();
        dolphin.sing();
        dolphin.makeFun();
        dolphin.swim();
        System.out.println();

        System.out.println("<<<<<<<<<<<<<<<<<<<< Eagle >>>>>>>>>>>>>>>>>>>>");
        eagle.introduce();
        eagle.say();
        eagle.hunt();
        eagle.sleep("tree");
        eagle.makeFun();
        eagle.fly();
        System.out.println();

        System.out.println("<<<<<<<<<<<<<<<<<<<< Elephant >>>>>>>>>>>>>>>>>>>>");
        elephant.introduce();
        elephant.say();
        elephant.eat();
        elephant.makeFun();
        elephant.walk(5);
        System.out.println();

        System.out.println("<<<<<<<<<<<<<<<<<<<< Giraffe >>>>>>>>>>>>>>>>>>>>");
        giraffe.introduce();
        giraffe.say();
        giraffe.jump(0.1f);
        giraffe.makeFun();
        giraffe.run(15);
        giraffe.sleep();
        System.out.println();

        System.out.println("<<<<<<<<<<<<<<<<<<<< Lion >>>>>>>>>>>>>>>>>>>>");
        lion.introduce();
        lion.say();
        lion.hunt();
        lion.run(20);
        lion.climb("rock");
        System.out.println();

        System.out.println("<<<<<<<<<<<<<<<<<<<< Monkey >>>>>>>>>>>>>>>>>>>>");
        monkey.introduce();
        monkey.say();
        monkey.makeFun();
        monkey.climb("coconut tree");
        System.out.println();

        System.out.println("<<<<<<<<<<<<<<<<<<<< Zebra >>>>>>>>>>>>>>>>>>>>");
        zebra.introduce();
        zebra.say();
        zebra.eat();
        zebra.makeFun();
        zebra.run(30);
        System.out.println();

        System.out.println("[!!!!!!!!!!] ---> Now let's ask most smart animals to count! <--- [!!!!!!!!!!]");
        try {
            System.out.println("Dolphin counts 3 + 2: " + dolphin.addNumbers(3, 2));
            System.out.println("Elephant counts 1 + 1: " + elephant.addNumbers(1, 1));
            System.out.println("Monkey counts 3 + 5: " + monkey.addNumbers(3, 5));
        }
        catch (NegativeNumberException | TooBigNumberException e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println();
    }

    private static void createOneAviary() {
        // PART III - Create Aviaries for Animals
        // Create Aviary
        Aviary aviary = new Aviary(6);

        // Create Animals
        Dolphin dolphin;
        Eagle eagle;
        Elephant elephant;
        Giraffe giraffe;
        Lion lion;
        Monkey monkey;
        Zebra zebra;

        System.out.println("======================= [ Welcome to the Zoo Aviary! ] ==============================");
        try {
            System.out.println("--------------Animals creation start-------------");
            dolphin = new Dolphin("Dolphin Jack", 3, "grey", "carnivore");
            eagle = new Eagle("Eagle Bob", 2, "brown", "carnivore");
            elephant = new Elephant("Elephant Lucy", 5, "grey", "herbivore");
            giraffe = new Giraffe("Giraffe Kevin", 4, "yellow", "herbivore");
            lion = new Lion("Lion Simba", 6, "yellow", "carnivore");
            monkey = new Monkey("Monkey Kong", 1, "black", "herbivore");
            zebra = new Zebra("Zebra Sam", 3, "stripped", "herbivore");
            System.out.println("----------All animals have been created----------");
        }
        catch (NegativeNumberException | WrongTypeException e) {
            System.err.println("Error while creating an Animal: " + e.getMessage());
            return ;
        }
        System.out.println();

        System.out.println("----------========== > Aviary creation < ==========----------");
        try {
            aviary.add(monkey);
            aviary.add(zebra);
            aviary.add(giraffe);
            //aviary.add(giraffe);
            aviary.add(eagle);
            aviary.add(elephant);
            aviary.add(lion);
            //aviary.add(dolphin);
            aviary.remove(lion);
        }
        catch (AnimalAlreadyExistsException | AviaryIsFullException e) {
            System.out.println("Error: " + e.getMessage());
        }
        aviary.print();
        System.out.println();
    }

    public static void createFewAviaries() {

        // PART IV - Create Array of Aviaries for Animals

        // Create Aviary array
        AviaryArray aviaryArray = new AviaryArray(5);

        // Create Animals
        Dolphin dolphin;
        Eagle eagle;
        Elephant elephant;
        Giraffe giraffe;
        Lion lion;
        Monkey monkey;
        Zebra zebra;

        System.out.println("======================= [ Welcome to the Zoo Aviary Street! ] ==============================");
        try {
            System.out.println("--------------Animals creation start-------------");
            dolphin = new Dolphin("Dolphin Jack", 3, "grey", "carnivore");
            eagle = new Eagle("Eagle Bob", 2, "brown", "carnivore");
            elephant = new Elephant("Elephant Lucy", 5, "grey", "herbivore");
            giraffe = new Giraffe("Giraffe Kevin", 4, "yellow", "herbivore");
            lion = new Lion("Lion Simba", 6, "yellow", "carnivore");
            monkey = new Monkey("Monkey Kong", 1, "black", "herbivore");
            zebra = new Zebra("Zebra Sam", 3, "stripped", "herbivore");
            System.out.println("----------All animals have been created----------");
        }
        catch (NegativeNumberException | WrongTypeException e) {
            System.err.println("Error while creating an Animal: " + e.getMessage());
            return ;
        }
        System.out.println();

        System.out.println("----------========== > Add animals to different Aviaries < ==========----------");
        try {
            aviaryArray.add(monkey, 0);

            aviaryArray.add(monkey, 1);
            aviaryArray.add(zebra, 1);
            aviaryArray.add(elephant, 1);

            aviaryArray.add(monkey, 2);
            aviaryArray.add(elephant, 2);

            aviaryArray.add(monkey, 3);
            aviaryArray.add(giraffe, 3);

            aviaryArray.add(elephant, 4);
            aviaryArray.add(lion, 4);
            aviaryArray.add(eagle, 4);

            // aviaryArray.add(eagle, 5);
        }
        catch (NoSuchAviaryException | AviaryIsFullException | AnimalAlreadyExistsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        aviaryArray.print();
        System.out.println();
    }
}

package com.zoo.animal;
import com.zoo.exception.NegativeNumberException;
import com.zoo.exception.WrongTypeException;

public abstract class Animal {

    protected String  name;
    protected Integer age;
    protected String  color;
    protected String  type; // carnivore or herbivore

    public Animal() {} // why it doesn't overriding parameterized constructor?
    public Animal(String name, Integer age, String color, String type)
                        throws NegativeNumberException, WrongTypeException {
        this.name = name;
        if (age < 0)
            throw (new NegativeNumberException("Animal's age can't be negative"));
        this.age = age;
        this.color = color;
        if (!type.equals("carnivore") && !type.equals("herbivore"))
            throw (new WrongTypeException("Animal can be only carnivore or herbivore"));
        this.type = type;
        System.out.println("One little " + this.name + " has been born");
    }

    public abstract void say();

    // Common methods: eat() and makeFun()
    public abstract void makeFun();
    public abstract void eat();

    public void sleep() {
        System.out.println(this.name + ": \"Z-z-z-z-z-z...\"");
    }

    public void sleep(String place) {
        System.out.println(this.name + " is sleeping at " + place);
    }

    public void introduce() {
        System.out.print("I am " + this.name + ".");
        System.out.print(" I am " + this.age + " year(s) old.");
        System.out.print(" My color is " + this.color + ".");
        System.out.println(" I am " + this.type + ".");
    }

    // Getters
    public String getName() {
        return (this.name);
    }

    public Integer getAge() {
        return (this.age);
    }

    public String getColor() {
        return (this.color);
    }

    public String getType() {
        return (this.type);
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }
}
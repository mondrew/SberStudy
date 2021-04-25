package com.zoo;

import com.zoo.animal.Animal;
import com.zoo.exception.AnimalAlreadyExistsException;
import com.zoo.exception.AviaryIsFullException;
import java.util.LinkedList;
import java.util.List;

public class Aviary {

    private final List<Animal>  animalList;
    private int                 maxCapacity;
    private final int           number;

    public Aviary() {
        this.animalList = new LinkedList<>();
        this.maxCapacity = 5;
        this.number = 0;
    }

    public Aviary(int maxCapacity) {
        this.animalList = new LinkedList<>();
        this.maxCapacity = maxCapacity;
        this.number = 0;
    }

    public Aviary(int maxCapacity, int number) {
        this.animalList = new LinkedList<>();
        this.maxCapacity = maxCapacity;
        this.number = number;
    }

    public void add(Animal animal) throws AnimalAlreadyExistsException,
                                                        AviaryIsFullException {
        if (this.animalList.size() == this.maxCapacity)
            throw (new AviaryIsFullException("Can't add " +
                                            animal + ". The Aviary is full."));
        else if (animalList.contains(animal))
            throw (new AnimalAlreadyExistsException(animal +
                                            " already exists in the Aviary."));
        else
            animalList.add(animal);
    }
    public void remove(Animal animal) {
        animalList.remove(animal);
    }

    public void print() {
        if (this.animalList.isEmpty())
            System.out.println("The Aviary is empty.");
        else {
            System.out.println(":::::::Aviary contains following Animals :::::::");
            for (Animal animal : animalList)
                System.out.println("[ " + animal.getName() + " ]");
        }
    }

    // Getters
    public List<Animal> getAnimalList() {
        return (this.animalList);
    }

    public int  size() {
        return (animalList.size());
    }

    public int getMaxCapacity() {
        return (this.maxCapacity);
    }

    public int getNumber() {
        return (this.number);
    }

    // Setters
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}

package com.zoo;

import com.zoo.animal.Animal;
import com.zoo.exception.AnimalAlreadyExistsException;
import com.zoo.exception.AviaryIsFullException;
import com.zoo.exception.NoSuchAviaryException;

import java.util.ArrayList;
import java.util.List;

public class AviaryArray {

    private final List<Aviary>  aviaryArray = new ArrayList<>();
    private final int           size;

    public AviaryArray() {
        this.size = 5;
        for (int i = 0; i < this.size; i++)
            this.aviaryArray.add(new Aviary(10, i));
    }

    public AviaryArray(int size) {
        this.size = size;
        for (int i = 0; i < this.size; i++) {
            this.aviaryArray.add(new Aviary(10, i));
        }
    }

    public int size() {
        return (this.size);
    }

    public void add(Animal animal, int aviaryNumber) throws NoSuchAviaryException,
                                                            AviaryIsFullException,
                                                            AnimalAlreadyExistsException {
        if (aviaryNumber >= this.size())
            throw (new NoSuchAviaryException(aviaryNumber + ": no such Aviary number."));
        else
            this.aviaryArray.get(aviaryNumber).add(animal);
    }

    public void remove(Animal animal, int aviaryNumber) throws NoSuchAviaryException {
        if (aviaryNumber >= this.size())
            throw (new NoSuchAviaryException(aviaryNumber + ": no such Aviary number."));
        else
            this.aviaryArray.get(aviaryNumber).remove(animal);
    }

    public void print() {
        System.out.println("{ Aviary Array contains " + this.size() + " aviaries }");
        for (Aviary aviary : aviaryArray) {
            System.out.println("------->>>>>>> Aviary number [ " + aviary.getNumber() + " ] <<<<<<<--------");
            aviary.print();
            System.out.println();
        }
    }

    // Getters
    public List<Aviary> getArray() {
        return (this.aviaryArray);
    }

    public int getSize() {
        return (size);
    }
}

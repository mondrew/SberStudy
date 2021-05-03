package com.zoo.interfaces;

import com.zoo.exception.NegativeNumberException;
import com.zoo.exception.TooBigNumberException;

public interface Count {

    int addNumbers(int a, int b) throws TooBigNumberException, NegativeNumberException;
}

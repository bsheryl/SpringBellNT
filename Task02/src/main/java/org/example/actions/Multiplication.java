package org.example.actions;

import org.springframework.stereotype.Component;

@Component("multiplication")
public class Multiplication implements Action {
    @Override
    public float apply(float firstNumber, float secondNumber) {
        return firstNumber * secondNumber;
    }
}

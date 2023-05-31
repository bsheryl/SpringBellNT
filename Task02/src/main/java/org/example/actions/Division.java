package org.example.actions;

import org.springframework.stereotype.Component;

@Component("division")
public class Division implements Action {
    @Override
    public float apply(float firstNumber, float secondNumber) {
        return firstNumber / secondNumber;
    }
}

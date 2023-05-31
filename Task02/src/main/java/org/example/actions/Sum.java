package org.example.actions;

import org.springframework.stereotype.Component;


@Component("sum")
public class Sum implements Action {
    private float result;
    @Override
    public float apply(float firstNumber, float secondNumber) {
        return firstNumber + secondNumber;
    }
}

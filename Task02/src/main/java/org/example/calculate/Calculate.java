package org.example.calculate;

import lombok.Getter;
import lombok.Setter;
import org.example.actions.Action;

import java.util.Map;

@Setter
@Getter
public class Calculate {
    private float firstNumber;
    private float secondNumber;
    private String sign;
    private Map<String, Action> actions;

    public Calculate(float firstNumber, float secondNumber, String sign) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.sign = sign;
    }

    public float calculate() {
        return actions.get(sign).apply(firstNumber, secondNumber);
    }
}

package core.actions;

import org.springframework.stereotype.Component;

@Component("subtraction")
public class Subtraction implements Action {
    @Override
    public float apply(float firstNumber, float secondNumber) {
        return firstNumber - secondNumber;
    }
}

package core.reader;

import core.calculate.Calculate;

import java.util.Scanner;

public class Reader {
    public static Calculate read() {
        Scanner scanner = new Scanner(System.in);
        float firstNumber = scanner.nextFloat();
        float secondNumber = scanner.nextFloat();
        String sign = scanner.next();
        return new Calculate(firstNumber, secondNumber, sign);
    }
}

package Calc_in_OOP;

import java.util.Scanner;

public class NumbersListener {
    static Scanner scanner = new Scanner(System.in);

    public float GetNumber() {
        System.out.println("Введите число: ");
        float number;
        if (scanner.hasNextFloat()) {
            number = scanner.nextFloat();
        } else {
            System.out.println("Вы ввели неверные данные, попробуйте еще раз");
            scanner.next();
            number = GetNumber();
        }
        return number;
    }
}

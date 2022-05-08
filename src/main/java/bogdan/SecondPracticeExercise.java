/**
 * created on 07.05.2022
 *
 * @author Першин Богдан
 */
package bogdan;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class SecondPracticeExercise {
    public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    /**
     * @return Возвращает число введенное пользователем с консоли.
     * Если пользователь вводит некорректные данные, то пользователю показывается предупреждение и метод отрабатывает снова.
     * ВАЖНО! Числа вводятся через точку, а не зяпятую, добавил локаль US для удобства
     */
    public static float GetNumber() {
        System.out.println("Введите число: ");
        float number = 0;
        if (scanner.hasNextFloat()) {
            number = scanner.nextFloat();
        } else {
            System.out.println("Вы ввели неверные данные, попробуйте еще раз");
            scanner.next();
            number = GetNumber();
        }
        return number;
    }

    /**
     * Метод получает введенный с консоли математический оператор
     *
     * @return Возвращает чар (математический оператор) введенный пользователем
     * Если пользователь ввел что то НЕ из перечисленных операторов, то метод выполняется еще раз
     * до тех пор,пока не будет введено корректное значение.
     */
    public static char GetOperator() {
        System.out.println("Введите математический оператор ( + , - , / ,* ): ");
        char operator = ' ';
        if (scanner.hasNext()) {
            operator = scanner.next().charAt(0);
            switch (operator) {
                case '+':
                case '-':
                case '/':
                case '*': {
                    System.out.println("Вы выбрали операцию: " + operator);
                    break;
                }
                default:
                    System.out.println("Оператор не распознан, попробуйте еще раз!");
                    operator = GetOperator();
                    break;
            }
        }
        return operator;
    }

    /**
     * Метод калькулятора
     *
     * @param firsNum   Первое число float для расчетов
     * @param secondNum Второе число float для расчетов
     * @param operator  Чар, представляет собой мат оператор , один из (+,-,/,*)
     * @return Возвращает резултат математической операци в зависимости от оператора
     */

    public static float Calc(float firsNum, float secondNum, char operator) {
        float result = 0;

        if (operator == '+') {
            result = firsNum + secondNum;
        } else if (operator == '-') {
            result = firsNum - secondNum;
        } else if (operator == '/') {
            result = firsNum / secondNum;
        } else if (operator == '*') {
            result = firsNum * secondNum;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Выберите что будем делать. 1 - Калькулятор. 2 - Поиск самого длинного слова из нескольких слов");
        int whatToDo = scanner.nextInt();
        switch (whatToDo) {
            case 1: {
                System.out.printf("%.4f", Calc(GetNumber(), GetNumber(), GetOperator()));
                break;
            }
            case 2: {
                System.out.println("Введите кол-во слов: ");
                Scanner scanner = new Scanner(System.in);
                int countOfWords = scanner.nextInt();
                String[] myArray = new String[countOfWords];
                for (int i = 0; i < myArray.length; i++) {
                    System.out.println("Введите " + (i + 1) + " cлово: ");
                    myArray[i] = scanner.next();
                }
                System.out.println("Самое длинное слово из введенных: " +
                        Arrays.stream(myArray)
                                .max(Comparator.comparing(String::length))
                                .get());
                break;
            }
            default: {
                System.out.println("Данные не распознаны, перезапустите программу и повторите ввод");
            }
        }
    }
}

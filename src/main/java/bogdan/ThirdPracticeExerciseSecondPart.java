package bogdan;

import java.util.stream.Stream;

public class ThirdPracticeExerciseSecondPart {
    public static void main(String[] args) {
        Biscuit biscuitOne = new Biscuit("Печенье", 0.6, 1.3, "Имбирное");
        Candy candyOne = new Candy("Кофета", 0.2, 0.7, "Шоколадная");
        Jellybean jellybeanOne = new Jellybean("Жевательная конфета", 0.3, 0.1, 2);

        Jellybean jellybeanTwo = new Jellybean();
        jellybeanTwo.setSize(1);
        jellybeanTwo.setName("Жесткая жевательная конфета");
        jellybeanTwo.setWeight(1);
        jellybeanTwo.setPrice(0.234);

        BaseCandy[] sweetGift = {biscuitOne, candyOne, jellybeanOne, jellybeanTwo};
        double weightOfGift = 0;
        double costOfGift = 0;
        for (BaseCandy someGift : sweetGift
        ) {
            weightOfGift += someGift.getWeight();
            costOfGift += someGift.getPrice();
        }
        System.out.println("Информация о сладостях в подарке: ");
        Stream.of(sweetGift).forEach(a -> System.out.println(a.PrintInfo()));
        System.out.println("[Общий вес подарка]: " + weightOfGift + "\n" + "[Общая стоимость подарка]: " + costOfGift);
    }
}

package bogdan;

public class ThirdPracticeExerciseFirstPart {
    public static void main(String[] args) {
        int intArray[] = new int[20];
        int indexOfMaxNegative = 0;
        int indexOfMinPositive = 0;
        int maxNegative = -10;
        int minPositive = 10;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) Math.round((Math.random() * 20) - 10);
            System.out.print(intArray[i] + " ");
            if (intArray[i] < 0 & intArray[i] > maxNegative) {
                maxNegative = intArray[i];
                indexOfMaxNegative = i;
            }
            if (intArray[i] > 0 & intArray[i] < minPositive) {
                minPositive = intArray[i];
                indexOfMinPositive = i;
            }
        }
        System.out.println("");
        System.out.println("Максимальный отрицательный эллемент массива: " + maxNegative + " Под индексом [" + indexOfMaxNegative + "]");
        System.out.println("Минимальный положительный эллемент массива: " + minPositive + " Под индексом [" + indexOfMinPositive + "]");
        int tmp = maxNegative;
        intArray[indexOfMinPositive] = tmp;
        intArray[indexOfMaxNegative] = minPositive;
        for (int j : intArray) {
            System.out.print(j + " ");
        }
    }
}

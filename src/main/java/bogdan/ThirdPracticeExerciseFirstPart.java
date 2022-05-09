package bogdan;
public class ThirdPracticeExerciseFirstPart {
    public static void main(String[] args) {
        int intArray[] = new int[20];
        int min = 0;
        int indexOfMin = 0;
        int max = 0;
        int indexOfMax = 0;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) Math.round((Math.random() * 20) - 10);
            System.out.print(intArray[i] + " ");
            if (min > intArray[i]) {
                min = intArray[i];
                indexOfMin = i;
            }
            if (max < intArray[i]) {
                max = intArray[i];
                indexOfMax = i;
            }
        }
        System.out.println("");
        System.out.println("Минимальное значение [" + min + "]" + " Индекс минимального элемента: " + indexOfMin);
        System.out.println("Максимальное значение [" + max + "]" + " Индекс максимального элемента: " + indexOfMax);

        int tmp = min;
        intArray[indexOfMax] = tmp;
        intArray[indexOfMin] = max;

        for (int j : intArray) {
            System.out.print(j + " ");
        }
    }
}

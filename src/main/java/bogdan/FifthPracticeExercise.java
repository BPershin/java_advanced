package bogdan;

import java.io.*;
import java.util.*;


public class FifthPracticeExercise {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = null;
        final String path = "C:\\Users\\Богдан\\Documents\\GitHub\\java_advanced\\src\\main\\java\\bogdan\\myFile.txt";
        fileReader = new BufferedReader(new FileReader(path));
        String line = fileReader.readLine();
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(line.split(" ")));
        Collections.sort(arrayList); // Сортировка по алфавиту
        System.out.println(arrayList); // Вывод отсортированного
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        for (String a : arrayList //Добавляем как ключ само слово, значение - кол-во вхождений;
        ) {
            count = Collections.frequency(arrayList, a);
            map.put(a, count);
        }
        
        System.out.println(map);
        int maxValueOfMap = (Collections.max(map.values()));
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValueOfMap) {
                System.out.println("Слово с найбольшим количеством повторений: " + entry.getKey()
                        + "\n" + "Кол-во повторений: " + entry.getValue());
            }
        }
    }
}


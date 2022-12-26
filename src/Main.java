import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private static final Map<String, Integer> strMap = new HashMap<>();
    private static final Map<String, List<Integer>> listMap = new HashMap<>();

    private static final Map<Integer, String> someMap = new LinkedHashMap<>();

    public static void addNumber(String s, Integer i) {
        if (strMap.containsKey(s) && strMap.containsKey(i)) {
            throw new RuntimeException(strMap + " ключ уже есть и значение совпадает");
        }
        strMap.put(s, i);
    }

    public static Integer sum(List<Integer> list) {
        Integer sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("ДЗ 23 Задание 3");
        System.out.println();

        addNumber("one", 1);
        addNumber("two", 2);
        addNumber("three", 3);
        addNumber("four", 4);
        addNumber("five", 5);

        for (Map.Entry<String, Integer> integerStringEntry : strMap.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " : " + integerStringEntry.getValue());
        }

        System.out.println();
        System.out.println("ДЗ 23 Задание 4");
        System.out.println();

        listMap.put("string1", List.of(1,6,12));
        listMap.put("string2", List.of(200,150,350));
        listMap.put("string3", List.of(300,350,370));
        listMap.put("string4", List.of(400,450,470));
        listMap.put("string5", List.of(500,550,570));

        Map<String, Integer> listMap1 = new HashMap<>();
        for (Map.Entry<String, List<Integer>> stringListEntry : listMap.entrySet()) {
            listMap1.put(stringListEntry.getKey(), sum(stringListEntry.getValue()));
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : listMap1.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " : " + stringIntegerEntry.getValue());
        }
        System.out.println();
        System.out.println("ДЗ 23 Задание 5");
        System.out.println();

        someMap.put(1, "one");
        someMap.put(2, "two");
        someMap.put(3, "three");
        someMap.put(4, "four");
        someMap.put(5, "five");

        for (Map.Entry<Integer, String> integerStringEntry : someMap.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " : " + integerStringEntry.getValue());
        }
    }
}
import java.util.*;

public class Main {
    private static Object collectionList;

    public static void main(String[] args) {
        Map<String, List<Integer>> element = new HashMap<>();
        String list = "Строка";
        for (int i = 0; i < 5; i++) {
            List<Integer> integerList = new ArrayList<>();
            integerList.add((int) (Math.random() * 1000));
            integerList.add((int) (Math.random() * 1000));
            integerList.add((int) (Math.random() * 1000));
            element.put(list + i, integerList);
        }
        System.out.println(element);

        Map<String, Integer> collection = new HashMap<>();
        for (String name : element.keySet()) {
            int sumIntegerList = 0;
            List<Integer> option = element.get(name);
            for (Integer integer : option) {
                sumIntegerList = sumIntegerList + integer;
            }
            collection.put(name, sumIntegerList);
        }
        System.out.println(collection);
    }
}
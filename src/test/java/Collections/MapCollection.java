package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    Map<Integer, String> map = new HashMap<>();

    int i = 0;
    public void addToMap(int amount) {
        while(i < amount) {
            map.put(i, "Элемент с номером " + i + " добавлен");
            i++;
        }
        System.out.println("Добавлено элементов в Map: " + amount);
    }

    public  void searchMapItem(int number) {
        if(!(map.containsKey(number))) {
            System.out.println("Элемент с ключом " + number + " отсутствует");
        } else {
            System.out.println("Элемент: " + map.get(number) + " найден");
        }
    }

    public  void deleteMapItem(int number) {
        if(!(map.containsKey(number))) {
            System.out.println("Элемент с ключом " + number + " отсутствует");
        } else {
            System.out.println("Элемент: " + map.get(number) + " удален");
            map.remove(number);
        }
    }
}

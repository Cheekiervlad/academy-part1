package by.academy.tasks.collections;

//8.Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product).
// Перебрать и распечатать пары значений - entrySet().
// Перебрать и распечатать набор из имен продуктов  - keySet().
// Перебрать и распечатать значения продуктов - values().
// Для каждого перебора создать свой метод.

import by.academy.deal.domain.products.Meat;
import by.academy.deal.domain.products.Product;

import java.util.HashMap;
import java.util.Map;

public class Task8 {
    public static void main(String[] args) {
        Map<String, Product> productMap = new HashMap<>();
        productMap.put("Самолет", new Meat());
        productMap.put("Вертолет", new Meat());
        productMap.put("Аэроплан", new Meat());
        entrySet(productMap);
        keySet(productMap);
        values(productMap);
    }

    private static void entrySet(Map<?, ?> map) {
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + " value:" + entry.getValue());
        }
    }

    private static void keySet(Map<String, ?> map) {
        for (String key : map.keySet()) {
            System.out.println("key: " + key);
        }
    }

    private static void values(Map<String, ?> map) {
        for (String key : map.keySet()) {
            System.out.println("key: " + map.get(key));
        }
    }
}

package homework.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, Fruit> fruitShop = new HashMap<>();
        Fruit watermelon = new Fruit("Watermelon", 15.6);
        Fruit lemon = new Fruit("Lemon", 12.8);
        Fruit apple = new Fruit("Apple", 5.4);
        Fruit orange = new Fruit("Orange", 7.2);
        Fruit lime = new Fruit("Lime", 4.1);
        Fruit avocado = new Fruit("Avocado", 5.1);


        fruitShop.put("George", watermelon);
        fruitShop.put("Vitaila", lemon);
        fruitShop.put("Petia", apple);
        fruitShop.put("Gregor", orange);
        fruitShop.put("Vasia", lime);


        //    System.out.println("fruitShop.get(\"Vitalia\") = " + fruitShop.get("Vitalia"));

        //    fruitShop.remove("Gregor", orange);

        //    System.out.println("fruitShop.containsKey(\"George\") = " + fruitShop.containsKey("George"));
        //    System.out.println("fruitShop.containsValue(orange) = " + fruitShop.containsValue(orange));

        System.out.println("_____________________");
        for (String keyCustomer : fruitShop.keySet()) {
            System.out.println(keyCustomer + ": " + fruitShop.get(keyCustomer));

        //    }

        System.out.println("_____________________");
        for (Fruit values : fruitShop.values()) {
            System.out.println(values + ": " + fruitShop.get(values));
        }

        System.out.println("______________________");

        //    for (Map.Entry<String, Fruit> pair : fruitShop.entrySet()){
        //        System.out.println(pair.getKey() + ": " + pair.getValue());
        //    }
        System.out.println("Iterator practice: ");
        System.out.println("Количество покупателей, чье имя больше 5: ");
        Iterator<String> iterator = fruitShop.keySet().iterator();
        int count = 0;
        while (iterator.hasNext()) {
            String keyCustomer = iterator.next();
            if (keyCustomer.length() > 5) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("Кол-во фруктов, которые равны apple: ");

        Iterator<Fruit> valuesIterator = fruitShop.values().iterator();
        int fruitsCount = 0;
        while (valuesIterator.hasNext()) {
            Fruit values = valuesIterator.next();
            if (values.equals(apple)) {
                fruitsCount++;
            }
        }
        System.out.println(fruitsCount);

        System.out.println("Пропустить 2 элемента со значением watermelon: ");

        Iterator<Fruit> miss2Elem = fruitShop.values().iterator();
        int elemCount = 0;
        while (miss2Elem.hasNext()) {
            Fruit values = miss2Elem.next();
            if (values.getType().equals("Watermelon") && elemCount < 2) {
                elemCount++;
            } else {
                System.out.println(values);
            }
        }

        System.out.println("Пропустить элементы начинающиеся на А: ");

        Iterator<Fruit> missAelem = fruitShop.values().iterator();
        int letterCount = 0;
        while (missAelem.hasNext()) {
            Fruit values = missAelem.next();
            if (values.getType().startsWith("A") && letterCount < 2) {
                letterCount++;
            } else {
                System.out.println(values);
            }
        }
        System.out.println("Вернуть первый элемент значение которого Watermelon/watermelon/WATERMElOn: ");

        Iterator<Fruit> firstElem = fruitShop.values().iterator();

        while (firstElem.hasNext()) {
            Fruit values = firstElem.next();
            if (values.getType().equals("Watermelon") || values.getType().equals("WATERMElOn")) {
                System.out.println(values);
                break;
            }
        }

        System.out.println("Вернуть все элементы в другую карту: ");

        Map<String, Fruit> movedFruits = new HashMap<>();

        movedFruits.putAll(fruitShop);
        System.out.println(movedFruits);

        System.out.println("Средний вес всех фруктов: ");

        Iterator<Fruit> averageWeight = fruitShop.values().iterator();
        double weightCount = 0.0;
        double sumWeight = 0.0;
        while (averageWeight.hasNext()) {
            Fruit values = averageWeight.next();
            if (values.getWeight() != 0) {
                sumWeight += values.getWeight();
                weightCount++;
            }
        }
        System.out.println(sumWeight / weightCount);

    }
}
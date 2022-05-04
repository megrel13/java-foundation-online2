package homework.map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, Fruit> fruitShop = new HashMap<>();
        Fruit watermelon = new Fruit("Watermelon", 15.6);
        Fruit lemon = new Fruit("Lemon", 12.8);
        Fruit apple = new Fruit("Apple", 5.4);
        Fruit orange = new Fruit("Orange", 7.2);
        Fruit lime = new Fruit("Lime", 4.1);


        fruitShop.put("George", watermelon);
        fruitShop.put("Vitaila", lemon);
        fruitShop.put("Petia", apple);
        fruitShop.put("Gregor", orange);
        fruitShop.put("Vasia", lime);


        System.out.println("fruitShop.get(\"Vitalia\") = " + fruitShop.get("Vitalia"));

        fruitShop.remove("Gregor", orange);

        System.out.println("fruitShop.containsKey(\"George\") = " + fruitShop.containsKey("George"));
        System.out.println("fruitShop.containsValue(orange) = " + fruitShop.containsValue(orange));

        System.out.println("_____________________");
        for (String keyCustomer : fruitShop.keySet()) {
            System.out.println(keyCustomer + ": " + fruitShop.get(keyCustomer));

        }

        System.out.println("_____________________");
        for (Fruit values : fruitShop.values()) {
            System.out.println(values + ": " + fruitShop.get(values));
        }

        System.out.println("______________________");

        for (Map.Entry<String, Fruit> pair : fruitShop.entrySet()){
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }




    }
}
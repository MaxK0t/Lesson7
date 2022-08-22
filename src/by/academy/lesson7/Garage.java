package by.academy.lesson7;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    public static void main(String[] args) {

        Map<Car, Integer> map1 = new HashMap<>();

        Bmw bmw = new Bmw();
        Audi audi = new Audi();
        Mercedes mercedes = new Mercedes();
        Bentley bentley = new Bentley();

        map1.put(bmw, 2);

        map1.put(audi, 1);

        map1.put(bentley, 3);

        map1.put(mercedes, 1);


        for (Map.Entry<Car, Integer> entry : map1.entrySet()) {
            System.out.println(map1.containsKey(bentley) + " " + entry.getKey() + " " + entry.getValue());
        }

    }
}

package homework2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Array lists
        ArrayList fruits = new ArrayList();
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println(fruits);
        fruits.remove("Apple");
        System.out.println(fruits);
        System.out.println("============");

        ArrayList cars = new ArrayList();
        cars.add("Lambo");
        cars.add("Ferrari");
        cars.add("Pagani");
        cars.add("Buggati");
        cars.add("McLaren");
        System.out.println(cars);
        cars.remove("McLaren");
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);
        cars.add("Rolls Royce");
        System.out.println(cars);

    }
}

//A HashSet is a collection where every element is unique - no duplicates are allowed.

import java.util.HashSet;

public class DS_HashSet{
    public static void main(String args[]){
        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Volvo");
        System.out.println(cars);//[Volvo, BMW]

    }
}
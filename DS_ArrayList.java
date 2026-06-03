//An ArrayList is a resizable array that can grow as needed.
import java.util.ArrayList;

public class DS_ArrayList {
    public static void main(String args[]){

        ArrayList<String> cars = new ArrayList<>();
        
        cars.add("Volvo");
        cars.add("BMW");
        System.out.println(cars); //[Volvo, BMW]
        
        for(String i: cars){
            System.out.println(i);
        }

        int n = cars.size();

        for(int i = 0; i < n; i++){
            System.out.println(cars.get(i));
        }
    }
}

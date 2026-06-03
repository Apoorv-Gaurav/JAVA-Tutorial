import java.util.HashMap;
import java.util.Map;

public class DS_HashMap {
    public static void main(String args[]){
        HashMap<String, Integer> cars = new HashMap<>();
        cars.put("volvo",1);
        cars.put("BMW",2);
        cars.put("Bfdsg",3);

        cars.remove("BMW");
        
        System.out.println(cars); //    
        System.out.println(cars.get("volvo")); // 1

        //Iteration
        for(Map.Entry<String, Integer> entry: cars.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        //cars.keySet()
        //cars.values()
        //hm.get(key)  => return the value
        //hm.isEmpty()


        //hm.containsKey(key);
        //hm.containsValue(value);
        //hm.entrySet();


    }
}

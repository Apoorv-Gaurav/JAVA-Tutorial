import java.util.Random;

public class day3_Random {
    public static void main(String args[]){
        System.out.println("Hello 😊");  // win + ;
        
        Random random = new Random();
        int num = random.nextInt();  //large numbers
        System.out.println(num); 

        int num2 = random.nextInt(1,7); //1-6
        System.out.println(num2);

        double num3 = random.nextDouble(); //0 - 1
        System.out.println(num3);

        boolean toss = random.nextBoolean();
        System.out.println(toss);

    }
}

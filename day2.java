import java.util.Scanner;


public class day2 {
    public static void main(String args[]){
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = scan.nextLine();

        int age = scan.nextInt();

        System.out.println("Hello " + name);
        System.out.println("Age: "+ age);

        //Common Issue

        System.out.println("Enter colour: ");
        //---------------------
        scan.nextLine();
        //------------------
        String col = scan.nextLine();
        System.out.println("Color: "+col);

        String name2 = scan.nextLine();
        
        if(name2.isEmpty()){
            System.out.println("Havent entered name 😁😡");
        }
        scan.close();
    }
}

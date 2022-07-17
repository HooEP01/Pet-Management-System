import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // arraylist
        ArrayList<Pet> pet = new ArrayList<Pet>();

        // scanner input
        String name = "";
        String type = "";
        String coatColor = "";
        Double weight = 0.0;

        while(true){
            // output name
            System.out.printf("%-15s: ","name");
            name = scanner.nextLine();

            // if name = "STOP"
            if(name.equalsIgnoreCase("STOP")){
                for(int i = 0; i < pet.size(); i++){
                    System.out.print(pet.get(i).toString());
                }
                // stop while loop
                break;
            }
            
            // output type (cat(c) or dog(d))
            System.out.printf("%-15s: ","type (C/D)");
            type = scanner.nextLine();

            // if type = Cat
            if(type.equalsIgnoreCase("C")){
                System.out.printf("%-15s: ","coat color");
                coatColor = scanner.nextLine();
                pet.add(new Cat(name, coatColor));
            // if type = Dog
            }else if(type.equalsIgnoreCase("D")){
                System.out.printf("%-15s: ","weight");
                weight = scanner.nextDouble();
                scanner.nextLine();
                pet.add(new Dog(name, weight));
            }
        }
        
    }
}

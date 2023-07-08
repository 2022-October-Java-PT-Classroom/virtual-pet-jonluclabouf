package virtual_pet;
import java.util.Scanner;


public class VirtualPetApplication {

    public static void main(String[] args) {
        VirtualPet pet = new VirtualPet("Max", "Always has something in his hair", "Organic", "Dog", "Male");

        Scanner actions = new Scanner(System.in);
        while (true) {
            System.out.println("");
            System.out.println("Pet name: " + pet.getName());
            System.out.println("Hunger: " + pet.getHunger());
            System.out.println("Thirst: " + pet.getThirst());
            System.out.println("Energy: " + pet.getEnergy());
            System.out.println("Happiness: " + pet.getHappiness());
            System.out.println("--------------------");

            System.out.print("What do you want to do? (feed/water/play/sleep/quit): ");
            String action = actions.nextLine();

            if (action.equals("feed")) {
                pet.feed();
            } else if (action.equals("water")) {
                pet.water();
            } else if (action.equals("play")) {
                pet.play();
            } else if (action.equals("sleep")) {
                pet.sleep();
            } else if (action.equals("quit")) {
                break;
            }
            
            pet.tick();
            pet.check();
        }
        actions.close();
    }
    
}


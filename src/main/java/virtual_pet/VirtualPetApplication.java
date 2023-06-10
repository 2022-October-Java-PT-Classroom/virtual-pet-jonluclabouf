package virtual_pet;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        VirtualPet pet = new VirtualPet("Max");

        
        while (true) {
            System.out.println("Pet name: " + pet.name);
            System.out.println("Hunger: " + pet.hunger);
            System.out.println("Thirst: " + pet.thirst);
            System.out.println("Energy: " + pet.energy);
            System.out.println("Happiness: " + pet.happiness);
            System.out.println("--------------------");

            Scanner actions = new Scanner(System.in);
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
        }

    }
}


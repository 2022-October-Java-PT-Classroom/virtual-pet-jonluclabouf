package virtual_pet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
     Map<String, VirtualPet> pets = new HashMap<>();

    public ArrayList<VirtualPet> getAllPets() {
        ArrayList<VirtualPet> petsInArray = new ArrayList<>(pets.values());
        return petsInArray;
    }

    public VirtualPet getPet(String name) {
        return pets.get(name);
    }

    public void add(VirtualPet addNewPet) {
        pets.put(addNewPet.getName(), addNewPet);
    }

    public void Adopt(VirtualPet pet) {
        pets.remove(pet.getName(), pet);
    }

    public void feedAllPets() {
        System.out.println("Ok bringing out the food.");
        for (VirtualPet pet : pets.values()) {
            pet.feedAll();
        }
    }

    public void waterAllPets() {
        System.out.println("Ok bringing out the water.");
        for (VirtualPet pet : pets.values()) {
            pet.waterAll();
        }
    }

    public void playWithAPet(String name) {
        VirtualPet playPet = new VirtualPet();
        playPet = pets.get(name);
        playPet.play();
    }

    public void showPetNamesAndStats() {
        System.out.println("Name      Description                    Hunger  Happiness  Energy  Thirst");
        for (VirtualPet pet : pets.values()) {
            System.out.println((addWhiteSpace(pet.getName(), 10)) + (addWhiteSpace(pet.getDescription(), 35)) 
            + (addWhiteSpace(pet.getHunger(), 8)) + (addWhiteSpace(pet.getHappiness(), 8)) 
            + (addWhiteSpace(pet.getEnergy(), 8)) + (addWhiteSpace(pet.getThirst(), 8)));


        }
    }

    public void showPetNamesAndDescriptions() {
        for (VirtualPet pet : pets.values()) {
            System.out.println(" " + addWhiteSpace(pet.getName(), 10) + " " + pet.getDescription());
        }
    }

    public static String addWhiteSpace(String inputStr, int wholeSpace) {
        String outputStr = "";
        outputStr = inputStr + " ".repeat(wholeSpace - inputStr.length());
        return outputStr;
    }

    public static String addWhiteSpace(int inputInt, int wholeSpace) {
        String outputStr = "";
        String inputStr = String.valueOf(inputInt);
        outputStr = inputStr + " ".repeat(wholeSpace - inputStr.length());
        return outputStr;
    }
}

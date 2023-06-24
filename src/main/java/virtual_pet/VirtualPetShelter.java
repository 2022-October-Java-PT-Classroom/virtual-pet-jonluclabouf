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
        for (VirtualPet pet : pets.values()) {
            System.out.println("Name: " + pet.getName() + " Description: " + pet.getDescription() + " Hunger: " + pet.getHunger() + " Happiness: " + pet.getHappiness() + " Energy: " + pet.getEnergy() + " Thirst: " + pet.getThirst());
        }
    }

    public void showPetNamesAndDescriptions() {
        for (VirtualPet pet : pets.values()) {
            System.out.println(" " + pet.getName() + " " + pet.getDescription());
        }
    }
}

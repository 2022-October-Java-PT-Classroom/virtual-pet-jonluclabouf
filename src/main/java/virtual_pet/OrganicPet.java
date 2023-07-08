package virtual_pet;

public class OrganicPet extends VirtualPet {
    public OrganicPet(String name, String description, String lifeType, String animalType, String gender) {
        super(name, description, lifeType, animalType, gender);
    }

    public void feedAll() {
        hunger -= 10;
        thirst += 5;
        energy += 5;
        happiness += 5;
        health += 5;
    }

    public void healAll() {
        health += 50;
        happiness += 20;
    }
}

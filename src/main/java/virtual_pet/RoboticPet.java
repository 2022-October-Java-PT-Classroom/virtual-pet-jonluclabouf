package virtual_pet;

public class RoboticPet extends VirtualPet {
    public RoboticPet(String name, String description, String lifeType, String animalType, String gender) {
        super(name, description, lifeType, animalType, gender);
    }

    public void oilAll() {
        health += 100;
        happiness += 20;
    }
}

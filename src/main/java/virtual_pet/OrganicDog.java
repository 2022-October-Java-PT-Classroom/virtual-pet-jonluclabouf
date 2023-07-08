package virtual_pet;

public class OrganicDog extends OrganicPet{
    public OrganicDog(String name, String description, String lifeType, String animalType, String gender) {
        super(name, description, lifeType, animalType, gender);
    }

    public void walkAll() {
        hunger += 5;
        thirst += 10;
        energy -= 10;
        happiness += 10;
        health += 5;
        dogCage += 5;
    }
}

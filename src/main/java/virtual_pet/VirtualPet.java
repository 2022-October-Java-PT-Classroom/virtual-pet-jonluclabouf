package virtual_pet;

public class VirtualPet {
    private String name;
    private int hunger;
    private int thirst;
    private int energy;
    private int happiness;

public Pet (String name, int hunger, int thirst, int energy, int happiness) {
    this.name = name;
    this.hunger = hunger;
    this.thirst = thirst;
    this.energy = energy;
    this.happiness = happiness;
}

    public VirtualPet(String name) {
        this.name = name;
        this.hunger = 50;
        this.thirst = 50;
        this.energy = 50;
        this.happiness = 50;
    }

    public void feed() {
        hunger -= 10;
        thirst += 5;
        energy += 5;
        happiness += 5;
    }

    public void water() {
        thirst -= 10;
        hunger += 5;
        energy += 5;
        happiness += 5;
    }

    public void play() {
        hunger += 5;
        thirst += 5;
        energy -= 10;
        happiness += 10;
    }

    public void sleep() {
        hunger += 5;
        thirst += 5;
        energy += 10;
        happiness += 5;
    }

    public void tick() {
        hunger += 5;
        thirst += 5;
        energy -= 5;
        happiness -= 5;

        hunger = Math.min(100, Math.max(0, hunger));
        thirst = Math.min(100, Math.max(0, thirst));
        energy = Math.min(100, Math.max(0, energy));
        happiness = Math.min(100, Math.max(0, happiness));
    }
}

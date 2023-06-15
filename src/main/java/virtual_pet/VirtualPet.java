package virtual_pet;

public class VirtualPet {
    private String name;
    private int hunger;
    private int thirst;
    private int energy;
    private int happiness;

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getEnergy() {
        return energy;
    }

    public int getHappiness() {
        return happiness;
    }


// public Pet (String name, int hunger, int thirst, int energy, int happiness) {
//     this.name = name;
//     this.hunger = hunger;
//     this.thirst = thirst;
//     this.energy = energy;
//     this.happiness = happiness;
// }

    public VirtualPet(String name) {
        this.name = name;
        this.hunger = 30;
        this.thirst = 30;
        this.energy = 100;
        this.happiness = 100;
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

    public void check() {
        if (hunger > 85) {
            System.out.println("  FEED ME");
        }

        if (thirst > 85) {
            System.out.println("  I'm thirsty.");
        }

        if (energy < 15) {
            System.out.println("  I need a nap.");
        }

        if (happiness < 15) {
            System.out.println("  Can we go to the park?");
        }
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

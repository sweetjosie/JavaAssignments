public class Bat extends Mammal {
    // private int energyLevel = 300; // not being used @ override?

    // @Override // not liking this either
    // public int displayEnergy(int energyLevel) {
    // int energyLevel = 300;
    // System.out.println("Your mammal's energy level is at" + energyLevel);
    // return energyLevel;
    // }

    public Bat() {
    }

    public Bat(int energyLevel) {
        super(energyLevel);
        energyLevel = 300;
    }

    public void fly() {

        if (energyLevel < 50) {
            System.out.println("Can't Fly must eat more crunchy humans!");
        } else {
            System.out.println("Woosh! What is that? Is it a bird? Is it a plane? No! It's a monster bat!");
            energyLevel -= 50;
        }

    }

    public void eatPeople() {
        energyLevel += 25;
        System.out.println("Crunch crunch crunch... Me needs moreee!!!");

    }

    public void attack() {
        energyLevel -= 100;
        System.out.println("AAAAhhhh run for your lives!!!");

    }
}

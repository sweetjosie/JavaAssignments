public class Bat extends Mammal {
    // private int energyLevel = 300; // not being used @ override?

    // @Override // not liking this either
    // public int displayEnergy(int energyLevel) {
    // int energyLevel = 300;
    // System.out.println("Your mammal's energy level is at" + energyLevel);
    // return energyLevel;
    // }

    public int fly(int energyLevel) {

        System.out.println("Woosh! What is that? Is it a bird? Is it a plane? No! It's a monster bat!");
        if (energyLevel < 50) {
            System.out.println("Can't Fly must eat more crunchy humans");
        } else {
            energyLevel -= 50;
        }
        return energyLevel;
    }

    public int eatPeople(int energyLevel) {
        energyLevel += 25;
        System.out.println("Crunch crunch crunch... Me needs moreee!!!");

        return energyLevel;
    }

    public int attack(int energyLevel) {
        energyLevel -= 10;
        System.out.println();

        return energyLevel;
    }
}

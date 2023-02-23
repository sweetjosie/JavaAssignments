public class Bat extends Mammal {

    public Bat() {
    }

    public Bat(int energyLevel) {
        super(energyLevel);// super(300) solution way

    }

    public void fly() {

        if (energyLevel < 50) {
            System.out.println("Can't fly must eat more crunchy humans!");
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
        System.out.println("AAAAhhhh run for your lives!!!The city is under attack!!!");

    }
}

public class Gorilla extends Mammal {

    public int throwStuff(int energyLevel) {

        System.out.println("whatch out! the gorilla is thowing something! His energy level is now at " + energyLevel);
        energyLevel -= 5;
        return energyLevel;
    }

    public void eatBananas(int energyLevel) {

        energyLevel += 10;
        System.out.println("Yummy Bananas!");

    }

    public void climb(int energyLevel) {
        energyLevel -= 10;
        System.out.println("The Gorilla is climbing the tree! His energy level is now at " + energyLevel);

    }

}

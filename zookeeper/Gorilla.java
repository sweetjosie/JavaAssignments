public class Gorilla extends Mammal {

    public Gorilla() {
    }

    public Gorilla(int energyLevel) {
        super(energyLevel);
    }

    public void throwStuff() {
        //
        System.out.println("whatch out! the gorilla is thowing something! ");
        // getEnergyLevel()

        energyLevel -= 5;

    }

    public void eatBananas() {

        energyLevel += 10;
        System.out.println("Yummy Bananas!");

    }

    public void climb() {
        energyLevel -= 10;
        System.out.println("The Gorilla is climbing the tree!");

    }

}

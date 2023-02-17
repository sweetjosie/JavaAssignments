public class Mammal {
    private int energyLevel = 100;

    public Mammal() {
    }

    public void displayEnergy(int energyLevel) {
        System.out.println("Your mammal's energy level is at" + energyLevel);

    }

    public int getEnergyLevel() {
        return this.energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

}
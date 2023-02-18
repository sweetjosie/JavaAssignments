public class Mammal {
    protected int energyLevel = 100;// suggested by the lightbulb

    public Mammal() {
    }

    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int displayEnergy() {
        System.out.println("Your mammal's energy level is at " + energyLevel);
        return energyLevel;
    }

    public int getEnergyLevel() {
        return this.energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

}
package Animals;

public class Hamster extends Animal{

    public Hamster(String name){
        super(name);
        super.imageRoute = "src/Assets/Hamster/Normal.jpg";
    }

    public void play(){
        double funny, energy, lifetime;
        funny = super.funnyPercentage;
        energy = super.energyPercentage;
        lifetime = super.lifetimePercentage;
        super.setFunnyPercentage(funny + 10.0);
        super.setEnergyPercentage(energy - 10.0);
        super.setLifetimePercentage();
    }

    public void eat(){
        double hunger, fun, lifetime;
        hunger = super.hungerPercentage;
        fun = super.funnyPercentage;
        lifetime = super.lifetimePercentage;
        super.setHungerPercentage(hunger - 10.0);
        super.setFunnyPercentage(fun - 10);
    }

    public void sleep(){
        double sleep, lifetime;
        sleep = super.energyPercentage;
        super.setEnergyPercentage(sleep + 10.0);
    }

    public void heal(){
        double health, lifetime;
        health = super.sicknessPercentage;
        super.setSicknessPercentage(health - 10.0);
    }
}

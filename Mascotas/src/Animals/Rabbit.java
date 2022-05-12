package Animals;

public class Rabbit extends Animal{

    public Rabbit(String name){
        super(name);
        super.imageRoute = "src/Assets/Rabbit/Normal.jpg";
    }

    public void play(){
        double funny, energy, lifetime, hunger, sickness;
        funny = super.funnyPercentage;
        energy = super.energyPercentage;
        lifetime = super.lifetimePercentage;
        hunger = super.hungerPercentage;
        sickness = super.getSicknessPercentage();
        super.setFunnyPercentage(funny + 10.0);
        super.setEnergyPercentage(energy - 10.0);
        super.setLifetimePercentage(lifetime + 5);
        super.setHungerPercentage(hunger + 10);
        super.setSicknessPercentage(sickness + 5);
    }

    public void eat(){
        double hunger, fun, lifetime;
        hunger = super.hungerPercentage;
        fun = super.funnyPercentage;
        lifetime = super.lifetimePercentage;
        super.setHungerPercentage(hunger - 10.0);
        super.setFunnyPercentage(fun - 10);
        super.setLifetimePercentage(lifetime + 5);
    }

    public void sleep(){
        double sleep, lifetime, fun;
        lifetime = super.lifetimePercentage;
        sleep = super.energyPercentage;
        fun = super.funnyPercentage;
        super.setEnergyPercentage(sleep + 10.0);
        super.setLifetimePercentage(lifetime + 5);
        super.setFunnyPercentage(fun - 10);
    }

    public void heal(){
        double health,
                lifetime = super.lifetimePercentage;
        health = super.sicknessPercentage;
        super.setSicknessPercentage(health - 10.0);
        super.setLifetimePercentage(lifetime + 5);
    }
}
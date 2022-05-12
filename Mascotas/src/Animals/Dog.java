package Animals;

public class Dog extends Animal{

    public Dog(String name){
        super(name);
        super.imageRoute = "src/Assets/Dog/Normal.png";
    }

    public void play(){
        double funny, energy, lifetime, hunger, sickness;
        funny = super.funnyPercentage;
        energy = super.energyPercentage;
        lifetime = super.lifetimePercentage;
        hunger = super.hungerPercentage;
        sickness = super.getSicknessPercentage();
        super.setFunnyPercentage(funny + 20.0);
        super.setEnergyPercentage(energy - 10.0);
        super.setLifetimePercentage(lifetime + 2);
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
        super.setLifetimePercentage(lifetime + 2);
    }

    public void sleep(){
        double sleep, lifetime, fun;
        lifetime = super.lifetimePercentage;
        sleep = super.energyPercentage;
        fun = super.funnyPercentage;
        super.setEnergyPercentage(sleep + 5.0);
        super.setLifetimePercentage(lifetime + 2);
        super.setFunnyPercentage(fun - 20);
    }

    public void heal(){
        double health,
                lifetime = super.lifetimePercentage;
        health = super.sicknessPercentage;
        super.setSicknessPercentage(health - 5.0);
        super.setLifetimePercentage(lifetime + 2);
    }
}

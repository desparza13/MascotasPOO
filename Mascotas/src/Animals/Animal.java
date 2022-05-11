package Animals;

public abstract class Animal {
    protected static final double MINIMUM_PERCENTAGE = 0.0;
    protected static final double MAXIMUM_PERCENTAGE = 100.0;

    protected String imageRoute;

    protected String name;
    protected double funnyPercentage;
    protected double hungerPercentage;
    protected double energyPercentage;
    protected double lifetimePercentage;
    protected double sicknessPercentage;

    public static final int imageResolution = 300;

    public String getImageRoute(){
        return this.imageRoute;
    }

    public void setImageRoute(String imageRoute){
        this.imageRoute = imageRoute;
    }

    public Animal(){
        setName("Generic pet test");
        setSicknessPercentage(0.0);
        setFunnyPercentage(100.0);
        setHungerPercentage(0.0);
        setEnergyPercentage(100.0);
        setLifetimePercentage(0.0);
    }

    public Animal(String name){
        setName(name);
        setSicknessPercentage(0.0);
        setFunnyPercentage(100.0);
        setHungerPercentage(0.0);
        setEnergyPercentage(100.0);
        setLifetimePercentage(0.0);
    }

    public void setName(String Name){
        this.name = Name;
    }

    public void setFunnyPercentage(double funnyPercentage){
        if(funnyPercentage >= MINIMUM_PERCENTAGE && funnyPercentage <= MAXIMUM_PERCENTAGE){
            this.funnyPercentage = funnyPercentage;
        }
    }

    public void setHungerPercentage(double hungerPercentage){
        if(hungerPercentage >= MINIMUM_PERCENTAGE && hungerPercentage <= MAXIMUM_PERCENTAGE){
            this.hungerPercentage = hungerPercentage;
        }
    }

    public void setEnergyPercentage(double energyPercentage){
        if(energyPercentage >= MINIMUM_PERCENTAGE && energyPercentage <= MAXIMUM_PERCENTAGE){
            this.energyPercentage = energyPercentage;
        }
    }

    public void setLifetimePercentage(double lifetimePercentage){
        if(lifetimePercentage >= MINIMUM_PERCENTAGE && lifetimePercentage <= MAXIMUM_PERCENTAGE){
            this.lifetimePercentage = lifetimePercentage;
        }
    }

    public void setSicknessPercentage(double sicknessPercentage){
        if(sicknessPercentage >= MINIMUM_PERCENTAGE && sicknessPercentage <= MAXIMUM_PERCENTAGE){
            this.sicknessPercentage = sicknessPercentage;
        }
    }

    public String getName(){
        return this.name;
    }


    public double getFunPercentage(){
        return this.funnyPercentage;
    }

    public double getHungerPercentage(){
        return this.hungerPercentage;
    }

    public double getEnergyPercentage(){
        return this.energyPercentage;
    }

    public double getLifetimePercentage(){
        return this.lifetimePercentage;
    }

    public double getSicknessPercentage(){
        return this.sicknessPercentage;
    }

    public abstract void play();
    public abstract void eat();
    public abstract void sleep();
    public abstract void heal();
}

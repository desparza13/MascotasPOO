package Animals;

public class Animal{
    protected static final double MINIMUM_PERCENTAGE = 0.0;
    protected static final double MAXIMUM_PERCENTAGE = 100.0;

    protected String name;
    protected String species;
    protected double funnyPercentage;
    protected double hungerPercentage;
    protected double energyPercentage;
    protected double lifetimePercentage;
    protected double sicknessPercentage;

    protected Animal(){
        setName("Generic pet test");
        setSpecies("Generic species input");
        setSicknessPercentage(0.0);
        setFunnyPercentage(100.0);
        setHungerPercentage(0.0);
        setEnergyPercentage(100.0);
        setLifetimePercentage(0.0);

    }

    protected Animal(String Name, String species){
        setName(Name);
        setSpecies("species");
        setSicknessPercentage(0.0);
        setFunnyPercentage(100.0);
        setHungerPercentage(0.0);
        setEnergyPercentage(100.0);
        setLifetimePercentage(0.0);
    }

    public void setName(String Name){
        this.name = Name;
    }

    public void setSpecies(String species){
        this.species = species;
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

    public String getSpecies(){
        return this.species;
    }

    public double getFunnyPercentage(){
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
}
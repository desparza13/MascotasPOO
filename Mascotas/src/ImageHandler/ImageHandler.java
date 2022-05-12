package ImageHandler;

import Animals.Animal;
import Animals.*;

public class ImageHandler {
    private String imageRoute;
    String pet;
    private String message;
    private static final int NORMAL = 0;
    private static final int BORED = 1;
    private static final int SICK = 2;
    private static final int SLEEPY = 3;

    public ImageHandler(Hamster hamster){
        this.pet = "Hamster";
    }

    public ImageHandler(Dog dog){
        this.pet = "Dog";
    }

    public ImageHandler(Rabbit rabbit){
        this.pet = "Rabbit";
    }

    public String getMessage(){
        return this.message;
    }

    public String setImage(Animal animal){
        int selected = analyzeData(animal.getFunPercentage(), animal.getEnergyPercentage(), animal.getHungerPercentage(),
                    animal.getSicknessPercentage(), animal.getLifetimePercentage());
        String newRoute;
        switch(selected){
            case NORMAL:
                newRoute = "src/Assets/"+this.pet+"/Normal.png";
                break;
            case BORED:
                newRoute = "src/Assets/"+this.pet+"/Bored.png";
                break;
            case SICK:
                newRoute = "src/Assets/"+this.pet+"/Sick.png";
                break;
            case SLEEPY:
                newRoute = "src/Assets/"+this.pet+"/Sleepy.png";
                break;
            default:
                newRoute = this.imageRoute;
                break;
        }
        return newRoute;
    }

    public int analyzeData(double fun, double energy, double hunger, double sickness, double lifetime){
        if (lifetime == 100) {
            System.exit(1);
        }

        if(fun < 50) {
            this.message = "I am bored";
            return BORED;
        }
        if(energy < 40) {
            this.message = "I want to sleep!";
            return SLEEPY;
        }
        if (sickness > 25) {
            this.message = "I think I'm gonna puke";
            return SICK;
        }

        if (hunger >= 40) {
            this.message = "I want to eat something";
            return NORMAL;
        } else {
            this.message = "I am okay";
            return NORMAL;
        }
    }
}

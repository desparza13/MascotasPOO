package ImageHandler;

import Animals.Animal;

public class ImageHandler {
    private String imageRoute;
    private static final int NORMAL = 0;
    private static final int BORED = 1;
    private static final int SICK = 2;
    private static final int SLEEPY = 3;

    public String setImage(Animal animal){
        int selected = analyzeData(animal.getFunPercentage(), animal.getEnergyPercentage(), animal.getHungerPercentage(),
                    animal.getSicknessPercentage(), animal.getLifetimePercentage());
        String newRoute;
        switch(selected){
            case NORMAL:
                newRoute = "src/Assets/Hamster/Normal.jpg";
                break;
            case BORED:
                newRoute = "src/Assets/Hamster/Bored.jpg";
                break;
            case SICK:
                newRoute = "src/Assets/Hamster/Sick.jpg";
                break;
            case SLEEPY:
                newRoute = "src/Assets/Hamster/Sleepy.jpg";
                break;
            default:
                newRoute = this.imageRoute;
                break;
        }
        return newRoute;
    }

    public int analyzeData(double fun, double energy, double hunger, double sickness, double lifetime){
        if(fun < 50 || energy < 50) {
            return BORED;
        } else if(energy < 20) {
            return SLEEPY;
        }else if (sickness > 70 && lifetime < 100) {
            return SICK;
        } else if (lifetime == 100) {
            System.exit(1);
        } else {
            return NORMAL;
        }
        return -1;
    }
}

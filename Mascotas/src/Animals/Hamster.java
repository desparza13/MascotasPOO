package Animals;

public class Hamster extends Animal{

    private String imageRoute;

    public Hamster(String name, String imageRoute){
        super(name);
        this.imageRoute = imageRoute;

    }

    public String getImageRoute(){
        return this.imageRoute;
    }

    public void setImageRoute(String imageRoute){
        this.imageRoute = imageRoute;
    }

    public void play(){

    }

    public void eat(){

    }

    public void sleep(){

    }

    public void heal(){

    }
}
